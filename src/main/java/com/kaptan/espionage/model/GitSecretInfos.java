package com.kaptan.espionage.model;

import com.google.common.base.Joiner;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class GitSecretInfos {

    private String branch;
    private String commitId;
    private String commitIdAbbrev;
    private String buildUserName;
    private String buildUserEmail;
    private String buildTime;
    private String commitUserName;
    private String commitUserEmail;
    private String commitMessageFull;
    private String commitMessageShort;
    private String commitTime;
    private Set<String> tags;
    private String mavenProjectVersion;
    private String buildHost;
    private String hasNotCommittedCode;
    private String buildVersion;


    public String getBuildVersion() {
        return buildVersion;
    }

    public GitSecretInfos setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
        return this;
    }



    public String getHasNotCommittedCode() {
        return hasNotCommittedCode;
    }

    public GitSecretInfos setHasNotCommittedCode(String hasNotCommittedCode) {
        this.hasNotCommittedCode = hasNotCommittedCode;
        return this;
    }


    public String getBuildHost() {
        return buildHost;
    }

    public GitSecretInfos setBuildHost(String buildHost) {
        this.buildHost = buildHost;
        return this;
    }



    public String getBranch() {
        return branch;
    }

    public GitSecretInfos setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public String getCommitId() {
        return commitId;
    }

    public GitSecretInfos setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }


    public String getCommitIdAbbrev() {
        return commitIdAbbrev;
    }

    public GitSecretInfos setCommitIdAbbrev(String commitIdAbbrev) {
        this.commitIdAbbrev = commitIdAbbrev;
        return this;
    }

    public String getBuildUserName() {
        return buildUserName;
    }

    public GitSecretInfos setBuildUserName(String buildUserName) {
        this.buildUserName = buildUserName;
        return this;
    }

    public String getBuildUserEmail() {
        return buildUserEmail;
    }

    public GitSecretInfos setBuildUserEmail(String buildUserEmail) {
        this.buildUserEmail = buildUserEmail;
        return this;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public GitSecretInfos setBuildTime(String buildTime) {
        this.buildTime = buildTime;
        return this;
    }

    public String getCommitUserName() {
        return commitUserName;
    }

    public GitSecretInfos setCommitUserName(String commitUserName) {
        this.commitUserName = commitUserName;
        return this;
    }

    public String getCommitUserEmail() {
        return commitUserEmail;
    }

    public GitSecretInfos setCommitUserEmail(String commitUserEmail) {
        this.commitUserEmail = commitUserEmail;
        return this;
    }

    public String getCommitMessageFull() {
        return commitMessageFull;
    }

    public GitSecretInfos setCommitMessageFull(String commitMessageFull) {
        this.commitMessageFull = commitMessageFull;
        return this;
    }

    public String getCommitMessageShort() {
        return commitMessageShort;
    }

    public GitSecretInfos setCommitMessageShort(String commitMessageShort) {
        this.commitMessageShort = commitMessageShort;
        return this;
    }

    public String getCommitTime() {
        return commitTime;
    }

    public GitSecretInfos setCommitTime(String commitTime) {
        this.commitTime = commitTime;
        return this;
    }
    public Set<String> getTags() {
        return tags;
    }

    public GitSecretInfos setTags(Set<String> tags) {
        this.tags = tags;
        return this;
    }
    public String getMavenProjectVersion() {
        return mavenProjectVersion;
    }

    public GitSecretInfos setMavenProjectVersion(String mavenProjectVersion) {
        this.mavenProjectVersion = mavenProjectVersion;
        return this;
    }


    public String toJson() {
        StringBuilder sb = new StringBuilder("{");
        this.appendProperty(sb, "branch", this.branch);
        this.appendProperty(sb, "commitId", this.commitId);
        this.appendProperty(sb, "commitIdAbbrev", this.commitIdAbbrev);
        this.appendProperty(sb, "commitTime", this.commitTime);
        this.appendProperty(sb, "commitUserName", this.commitUserName);
        this.appendProperty(sb, "commitUserEmail", this.commitUserEmail);
        this.appendProperty(sb, "commitMessageShort", this.commitMessageShort);
        this.appendProperty(sb, "commitMessageFull", this.commitMessageFull);
        this.appendProperty(sb, "buildTime", this.buildTime);
        this.appendProperty(sb, "buildUserName", this.buildUserName);
        this.appendProperty(sb, "buildUserEmail", this.buildUserEmail);
        this.appendProperty(sb, "mavenProjectVersion", this.mavenProjectVersion);
        this.appendProperty(sb, "buildHost", this.buildHost);
        this.appendProperty(sb, "hasNotCommittedCode", this.hasNotCommittedCode);

        return sb.append("}").toString();
    }

    private void appendProperty(@NotNull StringBuilder sb, String label, String value) {
        sb.append(String.format("\"%s\": \"%s\",", label, value));
    }

}
