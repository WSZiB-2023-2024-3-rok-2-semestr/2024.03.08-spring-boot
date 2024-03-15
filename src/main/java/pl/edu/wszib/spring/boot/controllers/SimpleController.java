package pl.edu.wszib.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {

    @RequestMapping(path = "/test1", method = RequestMethod.GET)
    public String test1() {
        System.out.printf("Cos zadzialalo !!!");
        return "index";
    }

    @RequestMapping(path = "/test2", method = RequestMethod.GET)
    public String test2(@RequestParam("x") String imie,
                        @RequestParam("y") String nazwisko) {
        System.out.println(imie);
        System.out.println(nazwisko);
        return "index";
    }

    @RequestMapping(path = "/test3/{imie}/{nazwisko}/{wiek}", method = RequestMethod.GET)
    public String test3(@PathVariable String imie,
                        @PathVariable String nazwisko,
                        @PathVariable int wiek) {
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(wiek);

        return "index";
    }

    @RequestMapping(path = "/test4/{name}/{surname}", method = RequestMethod.GET)
    public String test4(@PathVariable String name,
                        @PathVariable String surname,
                        @RequestParam int age,
                        @RequestParam char sex) {

        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(sex);
        return "index";
    }
}
