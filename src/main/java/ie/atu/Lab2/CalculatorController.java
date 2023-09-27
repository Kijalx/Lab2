package ie.atu.Lab2;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    @ResponseBody
    public String calculator(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
        int ans = 0;
        switch (operation){
            case "add":
                ans = num1+num2;
                break;
            case "subtract":
                ans = num1-num2;
                break;
            case "multiply":
                ans = num1*num2;
                break;
            case "divide":
                ans = num1/num2;
                break;
        }
        return "Operation: " + operation + " total: " + ans;
    }
}
