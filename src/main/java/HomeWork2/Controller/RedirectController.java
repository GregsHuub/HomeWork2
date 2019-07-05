package HomeWork2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RedirectController {


    @RequestMapping("/first")
    public String showFirst(){

        return "first";
    }

    @RequestMapping("/second")
    public String showSecond(HttpServletRequest request){


        return "redirect:third";
    }

    @RequestMapping("/third")
    public String showThird(){


        return "third";
    }
}
