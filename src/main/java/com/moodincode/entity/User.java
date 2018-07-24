package com.moodincode.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * createBy: moodincode
 * createDate: 2018/7/23 14:09
 * lastModifyDate: 2018/7/23 14:09
 * description:
 */
public class User implements Serializable {
    private static final long serialVersionUID = 8501538130746309236L;

    private int id;
    private String name;
    private String sex;
    private String userName;
    private String password;
    private int age;
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
