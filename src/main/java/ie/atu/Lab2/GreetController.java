package ie.atu.Lab2;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetController {
    @GetMapping("/hello")
    public String helloUser(){
        return "Hello";
    }

    @GetMapping("/greet/{name}")
    public String greetUser(@PathVariable("name") String userName){
        return "Hello, " + userName;
    }
    @GetMapping("/details")
    @ResponseBody
    public String detailsUser(@RequestParam String name, @RequestParam int age){
        return "Hello," + name + " " + age;
    }
}
