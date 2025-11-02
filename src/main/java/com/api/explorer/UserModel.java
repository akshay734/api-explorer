package com.api.explorer;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserModel {
    private String name;
    private int age;
    private String phonenumber;

    public String getName(){
        return this.name;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "Name: "+name+" Phone Number : "+phonenumber+" Age : "+age+"\n";
    }
}
