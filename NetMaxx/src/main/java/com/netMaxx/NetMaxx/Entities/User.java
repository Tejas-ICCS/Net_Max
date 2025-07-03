package com.netMaxx.NetMaxx.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String userName;

    private String password;

    private String mobile;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] image;

    private List<Map<String, Date>> giftclaim;
}
