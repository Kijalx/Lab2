package ie.atu.Lab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate/")
    @ResponseBody
    public String calculator(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
        int ans = 0;
        switch (operation){
            case "add":
                ans = num1+num2;
            case "subtract":
                ans = num1-num2;
            case "multiply":
                ans = num1*num2;
            case "divide":
                ans = num1/num2;
        }
        return "Operation: " + operation + " total: " +ans;
    }
}
