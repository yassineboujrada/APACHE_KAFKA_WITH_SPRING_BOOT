package com.spring_apache.Apache_Kafka.payload;

public class User {
    private int id;
    private String full_name;
    
    public User(int id, String full_name) {
        this.id = id;
        this.full_name = full_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public String toString() {
        return "User [full_name=" + full_name + ", id=" + id + "]";
    }
}
