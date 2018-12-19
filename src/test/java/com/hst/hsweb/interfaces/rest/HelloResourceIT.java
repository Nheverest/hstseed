package com.hst.hsweb.interfaces.rest;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

import io.restassured.response.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seedstack.seed.Configuration;
import org.seedstack.seed.Logging;
import org.seedstack.seed.testing.junit4.SeedITRunner;
import org.seedstack.seed.undertow.LaunchWithUndertow;
import org.slf4j.Logger;

@RunWith(SeedITRunner.class)
@LaunchWithUndertow
public class HelloResourceIT {

    @Logging
    private Logger log;

    @Configuration("runtime.rest.baseUrl")
    private String baseUrl;

    @Test
    public void testHelloWorld() throws Exception {
        log.info("baseUrl: {}", baseUrl);
        Response response = given()
                .auth().basic("demo", "demo")
                .expect().statusCode(200)
                .when().get(baseUrl + "/hello");

        assertThat(response.body().asString()).isEqualTo("Hello World!");
    }
}
