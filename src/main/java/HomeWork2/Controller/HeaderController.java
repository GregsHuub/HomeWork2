package HomeWork2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HeaderController {


    @GetMapping("/showUserAgent")
    public String showUser(Model model,@RequestHeader("user-agent") String userAgent){
    model.addAttribute("userAgent", userAgent);

        return "userAgent";



    }
}
