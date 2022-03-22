package shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memberController {

    @GetMapping("/member/signup")
    public String signup(){
     return "member/signup";
    }


}
