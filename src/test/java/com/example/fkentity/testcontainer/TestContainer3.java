package com.example.fkentity.testcontainer;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.testcontainers.junit.jupiter.Testcontainers;

@Slf4j
public class TestContainer3 extends MysqlTestContainer{

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

    @Test
    void test2() {
        log.info("======== 2 ========== ");
        log.info("로그 getJdbcDriverInstance {} ", mySQLContainer.getJdbcDriverInstance());
        log.info("로그 getJdbcUrl {} ", mySQLContainer.getJdbcUrl());
        log.info("로그 getMappedPort {} ", mySQLContainer.getMappedPort(3306));
        log.info("로그 getHost {} ", mySQLContainer.getHost());
        log.info("로그 getUsername {} ", mySQLContainer.getUsername());
        log.info("로그 getPassword {} ", mySQLContainer.getPassword());
    }


    @Test
    void test3() {
        log.info("======== 3 ========== ");
        log.info("로그 getJdbcDriverInstance {} ", mySQLContainer.getJdbcDriverInstance());
        log.info("로그 getJdbcUrl {} ", mySQLContainer.getJdbcUrl());
        log.info("로그 getMappedPort {} ", mySQLContainer.getMappedPort(3306));
        log.info("로그 getHost {} ", mySQLContainer.getHost());
        log.info("로그 getUsername {} ", mySQLContainer.getUsername());
        log.info("로그 getPassword {} ", mySQLContainer.getPassword());
    }

    @Test
    void test4() {
        log.info("======== 4 ========== ");
        log.info("로그 getJdbcDriverInstance {} ", mySQLContainer.getJdbcDriverInstance());
        log.info("로그 getJdbcUrl {} ", mySQLContainer.getJdbcUrl());
        log.info("로그 getMappedPort {} ", mySQLContainer.getMappedPort(3306));
        log.info("로그 getHost {} ", mySQLContainer.getHost());
        log.info("로그 getUsername {} ", mySQLContainer.getUsername());
        log.info("로그 getPassword {} ", mySQLContainer.getPassword());
    }

    @Test
    void test5() {
        log.info("======== 5 ========== ");
        log.info("로그 getJdbcDriverInstance {} ", mySQLContainer.getJdbcDriverInstance());
        log.info("로그 getJdbcUrl {} ", mySQLContainer.getJdbcUrl());
        log.info("로그 getMappedPort {} ", mySQLContainer.getMappedPort(3306));
        log.info("로그 getHost {} ", mySQLContainer.getHost());
        log.info("로그 getUsername {} ", mySQLContainer.getUsername());
        log.info("로그 getPassword {} ", mySQLContainer.getPassword());
    }

    @Test
    void test6() {
        log.info("======== 6 ========== ");
        log.info("로그 getJdbcDriverInstance {} ", mySQLContainer.getJdbcDriverInstance());
        log.info("로그 getJdbcUrl {} ", mySQLContainer.getJdbcUrl());
        log.info("로그 getMappedPort {} ", mySQLContainer.getMappedPort(3306));
        log.info("로그 getHost {} ", mySQLContainer.getHost());
        log.info("로그 getUsername {} ", mySQLContainer.getUsername());
        log.info("로그 getPassword {} ", mySQLContainer.getPassword());
    }

    @Test
    void test7() {
        log.info("======== 7 ========== ");
        log.info("로그 getJdbcDriverInstance {} ", mySQLContainer.getJdbcDriverInstance());
        log.info("로그 getJdbcUrl {} ", mySQLContainer.getJdbcUrl());
        log.info("로그 getMappedPort {} ", mySQLContainer.getMappedPort(3306));
        log.info("로그 getHost {} ", mySQLContainer.getHost());
        log.info("로그 getUsername {} ", mySQLContainer.getUsername());
        log.info("로그 getPassword {} ", mySQLContainer.getPassword());
    }

    @Test
    void test8() {
        log.info("======== 8 ========== ");
        log.info("로그 getJdbcDriverInstance {} ", mySQLContainer.getJdbcDriverInstance());
        log.info("로그 getJdbcUrl {} ", mySQLContainer.getJdbcUrl());
        log.info("로그 getMappedPort {} ", mySQLContainer.getMappedPort(3306));
        log.info("로그 getHost {} ", mySQLContainer.getHost());
        log.info("로그 getUsername {} ", mySQLContainer.getUsername());
        log.info("로그 getPassword {} ", mySQLContainer.getPassword());
    }
}
