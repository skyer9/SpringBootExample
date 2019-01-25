package kr.co.episode.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    @Column(name = "name")
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "team_seq")  // @ManyToOne 의 fetch 기본전략은 EAGER 이다.
    private Team team;

    public Member(Team team, String name) {
        this.team = team;
        this.name = name;
    }
}
