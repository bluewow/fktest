package com.example.fkentity.fk;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FkMember {

    @Id @GeneratedValue
    private Long id;

    String name;
}
