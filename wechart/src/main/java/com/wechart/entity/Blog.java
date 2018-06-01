package com.wechart.entity;

import java.util.Date;

public class Blog {
    private int id;
    private  String blog_title;
    private String blog_content;//说说内容
   // private int blog_likenum;//点赞数
    private Date blog_edit;//发表时间
//    private int user_id;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlog_title() {
        return blog_title;
    }

    public void setBlog_title(String blog_title) {
        this.blog_title = blog_title;
    }

    public String getBlog_content() {
        return blog_content;
    }

    public void setBlog_content(String blog_content) {
        this.blog_content = blog_content;
    }


    public Date getBlog_edit() {
        return blog_edit;
    }

    public void setBlog_edit(Date blog_edit) {
        this.blog_edit = blog_edit;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", blog_title='" + blog_title + '\'' +
                ", blog_content='" + blog_content + '\'' +
                ", blog_edit=" + blog_edit +
                ", user=" + user +
                '}';
    }

    /*  public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }*/
}
