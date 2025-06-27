package com.netMaxx.NetMaxx.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String emailID;
    private String username;
    private String password;
    private String mobileNo;
    @Column(name = "image")
    private String imageUrl;
}
