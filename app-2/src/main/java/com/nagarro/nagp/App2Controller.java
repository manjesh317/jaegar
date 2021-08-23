package com.nagarro.nagp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {

    @RequestMapping("/uppercase")
    public String transform(@RequestParam("string") final String str) {
        return str.toUpperCase();
    }

}
