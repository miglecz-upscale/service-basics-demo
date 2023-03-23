package com.upscale.labs.service.demo.basics;

import static com.google.common.truth.Truth.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ItemsControllerTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private TestRestTemplate restClient;

    @Test
    public void getItemsShouldReturnHelloWorld() {
        final ResponseEntity<String> response = restClient.getForEntity("/api/v1/items", String.class);
        assertThat(response.getBody()).isEqualTo("Hello, World!");
    }
}
