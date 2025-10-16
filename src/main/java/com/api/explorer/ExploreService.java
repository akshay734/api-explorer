package com.api.explorer;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExploreService {
    @Autowired
    private UserModel userModel;
    @Autowired
    private ExplorerRespository explorerRespository;
    private Users users;

    public Users getUsermodel(String username){
        System.out.println("inside getUsermodel"+username);
        return explorerRespository.getUser(username);
//        userModel.setName(users.getName());
//        userModel.setPhonenumber(users.getPhonenumber());
//        userModel.setAge(users.getAge());
        //return userModel;

    }
}
