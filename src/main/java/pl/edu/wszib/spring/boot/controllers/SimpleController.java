package pl.edu.wszib.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {

    @RequestMapping(path = "/test1", method = RequestMethod.GET)
    public String test1() {
        System.out.printf("Cos zadzialalo !!!");
        return "index";
    }
}
