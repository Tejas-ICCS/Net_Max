package com.netMaxx.NetMaxx.Services;

import com.netMaxx.NetMaxx.Entities.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface UserService {
    public String registerUser(String email,String name, String pass, String userName, String mobile, MultipartFile image) throws IOException;
     public boolean isUserNameAvailable(String userName);
    public boolean isEmailAvailable(String email);
}
