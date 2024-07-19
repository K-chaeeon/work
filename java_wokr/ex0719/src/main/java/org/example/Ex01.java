package org.example;

import org.example.aa.KiaCar;
import org.example.aa.SamsungCar;

import java.sql.SQLOutput;

public class Ex01 {
    public static void main(String[] args) {

        SamsungCar samsungCar = new SamsungCar("XM3","예쁨","삼성");
        KiaCar kiaCar = new KiaCar();

//생성자의 용도 -> 메모리화, 인스턴스 변수값을 초기화(=선언=변경)

        System.out.println(samsungCar);
        System.out.println(kiaCar);


    }



}
