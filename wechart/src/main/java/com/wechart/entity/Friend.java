package com.wechart.entity;

public class Friend {
    private int id;
    private User user;
    private Blog blog;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", user=" + user +
                ", blog=" + blog +
                '}';
    }
}
