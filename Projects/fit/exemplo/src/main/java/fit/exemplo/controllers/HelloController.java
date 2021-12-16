package fit.exemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// {myapp.com}/Hello
// http://localhost:8080/Hello

@RestController
@RequestMapping("Hello")
public class HelloController{
    @GetMapping
    public String index(){
        return "Hello World";
    }
}