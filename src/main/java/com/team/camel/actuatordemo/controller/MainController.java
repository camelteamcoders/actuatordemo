package com.team.camel.actuatordemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by upasana.haveri on 12/13/2017.
 */
@RestController
@RequestMapping("/")
public class MainController {

    @RequestMapping(value="/main", produces="text/plain")
    public String main() {
        return "Actuator Demo Application";
    }

}



