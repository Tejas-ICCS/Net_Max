package com.netMaxx.NetMaxx.Services.ServiceImpl;

import com.netMaxx.NetMaxx.Entities.User;
import com.netMaxx.NetMaxx.Repository.UserRepostitory;
import com.netMaxx.NetMaxx.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserRepostitory userRepo;

    @Override
    public boolean isUserNameAvailable(String username)
    {
        return !userRepo.existByUserName(username);
    }

    @Override
    public boolean isEmailAvailable(String email)
    {
        return !userRepo.existByEmail(email);
    }

    @Override
    public String registerUser(String email,String name, String pass, String userName, String mobile, MultipartFile image) {
        try {
            if (!isEmailAvailable(email)) {
                return "Email Already Exists !";
            }

            if (!isEmailAvailable(userName)) {
                return "UserName Already Exists !";
            }
            User user = new User();
            user.setUserName(userName);
            user.setName(name);
            user.setEmail(email);
            user.setPassword(pass);
            user.setMobile(mobile);
            user.setImage(image.getBytes());
            userRepo.save(user);
            return "User Register SuccessFully !";
        } catch (Exception e) {
             return "Error : "+e.getMessage();
        }
    }



}
