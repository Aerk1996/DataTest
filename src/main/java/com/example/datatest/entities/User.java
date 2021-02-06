package com.example.datatest.entities;

import com.orm.SugarRecord;
import com.orm.dsl.Column;
import com.orm.dsl.Unique;

public class User extends SugarRecord {
    @Unique
    @Column(name="user_id")
    private Long user_id;
    @Column(name="user_name")
    private String userName;
    @Column(name="user_surname")
    private String userSurname;
    @Column(name="user_password")
    private String userPassword;

    public User()
    {

    }

    public User(Long user_id, String userName, String userSurname, String userPassword) {
        this.user_id = user_id;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userPassword = userPassword;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
