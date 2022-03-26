package itc.hoseo.pos;

import itc.hoseo.pos.domain.Item;
import itc.hoseo.pos.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import repository.ItemRspository;
import repository.MemberRepository;
import repository.impl.HashMapItemRepository;
import repository.impl.HashMapMemberRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ItemTests {
    ItemRspository ry = new HashMapItemRepository();
    @Test
    //추가
    void item() {

        Item i = new Item(1234,"휴지",3500,12);
        assertEquals(1234,i.getId());
        ry.addItem(i);
        System.out.println(ry.addItem(i));


    }
    @Test
    //삭제
    void deleteItem(){
        Item i2 = new Item(1234,"휴지",3500,12);
        ry.addItem(i2);
        ry.deleteItem(i2.getId());
        System.out.println("삭제완료");
    }

    @Test
    //찾기
    void findItem(){
        Item i3 = new Item(1234,"휴지",3500,12);
        assertEquals("휴지",i3.getName());
        ry.findItem(i3.getName());
    }


}