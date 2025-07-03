package com.netMaxx.NetMaxx.Controllers;

import com.netMaxx.NetMaxx.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/check-email")
    public Map<String, Boolean> checkUserName(@RequestParam String userName) {
        boolean available = userService.isUserNameAvailable(userName);
        return Map.of("Available", available);
    }

    @GetMapping("/check-username")
    public Map<String, Boolean> checkEmail(@RequestParam String email) {
        boolean available = userService.isEmailAvailable(email);
        return Map.of("Available", available);
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestParam String email, @RequestParam String name, @RequestParam String pass, @RequestParam String userName, @RequestParam String mobile, @RequestParam MultipartFile image) {
        try {
            String result = userService.registerUser(email, name, pass, userName, mobile, image);
            if (result.contains("SuccessFully")) {
                return ResponseEntity.ok(result);
            } else {
                return ResponseEntity.badRequest().body(result);
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Internal Server Error: " + e.getMessage());
        }
    }
}