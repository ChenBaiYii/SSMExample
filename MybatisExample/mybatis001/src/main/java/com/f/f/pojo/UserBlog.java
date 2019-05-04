package com.f.f.pojo;

import java.util.List;

public class UserBlog extends User {
    private List<Blog> blog;

    public List<Blog> getBlog() {
        return blog;
    }

    public void setBlog(List<Blog> blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "UserBlog{" +
                "blog=" + blog +
                '}';
    }
}
