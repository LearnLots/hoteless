package com.robin.hoteless.Model;

public class AwsStuffNeeded {
    private String userName;
    private String password;

    public AwsStuffNeeded(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public AwsStuffNeeded setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public AwsStuffNeeded setPassword(String password) {
        this.password = password;
        return this;
    }
}
