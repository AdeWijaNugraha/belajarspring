package belajarspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    @GetMapping("/")
    public String hello(){
        return "Hello what the fu** World!!!";
    }
}
