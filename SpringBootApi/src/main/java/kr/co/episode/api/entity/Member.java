package kr.co.episode.api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity(name = "tbl_member")
public class Member {
    @Id
    @GeneratedValue
    Long id;

    String name;

    String username;

    String remark;

    public Member(String name, String username, String remark) {
        this.name = name;
        this.username = username;
        this.remark = remark;
    }
}
