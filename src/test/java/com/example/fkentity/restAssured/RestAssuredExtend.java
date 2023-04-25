package com.example.fkentity.restAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import javax.annotation.PostConstruct;

import static io.restassured.RestAssured.basic;

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestAssuredExtend {

    @LocalServerPort
    private int port;

    @PostConstruct
    public void init() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.port = port;
        RestAssured.basePath = "/api";
        RestAssured.authentication = basic("username", "password");

        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.addHeader("Bearer", "parameterValue");
        builder.setContentType("application/json");
        RequestSpecification requestSpec = builder.build();
        RestAssured.requestSpecification = requestSpec;

        ResponseSpecBuilder response = new ResponseSpecBuilder();
        response.expectStatusCode(200);
        ResponseSpecification responseSpec = response.build();
        RestAssured.responseSpecification = responseSpec;
        System.out.println("TEST");
        System.out.println("TEST";

    }

}
