package com.netMaxx.NetMaxx.Controllers;

import com.netMaxx.NetMaxx.Entities.User;
import com.netMaxx.NetMaxx.Repository.UserRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserRegisterController {

    @Autowired
    private UserRepostitory userRepostitory;

    @PostMapping("/registerUser")
    public String openRegisterPage(@ModelAttribute User user){
        System.out.println(user.toString());
        userRepostitory.save(user);
        return "redirect:/";
    }


}
