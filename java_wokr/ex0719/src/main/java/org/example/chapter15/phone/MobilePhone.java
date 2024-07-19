package org.example.chapter15.phone;

public class MobilePhone {

    int number;

    public MobilePhone(int number) {
        this.number = number;
    }

    //show함수 재정의=override
    public void show() {

        System.out.println("mobileNumber : " + number);
    }

}

