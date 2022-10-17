package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @GetMapping("/*")
    public String save(Model model, @RequestParam(value = "condiment", defaultValue = "") String[] condiment) {
        String str = "";
        for (String a : condiment) {
            str += a;
        }
        model.addAttribute("message", str);
        return "home";
    }

}
