package com.nagarro.nagp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class App1Controller {

    @Autowired
    private RestTemplate template;
    
    @GetMapping("/transform")
    public String getName(@RequestParam("name") final String name) {
      
        String transformedString = template.getForObject("http://localhost:8090/uppercase?string=" + name,
            String.class);

        return transformedString;
    }

}
