package com.kodilla.good.patterns.food2door;

public class User {
    private String userName;
    private String address;

    public User(String userName, String address) {
        this.userName = userName;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
