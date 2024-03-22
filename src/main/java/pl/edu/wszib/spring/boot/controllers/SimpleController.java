package pl.edu.wszib.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.spring.boot.model.ParametersWrapper;

import java.util.List;
import java.util.Random;

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

    @RequestMapping(path = "/test5", method = RequestMethod.GET)
    public String test5() {
        return "form";
    }

    @RequestMapping(path = "/test5", method = RequestMethod.POST)
    public String test5_2(@RequestParam String name,
                          @RequestParam String surname,
                          @RequestParam int age,
                          @RequestParam String login) {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(login);
        return "index";
    }

    @RequestMapping(path = "/test6", method = RequestMethod.GET)
    public String test6(Model model) {
        List<String> names = List.of("Janusz", "Wiesiek", "Zbyszek", "Karol", "Dariusz");
        String randomName = names.get(new Random().nextInt(names.size()));
        model.addAttribute("imie", randomName);
        model.addAttribute("imiona", names);
        return "names";
    }

    @RequestMapping(path = "/test7", method = RequestMethod.GET)
    public String test7(Model model) {
        ParametersWrapper parametersWrapper = new ParametersWrapper();
        parametersWrapper.setP1("asdfasd");
        parametersWrapper.setP2("asdfasdf");
        System.out.println(parametersWrapper);
        model.addAttribute("object", parametersWrapper);
        return "form2";
    }

    @RequestMapping(path = "/test7", method = RequestMethod.POST)
    public String test7_2(@ModelAttribute ParametersWrapper parametersWrapper) {
        System.out.println(parametersWrapper);
        System.out.println(parametersWrapper.getP1());
        System.out.println(parametersWrapper.getP2());
        System.out.println(parametersWrapper.getP3());
        System.out.println(parametersWrapper.getP4());
        System.out.println(parametersWrapper.getP5());
        System.out.println(parametersWrapper.getP6());
        System.out.println(parametersWrapper.getP7());
        System.out.println(parametersWrapper.getP8());
        System.out.println(parametersWrapper.getP9());
        System.out.println(parametersWrapper.getP10());
        System.out.println(parametersWrapper.getP11());
        System.out.println(parametersWrapper.getP12());

        return "index";
    }
}
