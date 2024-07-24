package org.example;

public class Ex06 {


    public static int doA() {
        try {
            int a = 10;
            int b = 3;

            return a / b;

        } catch (Exception e) {
            System.out.println("예외발생");
            return 0;

        } finally {
            System.out.println("무조건여기로온다"); //위에 예외가 있건없건 무조건 finally 실행됨
                                                 //return이 있어도 무조건 finally 실행됨
        }
    }

    public static void main(String[] args) {
        System.out.println(doA());
    }

}
