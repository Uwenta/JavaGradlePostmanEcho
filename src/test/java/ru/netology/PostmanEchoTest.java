package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {



    @Test
    public void shouldPostRequest(){
        given()
                .baseUri("https://postman-echo.com")
                .body("I love You")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("I love me"))
        ;
    }
}
