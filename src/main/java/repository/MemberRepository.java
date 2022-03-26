package repository;

import itc.hoseo.pos.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    public Optional<Member> findById(String id);
    public List<Member> findByName(String name);
    public void save(Member member);
    public List<Member> allMembers();
}
