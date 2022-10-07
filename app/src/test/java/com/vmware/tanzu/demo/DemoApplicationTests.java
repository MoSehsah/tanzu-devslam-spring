package com.vmware.tanzu.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {
    @Autowired
    private TestRestTemplate client;

    @Test
    void contextLoads() {
    }

    @Test
    void index() {
        final var greetings = client.getForEntity("/", String.class).getBody();
        assertThat(greetings).isNotEmpty();
    }
}
