package com.example.fkentity.testcontainer;

import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;


public class MysqlTestContainer {

    @Container
    MySQLContainer mySQLContainer = (MySQLContainer) new MySQLContainer("mysql:8")
            .withDatabaseName("customdb")
            .withUsername("kukim")
            .withPassword("1234");

}
