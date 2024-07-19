package org.example.chapter15;

import org.example.chapter15.phone.MobilePhone;
import org.example.chapter15.phone.SmartPhone;

public class Ex02 {

    //부모클래스에 있는 메소드는 상속되며
    //자식클래스에 동일한 이름에 메소드가 있으면
    //오버라이딩(재정의)된다

    //오버플로우, 오버로딩, 오버라이딩 구분

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("5.0",10123456);
        smartPhone.show();

        MobilePhone mobilePhone = new MobilePhone(12345);
        mobilePhone.show();
    }
}
