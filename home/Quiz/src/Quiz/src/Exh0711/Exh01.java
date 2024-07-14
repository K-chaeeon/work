package Quiz.src.Exh0711;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
1. 구구단 출력

 */
public class Exh01 {

    public static <itn> void main(String[] args) {

    /*
    2단
    2*1=2+2
    2*2=2+2+2
    int i단 (i>0)
    int j=1 ;

     */

//        int i = 1;
//        int j = 1;
//        int num = 1;
//
//        while (i > 0) {
//            num = i * j;
//            j++;
//
//            if (j < 9) {
//                System.out.println(i + "x" + j + "=" + num);
//            } else{
//                break;

        /*
        "값을 입력하세요."먼저 출력.
        입력받은 값의 구구단 출력
        만약 0단, 9단 초과이면 "올바른 값을 입력해주세요." 출력하고 재입력 받기
         */
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("입력: ");
            int j = scan.nextInt();
            if (j > 0 && j < 10) {
                int i;
                for (i = 1; i > 0 && i < 10; i++) {
                    int num = j * i;
                    System.out.println(j + "x" + i + "=" + num);
                }
                break;
            } else {
                System.out.println("다시 입력하세요");
            }
        }
    }
}

