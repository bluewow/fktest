package com.example.fkentity.noFk;

import com.example.fkentity.fk.FkMember;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Member member;

    public Post(Long id, String title, Member member) {
        this.id = id;
        this.title = title;
        this.member = member;
    }

    public Post(String title, Member member) {
        this.title = title;
        this.member = member;
    }
}
