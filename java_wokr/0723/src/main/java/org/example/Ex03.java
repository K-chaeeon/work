package org.example;

import org.example.inter.CMYKPrintable;
import org.example.inter.Printable;
import org.example.print.CMYKPrinter;

public class Ex03 {
    public static void main(String[] args) {
        //2개의 변수 WIDTH, HEIGH
        //2개의 메서드 print(), cmykprint();

        System.out.println(Printable.WIDHT);
        System.out.println(CMYKPrintable.HEIGHT);
        //(CMYKPrintable이 Printable을 상속받아서
        // 메모리상에는 한개만 존재함. 고로 어디로 접근해도 ㄱㅊ

        CMYKPrintable prn = new CMYKPrinter();
            prn.print("옛날프린터");

            prn.printCMYK("내문서");

            prn.clean();

            Printable.printLine();


        }
    }
