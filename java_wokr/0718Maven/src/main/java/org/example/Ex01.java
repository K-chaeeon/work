package org.example;

import java.util.Scanner;

public class Ex01 {
    Ex01() {
        Box bx = new Box("myBox");
        System.out.println(bx);

        System.out.printf("%s\n", "문자열 출력");

        int a = 10;
        int b = 20;
        System.out.printf("%d\n", a);
        System.out.printf("%f\n", (double) a);
        System.out.printf("%o\n", a);        //8진수
        System.out.printf("%x\n", a);        //16진수

        System.out.println(String.format("%d+%d = %d", a, b, a + b));   //a를 첫 %d에,b를 두번째%d에 넣음
        System.out.println(a+"+"+b+" = "+(a+b));      //위에거랑 같음


    }



    public static void main(String[] args) {

        new Ex01();


    }


}
