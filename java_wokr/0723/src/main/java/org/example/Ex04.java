package org.example;

import org.example.inter.Printable;

public class Ex04 {
    public static void main(String[] args) {

        //@@@@@@@@@@@@@@@@@@@@@@@@
        Printable prn = new Printable() {
            @Override
            public void print(String mydoc) {
                System.out.println("test " + mydoc);

            }
        };
        prn.print("새로은 문서 출력");
        //@@@@@@@@@@@@@@@@@@@@@@@@


        Printable prn2 = (mydoc) -> {        //재정의한 것.
                                            // @@@@~@@@@내에 있는 것처럼 재정의(new~) 안 해도 됨
            //앞에 암것도 안 붙은 void메소드가 하나만 있어야 사용 가능. 두개면 못씀
            //static이나 default 메소드는 재정의 안 해도 되므로 여러개 있어도 괜찮음

            System.out.println("람다로 문서 출력 " + mydoc);
        };
        prn2.print("라라람다아아");
    }

}
