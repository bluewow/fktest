package com.example.fkentity.fk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FkComment {
    @Id
    @GeneratedValue
    private Long id;
    private String body;

    @ManyToOne
    @JoinColumn(name = "fk_post_id", referencedColumnName = "fk_member_id", foreignKey = @ForeignKey(name = "fk_comment_post"))
    private FkMember fkMember;
}
