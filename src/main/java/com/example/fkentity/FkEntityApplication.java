package com.example.fkentity;

import com.example.fkentity.fk.Bulk;
import com.example.fkentity.fk.BulkRepository;
import com.example.fkentity.noFk.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FkEntityApplication {

    public static void main(String[] args) {
        SpringApplication.run(FkEntityApplication.class, args);
    }

}
