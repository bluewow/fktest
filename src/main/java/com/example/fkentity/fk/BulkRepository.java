package com.example.fkentity.fk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BulkRepository extends JpaRepository<Bulk, Long> {

//    @Modifying
//    @Query(value = "insert into bulk (name) values (:name)", nativeQuery = true)
//    void saveCustom(@Param("name") String name);
}
