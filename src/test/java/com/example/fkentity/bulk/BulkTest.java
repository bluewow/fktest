package com.example.fkentity.bulk;

import com.example.fkentity.fk.Bulk;
import com.example.fkentity.fk.BulkRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

@ActiveProfiles("test")
@SpringBootTest
public class BulkTest {

    @Autowired
    BulkRepository bulkRepository;


    @Test
    void test() {
        List<Bulk> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Bulk(String.valueOf(i)));
        }
        bulkRepository.saveAll(list);
    }

}
