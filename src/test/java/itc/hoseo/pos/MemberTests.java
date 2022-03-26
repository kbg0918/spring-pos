package itc.hoseo.pos;

import itc.hoseo.pos.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import repository.MemberRepository;
import repository.impl.HashMapMemberRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MemberTests {
    MemberRepository repository = new HashMapMemberRepository();
    @Test
    void Test_김봉남() {
        Member m2 =  new Member().builder()
                .name("김봉남")
                .build();

        assertEquals("김봉남",m2.getName());
        assertEquals(null,m2.getAge());
    }

    @Test
    void Test_마봉필() {
        Member m3 = new Member(2,"111","마봉필","1231",30);

        assertEquals("마봉필", m3.getName());
        assertEquals(null,m3.getAge());

    }
    @Test
    void Test_hash(){

        repository.save(new Member(1,"h1h1","길동","1234",30));
        repository.save(new Member(2,"g111","길동1","1234",38));
        repository.save(new Member(3,"ggc1","길동2","1234",38));
        assertEquals(3,repository.allMembers().size());
        assertEquals(1,repository.findByName("길동2").size());


    }
    @Test
    void Test_name(){
        Member m = new Member(1,"gdgd","길동","1234",38);

        assertEquals("길동",m.getName());
        repository.findByName(m.getName());
        System.out.println(m.getName());
    }


}
