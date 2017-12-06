package com.kaptan.espionage.config;


import com.kaptan.espionage.model.GitSecretInfos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import pl.project13.maven.git.GitRepositoryState;

@Configuration
class CoreConfig {

    @Autowired
    Environment environment;

    @Bean
    public GitSecretInfos gitSecretInfos(){
        GitSecretInfos state = new GitSecretInfos();
        state.setBuildUserEmail(environment.getProperty("git.build.user.email"))
                .setBuildHost(environment.getProperty("git.build.host"))
                .setHasNotCommittedCode(environment.getProperty("git.dirty"))
                .setBranch(environment.getProperty("git.branch"))
                .setBuildTime(environment.getProperty("git.build.time"))
                .setBuildUserName(environment.getProperty("git.build.user.name"))
                .setCommitId(environment.getProperty("git.commit.id"))
                .setCommitIdAbbrev(environment.getProperty("git.commit.id.abbrev"))
                .setCommitMessageFull(environment.getProperty("git.commit.message.full"))
                .setCommitMessageShort(environment.getProperty("git.commit.message.short"))
                .setCommitUserName(environment.getProperty("git.commit.user.name"))
                .setCommitUserEmail(environment.getProperty("git.commit.user.email"))
                .setCommitTime(environment.getProperty("git.commit.time"))
                .setMavenProjectVersion(environment.getProperty("git.build.version"));

        return state;
    }

}