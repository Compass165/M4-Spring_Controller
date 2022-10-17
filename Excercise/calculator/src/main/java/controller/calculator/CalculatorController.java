package controller.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/*")
    public String calculator(Model model, @RequestParam(value = "first", defaultValue = "1") double first, @RequestParam(value = "second", defaultValue = "1") double second,
                             @RequestParam(value = "operator", defaultValue = "+") String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "x":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
        }
        model.addAttribute("result", result);
        return "home";
    }
}
