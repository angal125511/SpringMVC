package com.zrzy.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/17
 * Time: 13:21
 */

@Controller
@RequestMapping("model")
public class Model {

    @RequestMapping("query")
    public ModelAndView query(){

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("msg","这是一个spring模型");
        modelAndView.setViewName("model");

        return modelAndView;
    }

    @RequestMapping(value = "testParamaAndHeaders",params = {"username","password"})
    public String testParamaAndHeaders(@RequestParam(name = "username") String username){

        System.out.println("username");
        System.out.println("testParamaAndHeaders");
        return "success";
    }

    @RequestMapping(value = "testParama")
    public String testParama(@RequestParam(name = "username",required = false) String username){

        System.out.println("username======");
        return "success";

    }

    @RequestMapping(value = "testAnt/**/abc")
    public String testAnt(){

        System.out.println("testAnt-------");
        return "success";
    }
}
