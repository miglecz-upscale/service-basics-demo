package com.upscale.labs.service.demo.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
    @Deprecated
    //use v2 instead
    @GetMapping("/api/v1/items")
    String items() {
        System.out.println("GET /api/v1/items");
        return "Hello, World!";
    }

    @GetMapping("/api/v2/items")
    String items_v2() {
        System.out.println("GET /api/v2/items");
        return "Hello World!";
    }

    @PostMapping("/api/v1/items")
    String items(@RequestBody final String in) {
        System.out.println("POST /api/v1/items body=" + in);
        return in;
    }

    @GetMapping("/api/v1/alma")
    String alma() {
        System.out.println("GET /api/v1/alma");
        return "{\"color\":\"piros\"}";
    }
}
