package kr.co.episode.jpa.service;

import kr.co.episode.jpa.entity.Member;
import kr.co.episode.jpa.entity.Team;
import kr.co.episode.jpa.repository.MemberRepository;
import kr.co.episode.jpa.repository.TeamRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RepositoryServiceImpl implements RepositoryService {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TeamRepository teamRepository;

    public RepositoryServiceImpl() {
    }

    @Override
    public Team addTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team findTeamBySeq(int seq) {
        return teamRepository.getOne(seq);
    }

    @Override
    public Member addMember(Member member, int seq) {
        Team team = teamRepository.getOne(seq);
        Member saveEntity = new Member(team, member.getName());
        return memberRepository.save(saveEntity);
    }

    @Override
    public List<Team> findTeamAll() {
        return teamRepository.findAll();
    }
}
