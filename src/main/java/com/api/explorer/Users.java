package com.api.explorer;

import jakarta.persistence.*;

@Entity
@Table(name="Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String username;
    String Phonenumber;
    int age;

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getName() {
        return username;
    }
}
