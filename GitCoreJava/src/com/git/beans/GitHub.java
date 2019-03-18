package com.git.beans;

public class GitHub {
	protected int githubNo;
	protected String gitHubName;

	public String getGitHubName() {
		return gitHubName;
	}

	public void setGitHubName(String gitHubName) {
		this.gitHubName = gitHubName;
	}

	@Override
	public String toString() {
		return "GitHub [githubNo=" + githubNo + ", gitHubName=" + gitHubName + "]";
	}
	
}
