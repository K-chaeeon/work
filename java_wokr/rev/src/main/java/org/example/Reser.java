package org.example;

public class Reser {
    private String name;
    private String phone;
    private int wait;

    public Reser(String name, String phone, int wait) {
        this.name = name;
        this.phone = phone;
        this.wait = wait;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getWait() {
        return wait;
    }

    @Override
    public String toString() {
        return "대기번호: " + wait + " / 이름: " + name + " / 전화번호: " + phone;
    }
}

