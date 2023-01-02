package com.example.fkentity.fk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FkPostRepository extends JpaRepository<FkPost, Long> {

    @Query("SELECT p FROM FkPost p JOIN FETCH p.fkMember")
    List<FkPost> findAll();
}
