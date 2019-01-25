package kr.co.episode.jpa.service;

import kr.co.episode.jpa.entity.Member;
import kr.co.episode.jpa.entity.Team;

import java.util.List;

public interface RepositoryService {
    Team addTeam(Team team);
    Team findTeamBySeq(int seq);
    Member addMember(Member member, int seq);
    List<Team> findTeamAll();
}
