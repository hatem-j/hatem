package com.jfouad.citest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.isNull;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(@RequestParam(value = "name", required = false) String name) {
        return isNull(name) ? "Hello world !" : "Hello " + name;
    }

}