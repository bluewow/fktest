package com.example.fkentity.fk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class FkPost {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "fk_member_id", foreignKey = @ForeignKey(name = "fk_post_member"))
    private FkMember fkMember;

    public FkPost(Long id, String title, FkMember fkMember) {
        this.id = id;
        this.title = title;
        this.fkMember = fkMember;
    }

    public FkPost(String title, FkMember fkMember) {
        this.title = title;
        this.fkMember = fkMember;
    }
}
