package com.itconnor.springboot.DAO;

import jakarta.persistence.*;

@Entity
@Table (name ="Student")
public class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    private long getID() {
        return id;
    }

}
