package shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // 메인페이지 매핑
    @GetMapping("/")
    public String main(){
        return  "main";
    }

}
