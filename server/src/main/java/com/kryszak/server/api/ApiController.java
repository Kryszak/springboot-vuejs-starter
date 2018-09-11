package com.kryszak.server.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
@RequestMapping("api")
public class ApiController {

    @GetMapping("/test")
    public String test() {
        return "Test hello!";
    }
}
