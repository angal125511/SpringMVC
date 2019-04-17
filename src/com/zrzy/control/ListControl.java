package com.zrzy.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/17
 * Time: 13:41
 */

@Controller
@RequestMapping("list")
public class ListControl {

    @RequestMapping("/toadd")
    public String toAdd(){

        System.out.println("toAdd=+++添加");
        return "add";
    }
}
