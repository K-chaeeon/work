package org.example;

public class Ex01 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);
        } catch (Exception e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("succese");

    }


}
