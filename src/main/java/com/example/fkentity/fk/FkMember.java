package com.example.fkentity.fk;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
public class FkMember {

    @Id @GeneratedValue
    private Long id;

    public String name;

    public FkMember(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public FkMember(String name) {
        this.name = name;
    }
}
