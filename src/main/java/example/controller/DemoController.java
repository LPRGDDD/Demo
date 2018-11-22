package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Created with IntelliJ IDEA.
 * User: Guo Di
 * Date: 2018-11-22
 * Time: 16:24
 */
@Controller
@RequestMapping("/home")
public class DemoController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
