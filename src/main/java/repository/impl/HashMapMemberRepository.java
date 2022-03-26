package repository.impl;

import itc.hoseo.pos.domain.Member;
import repository.MemberRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HashMapMemberRepository implements MemberRepository {
    private static final HashMapMemberRepository instance = new HashMapMemberRepository();

    public static HashMapMemberRepository getInstance(){
        return instance;
    }
    HashMap<String,Member> map = new HashMap<>();
    ArrayList<Member> list = new ArrayList<>();

    @Override
    public Optional<Member> findById(String id) {
        return Optional.of(map.get(id));
    }

    @Override
    public List<Member> findByName(String name) {
        for(Member m  : map.values()){
            if(name.equals(m.getName())){
                list.add(m);
            }
        }
        return list;

//        map.values().stream().filter(i->{
//            return name.equals(i.getName());
//        }).collect(Collectors.toList());


    }

    @Override
    public void save(Member member) {
        map.put(member.getId(), member);
    }

    @Override
    public List<Member> allMembers() {
        return new ArrayList<>(map.values());
    }
}
