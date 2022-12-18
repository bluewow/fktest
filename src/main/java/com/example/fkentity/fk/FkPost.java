package com.example.fkentity.fk;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
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
}
