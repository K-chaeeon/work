package chap_13_early;

import java.sql.SQLOutput;

public class Ex04 {
    public static void main(String[] args) {
        /*
        String배열을 char[]로 바꾸기
        char[] -> String
         */

        /*
        String str = "우리는 할 수 있다";  //문자열
        char[] chars = str.toCharArray();   //문자배열
        */


        String str = "우리는 할 수 있다";
        char[] chars = str.toCharArray();

        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);
        System.out.println(chars[3]);
        System.out.println(chars[4]);
        System.out.println(chars[5]);
        System.out.println(chars[6]);
        System.out.println(chars[7]);
        System.out.println(chars[8]);
        System.out.println(chars[9]);
        System.out.println("\n\n\n\n");
        //'할'을 A로 바꾸기
        chars[4] = 'A';
        System.out.println(chars[4]);

        String aa = new String(chars);
        System.out.println(aa);

    }

}
