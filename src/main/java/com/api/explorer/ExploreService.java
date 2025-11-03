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
    @Autowired
    private Explorerapi explorerapi;
    private Users users;
    private String resultapi;

    public Users getUsermodel(String username){
        System.out.println("inside getUsermodel"+username);
        System.out.println(explorerRespository.getUser(username));
        return null;
    }
    public List getRepoall(){
        System.out.println(explorerapi.getApiallRepoofuser());
        return explorerapi.getApiallRepoofuser();

    }
}
