package quiz;

/*
1. "Hello.java" 문자열에서 파일명은 Hello와 확장자인 java를 분리시켜보자.

    입력 >>Hello.java
    출력
    파일명 Hello
    확장자 java

Hello.java를 입력받음


 */

import java.util.Scanner;

public class Qu01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String str[] = new String[a.length()];

        while (true) {

            for (int i = 0; i < a.length(); i++) {

                str[i] = String.valueOf(a.charAt(i));

                System.out.println(str[i]);


                if (str[i].equals('.')){
                    System.out.println(str[i]);
                }
//                System.out.println(str[i].equals('.'));


            }
            break;

        }
    }
}




