package org.example.chapter15.phone;

public class SmartPhone extends MobilePhone {

    private String androidVer;

    public SmartPhone(String aver, int number) {
        super(number);
        this.androidVer = aver;

    }

    public void show() {
        System.out.println("androidVer : " + androidVer);
        System.out.println("number : " + number);
    }


}
