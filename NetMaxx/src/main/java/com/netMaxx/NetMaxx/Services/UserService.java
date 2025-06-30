package com.netMaxx.NetMaxx.Services;

import com.netMaxx.NetMaxx.Entities.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();
    public  void saveUser(User user);
    public User getUser(long id,String username,String email);
    public void deleteUser(long id);
}
