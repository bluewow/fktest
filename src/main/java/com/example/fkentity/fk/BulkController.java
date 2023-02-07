package com.example.fkentity.fk;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BulkController {

    private final BulkRepository bulkRepository;
    private final JdbcTemplate jdbcTemplate;

    @Transactional
    @GetMapping("/map")
    public void test() {

//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            bulkRepository.saveCustom(String.valueOf(i));
//
//        }

        List<Bulk> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Bulk(String.valueOf(i)));
        }
        String sql = "insert into bulk (name) Values (?)";
        jdbcTemplate.batchUpdate(sql, list, 4,
                (PreparedStatement ps, Bulk bulk) -> {
                    ps.setString(1, bulk.getName());
                });

    }

}
