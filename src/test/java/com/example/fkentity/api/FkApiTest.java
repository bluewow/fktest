package com.example.fkentity.api;

import com.example.fkentity.fk.PostDto;
import com.navercorp.fixturemonkey.LabMonkey;
import com.navercorp.fixturemonkey.api.introspector.FieldReflectionArbitraryIntrospector;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.HeaderConfig;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.aspectj.lang.annotation.Before;
import org.hamcrest.Matchers.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FkApiTest {

    @LocalServerPort
    private int port;

    @BeforeEach
    public void setUp() {
        RestAssured.port = port;
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    LabMonkey labMonkey = LabMonkey.labMonkeyBuilder()
        .objectIntrospector(FieldReflectionArbitraryIntrospector.INSTANCE)
        .build();

    @Test
    void createPost() {
        PostDto postDto = labMonkey.giveMeOne(PostDto.class);

        ValidatableResponse then = RestAssured
            .given().contentType(ContentType.JSON).body(postDto)
            .when().post("/post/create")
            .then().statusCode(200);

        System.out.println(then);
    }

    @Test
    void getPost() {
        RequestSpecBuilder builder = new RequestSpecBuilder();
        RequestSpecification spec = builder.setContentType("application/json").build();

        PostDto postDto = labMonkey.giveMeOne(PostDto.class);
        String postId = RestAssured
            .given().spec(spec).body(postDto)
            .when().post("/post/create")
            .then().statusCode(200)
            .extract().response().print();


        PostDto expect = RestAssured
            .given().spec(spec).pathParam("postId", Long.parseLong(postId))
            .when().get("/post/{postId}")
            .then().statusCode(200)
            .extract().as(PostDto.class);

        System.out.println(postDto);
        System.out.println(expect);
    }
}
