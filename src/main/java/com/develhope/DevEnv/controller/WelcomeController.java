package com.develhope.DevEnv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {

    @Autowired
    Environment environment;

    @GetMapping
    public String returnNameCode(){
        String var=environment.getProperty("myCustomVarTree.DevName");
        String var2= environment.getProperty("myCustomVarTree.authCode");
        return var+" "+var2;
    }

}
