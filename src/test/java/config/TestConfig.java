package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;

public class TestConfig {
    @BeforeClass
    public static void setup() {
        RestAssured.baseURI="http://localhost";
        RestAssured.port=8080;


        RestAssured.requestSpecification = new RequestSpecBuilder().
                build();
    }
}
