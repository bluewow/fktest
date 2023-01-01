package com.example.fkentity.testcontainer;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Slf4j
@Testcontainers
public class TestContainer_repeat {

    @Container
    static MySQLContainer mySQLContainer = (MySQLContainer) new MySQLContainer("mysql:8")
        .withDatabaseName("customdb")
        .withUsername("kukim")
        .withPassword("1234");

    @RepeatedTest(10)
    @Test
    void test1() {
        log.info("======== 1 ========== ");
        log.info("로그 getJdbcDriverInstance {} ", mySQLContainer.getJdbcDriverInstance());
        log.info("로그 getJdbcUrl {} ", mySQLContainer.getJdbcUrl());
        log.info("로그 getMappedPort {} ", mySQLContainer.getMappedPort(3306));
        log.info("로그 getHost {} ", mySQLContainer.getHost());
        log.info("로그 getUsername {} ", mySQLContainer.getUsername());
        log.info("로그 getPassword {} ", mySQLContainer.getPassword());
    }


}
