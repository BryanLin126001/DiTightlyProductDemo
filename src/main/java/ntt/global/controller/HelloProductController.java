package ntt.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloProductController
{
    @RequestMapping("/")
    public String home()
    {

        return "HelloProduct";
    }
}
