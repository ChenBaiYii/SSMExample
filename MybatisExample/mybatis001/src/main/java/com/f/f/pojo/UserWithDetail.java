package com.f.f.pojo;

public class UserWithDetail extends User {
    private UserDetail userDetail;

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    @Override
    public String toString() {
        return "UserWithDetail{" +
                "userDetail=" + userDetail +
                '}';
    }
}
