package it.develhope.middleware.Interceptor.Middleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LegacyController {

    @GetMapping("/legacy")
    public String getLegacy(){
        return "This is just old code";
    }

}
