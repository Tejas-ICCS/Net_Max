package com.netMaxx.NetMaxx.Repository;

import com.netMaxx.NetMaxx.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostitory extends JpaRepository<User,Long> {
}
