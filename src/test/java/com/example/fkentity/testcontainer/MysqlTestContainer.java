package com.example.fkentity.testcontainer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.containers.startupcheck.OneShotStartupCheckStrategy;
import org.testcontainers.junit.jupiter.Container;

import java.time.Duration;

public class MysqlTestContainer {

    //    @Container
    MySQLContainer mySQLContainer = (MySQLContainer) new MySQLContainer("mysql:8")
            .withDatabaseName("customdb")
            .withUsername("kukim")
            .withPassword("1234");

    @BeforeEach
    void setUp() {
        mySQLContainer.start(); // 매 테스트 시작 시 컨테이너 시작
        Duration.ofSeconds(3);
    }

    @AfterEach
    void tearDown() {
        mySQLContainer.stop(); // 매 테스트 끝난 뒤 컨테이너 종료
    }



}
