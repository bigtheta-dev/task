package org.bigtheta.task.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetController {
    @RequestMapping(path= "/greet",method= RequestMethod.GET)
    public String greet(){
        return "greet";
    }
}
