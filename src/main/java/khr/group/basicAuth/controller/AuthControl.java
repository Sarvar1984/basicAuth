package khr.group.basicAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("secured")
public class AuthControl {

    @GetMapping
    public String print(){
        String text="Ishladi";
        return text;
    }

}
