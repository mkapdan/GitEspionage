package com.kaptan.espionage.service;

import com.google.gson.Gson;
import com.kaptan.espionage.model.GitSecretInfos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.project13.maven.git.GitRepositoryState;

@RestController
public class GitInfoPublisher {

    @Autowired
    GitSecretInfos repositoryState;

    @GetMapping(path = "/info/version")
    public String gitInfosRetrieve(){
       return repositoryState.toJson();
    }
}
