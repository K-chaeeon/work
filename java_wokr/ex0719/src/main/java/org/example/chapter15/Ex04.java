package org.example.chapter15;

import org.example.chapter15.box.Box;
import org.example.chapter15.box.GoldPaperBox;
import org.example.chapter15.box.PaperBox;

/*
상속관계에서는 다형성(부모클래스는 자식클래스를 참조할 수 있는 규칙)
메서드 오버라이딩 기법
instanceof 로 클래스간 비교
 */

public class Ex04 {

    public static void main(String[] args) {

        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);


    }

    public static void wrapBox(Box box) {
        if (box instanceof GoldPaperBox)
            ((GoldPaperBox) box).goldbox();
        else if (box instanceof PaperBox)
            ((PaperBox) box).paperbox();
        else
            box.box();
    }
}



