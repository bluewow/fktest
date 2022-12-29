package com.example.fkentity.testcontainer;

import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;

public class MysqlTestContainer {

    @Container
    static MySQLContainer mySQLContainer = new MySQLContainer("mysql:8")
        .withDatabaseName("customdb")
        .withUsername("kukim")
        .withPassword("1234");
//        .withInitScript("learning.testcontainers/init.sql");; // MySQLContainer 객체 생성

}
