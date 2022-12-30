package com.example.fkentity.fk;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FkCommentRepository extends JpaRepository<FkComment, Long> {
}
