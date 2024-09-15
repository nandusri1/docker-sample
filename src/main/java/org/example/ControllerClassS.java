package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControllerClassS {

    @RequestMapping("/hello")
    @ResponseBody
    public String getRequest(){
        return "I am alive";
    }

}
