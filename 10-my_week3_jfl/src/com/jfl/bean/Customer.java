package com.jfl.bean;

public class Customer {
    private int id;
    private String email;
    private String nick_name;
    private String name;
    private String role;
    private String tel;
    private String hiredate;
    private int status;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nick_name='" + nick_name + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", tel='" + tel + '\'' +
                ", hiredate='" + hiredate + '\'' +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Customer(int id, String email, String nick_name, String name, String role, String tel, String hiredate, int status) {
        this.id = id;
        this.email = email;
        this.nick_name = nick_name;
        this.name = name;
        this.role = role;
        this.tel = tel;
        this.hiredate = hiredate;
        this.status = status;
    }

    public Customer(int anInt, String string, String resString, String s, String string1, String resString1, int resInt) {
    }
}