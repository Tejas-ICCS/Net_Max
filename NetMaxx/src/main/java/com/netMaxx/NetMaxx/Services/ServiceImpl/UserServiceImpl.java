package com.netMaxx.NetMaxx.Services.ServiceImpl;

import com.netMaxx.NetMaxx.Entities.User;
import com.netMaxx.NetMaxx.Repository.UserRepostitory;
import com.netMaxx.NetMaxx.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserRepostitory userRepo;

    @Override
    public List<User> getAllUser() {
        return userRepo.getAllUsers();
    }

    @Override
    public void saveUser(@ModelAttribute User user){
        userRepo.save(user);
    }

    @Override
    public User getUser(long id,String username,String email){

    }
}
