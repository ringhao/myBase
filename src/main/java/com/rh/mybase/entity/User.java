package com.rh.mybase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 用户实体
 */
@Entity
public class User extends BaseEntity {
    /**
     *用户名
     */
    @Column
    private String username;

    /**
     * 用户密码
     */
    @Column
    private String password;

    /**
     * 用户性别
     */
    @Column
    private String sax;

    /**
     * 用户年龄
     */
    @Column
    private Integer age;

    /**
     * 用户地址
     */
    @Column
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSax() {
        return sax;
    }

    public void setSax(String sax) {
        this.sax = sax;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
