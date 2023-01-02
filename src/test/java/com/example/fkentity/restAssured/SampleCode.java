package com.example.fkentity.restAssured;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class SampleCode extends RestAssuredExtend {

    @Test
    void test_rest_assured() {
        given()
            .when().get("/test")
            .then()
            .extract().response().print();

        given()
            .pathParam("postId", 1L)
            .when().get("/test/{postId}")
            .then()
            .extract().response().print();
    }
}
