package com.netMaxx.NetMaxx.Repository;

import com.netMaxx.NetMaxx.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepostitory extends JpaRepository<User,Long> {
    public List<User> getAllUsers();

    public List<User> findByUserNameContainingOrEmailContainingOrMobileContaining(String userName, String email, String mobile);

    public Boolean existByEmail(String email);

    public Boolean existByUserName(String userName);

}
