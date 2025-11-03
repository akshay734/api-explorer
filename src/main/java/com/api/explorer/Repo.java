package com.api.explorer;


public class Repo {
    public Integer id;
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString(){
        return "repo { id = " + id + " , name = " + name + "}";
    }
}