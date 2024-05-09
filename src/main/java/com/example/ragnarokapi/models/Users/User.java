package com.example.ragnarokapi.models.Users;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "login")
@Entity(name = "login")
@Getter
@Setter
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long account_id;
    private String userid;
    private String user_pass;
    private String sex;
    private String email;

}