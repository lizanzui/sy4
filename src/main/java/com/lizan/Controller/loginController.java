package com.lizan.Controller;

import com.lizan.Entity.UserEntity;
import com.lizan.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: loginController
 * @Description: TODO
 * @author: 李赞
 * @date: 2020/12/7  6:49
 */
@Controller
public class loginController{
    @Autowired
    private userService userService;
    @RequestMapping("/login")
    public String login(@PathVariable("name") String name,@PathVariable("password")  String password){
        UserEntity finduser = userService.finduser(name, password);
        if (finduser != null){
            return "login";
        }else {
            return "registered";
        }
    }
}
