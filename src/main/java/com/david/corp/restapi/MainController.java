package com.david.corp.restapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainController {
    @GetMapping("/home")
    public String getMethodName() {
        return new String("Version 1");
    }
    


}
