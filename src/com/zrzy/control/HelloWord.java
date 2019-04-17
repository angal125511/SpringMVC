package com.zrzy.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/17
 * Time: 10:36
 */

@Controller
public class HelloWord {

    @RequestMapping("/helloword")
    public String hello(Model model){

        model.addAttribute("msg","后来的我们");
        System.out.println("HelloWord--->SpringMVC");
        return "hello";
    }

}
