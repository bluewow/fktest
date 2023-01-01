package com.example.fkentity.testcontainer;

import org.junit.jupiter.api.AfterEach;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class MysqlTestContainer {

    @Container
    MySQLContainer mySQLContainer = (MySQLContainer) new MySQLContainer("mysql:8")
            .withDatabaseName("customdb")
            .withUsername("kukim")
            .withPassword("1234");

}
