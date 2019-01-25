package kr.co.episode.jpa.repository;

import kr.co.episode.jpa.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
    //
}
