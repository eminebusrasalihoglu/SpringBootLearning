package com.FirstSpring.controller;

import org.springframework.web.bind.annotation.*;

//GetMapping PostMapping PutMapping PatchMapping DeleteMapping
// @RequestMapping(path = "/hello",method = RequestMethod.GET)
@RestController
@RequestMapping(path = "/api")
public class HelloController {
    @GetMapping(path="/hello")
    public String sayHello(){
        return "Hello World";
    }
    @GetMapping(path = "/name/{name}") // http://localhost:8080/api/name/busra
    public String getMyName(@PathVariable("name") String yourName){
        return "Your name is "+ yourName;
    }
    @GetMapping(path = "/surname") // http://localhost:8080/api/surname?surname=salihoglu
    public String getMySurname(@RequestParam("surname") String yourSurname){ //use key
        return "Your surname is "+ yourSurname;
    }
    @GetMapping({"/age", "/age/{age}"}) // http://localhost:8080/api/age or http://localhost:8080/api/age/23
    public String getMyAge(@PathVariable(name = "age", required = false) String yourAge){
        return "Your age is "+ yourAge;
    }
    @GetMapping(path = "/country") // http://localhost:8080/api/country?country=Turkey or http://localhost:8080/api/country
    public String getMyCountry(@RequestParam(name = "country", required = false, defaultValue = "default country") String yourCountry){ //use key
        return "Your country is "+ yourCountry;
    }
}
