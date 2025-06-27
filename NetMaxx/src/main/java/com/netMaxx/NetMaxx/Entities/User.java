package com.netMaxx.NetMaxx.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.angus.mail.iap.ByteArray;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String emailID;
    @Column(unique = true)
    private String username;
    private String password;
    private String mobileNo;
    @Column(columnDefinition = "LONGBLOB")
    @Lob
    private byte[] imageUrl;

}
