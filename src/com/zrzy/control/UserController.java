package com.zrzy.control;

import com.zrzy.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/17
 * Time: 16:28
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private static List<User> list = new ArrayList<>();
    static {
        list.add(new User(1,"admin111","admin111"));
        list.add(new User(2,"admin222","admin222"));
        list.add(new User(3,"admin333","admin333"));
        list.add(new User(4,"admin444","admin444"));
        list.add(new User(5,"adminshi","adminshi"));
        list.add(new User(6,"adminwen","adminwen"));
    }
    @RequestMapping("/list")
    public String query(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("list",list);
        return "/user/list";
    }

    @RequestMapping(value = "/save")
    public String add(User user){ // 添加

        Integer id = list.get(list.size() - 1).getId() + 1; //
        if(user.getId()==null){
            user.setId(id);
            list.add(user);
            System.out.println(user);
        } else {
            int index=-1;
            for (int i = 0;i < list.size(); i++){
               if(list.get(i).getId().equals(user.getId())){
                   index=i;
               }
            }

            if(index!=-1){
                System.out.println(index);
                list.set(index,user);
            }
        }

        return "redirect:/user/list";
    }
    @RequestMapping(value = "/update/{id}")
    public ModelAndView update(@PathVariable(name = "id") Integer id){


        User user = null;

        for (User info:list) {

            if(info.getId().equals(id)){
                user=info;
                break;
            }
        }

        ModelAndView modelAndView = new ModelAndView("/user/update");
        modelAndView.addObject("user",user );

        return modelAndView;
    }

    @RequestMapping(value = "/toadd")
   public String queryOne(){

       return "forward:/WEB-INF/view/user/update.jsp";
   }

    @RequestMapping(value = "/delete/{id}") // 删除
    public String delete(@PathVariable(name = "id") Integer id){

        System.out.println("删除-----"+id);
        User user = null;
        for (User info: list) {
            if(info.getId().equals(id)){
                user=info;
                break;
            }
        }
        list.remove(user);

        return "redirect:/user/list";
    }



}
