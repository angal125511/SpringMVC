package com.zrzy.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/17
 * Time: 13:30
 */
@Controller
@RequestMapping("china")
public class ChinaControl {

    @RequestMapping("query/{cid}")
    public String queryById(@PathVariable(name = "cid") String cid){

        System.out.println("cid===="+cid);
        return "success";
    }
}
