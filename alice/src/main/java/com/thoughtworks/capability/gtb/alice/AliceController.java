package com.thoughtworks.capability.gtb.alice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AliceController {

    @GetMapping("/hello")
    public String sayHello() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://bob:8081/hello";
        String hello = restTemplate.getForObject(url, String.class);
        return hello;
    }
}
