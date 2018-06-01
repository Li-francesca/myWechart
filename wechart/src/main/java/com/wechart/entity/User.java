package com.wechart.entity;

import java.util.Date;

public class User {
    private int id;
    private String user_name;
    private String user_password;
    private Date user_age;
    private String user_sex;
    private String user_location;
    private String user_pic;
    private String user_haveLanguage;
    private String user_wantLanguage;
//    private int blog_id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Date getUser_age() {
        return user_age;
    }

    public void setUser_age(Date user_age) {
        this.user_age = user_age;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_location() {
        return user_location;
    }

    public void setUser_location(String user_location) {
        this.user_location = user_location;
    }

    public String getUser_pic() {
        return user_pic;
    }

    public void setUser_pic(String user_pic) {
        this.user_pic = user_pic;
    }

    public String getUser_haveLanguage() {
        return user_haveLanguage;
    }

    public void setUser_haveLanguage(String user_haveLanguage) {
        this.user_haveLanguage = user_haveLanguage;
    }

    public String getUser_wantLanguage() {
        return user_wantLanguage;
    }

    public void setUser_wantLanguage(String user_wantLanguage) {
        this.user_wantLanguage = user_wantLanguage;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_age=" + user_age +
                ", user_sex='" + user_sex + '\'' +
                ", user_location='" + user_location + '\'' +
                ", user_pic='" + user_pic + '\'' +
                ", user_haveLanguage='" + user_haveLanguage + '\'' +
                ", user_wantLanguage='" + user_wantLanguage + '\'' +
                '}';
    }

    /* public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }*/
}
