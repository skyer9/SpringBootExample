package kr.co.episode.jpa.repository;

import kr.co.episode.jpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    //
}
