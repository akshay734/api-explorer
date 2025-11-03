package com.api.explorer;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import org.springframework.stereotype.Component;
import java.io.IOException;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import com.api.explorer.Repo;
import java.util.*;

@Component
public class Explorerapi {


    //https://api.github.com/users/<USER-NAME>/repos
    private String github_url="https://api.github.com/users/akshay734/repos";
    //private String username="akshay734";

    public List<Repo> getApiallRepoofuser(){
        RestTemplate restTemplate = new RestTemplate();
        Repo[] repos =  restTemplate.getForObject(github_url,Repo[].class);
        return Arrays.asList(repos);

    }
}