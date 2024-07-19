package org.example.chapter15;

import org.example.chapter15.test.*;

public class Ex03 {

    //부모클래스에 자식클래스를 담을 수 있다.
    //자식클래스 생성했을 때 부모클래스로 참조할 수 있다.
    //->클래스 다양성

    public static void main(String[] args) {

        BB[] bary = new BB[10];
        CC[] cary = new CC[10];

        AA[] aary1 = new BB[10];
        AA[] aary2 = new CC[10];



        AA a1 = new BB();
        AA a2 = new CC();

//        a1.bb();  ->부모클래스에 bb와 cc가 없으면 이렇게 참조할 수 없음

        a1.bb();
        a2.cc();

    }
}
