package Quiz.src.Exh0711;

import java.util.Scanner;

/*
1. 구구단 출력

 */
public class Exh01 {

    public static void main(String[] args) {

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
        System.out.println("값을 입력하세요.");


        int num;                //구구단 결과 (i*j)

        int j = 1;

//        if()
            int i = scan.nextInt();//곱하는 수(1~9
            for (; j >= 1 && j < 10; j++) {

                if (i > 0 && i < 10) {
                    num = i * j;
                    System.out.println(i + "x" + j + "=" + num);

                } else break;

            }
            if (i <= 0 && i >= 10) {
                System.out.println("올바른 값을 입력하세요.");
            }

        }
    }


//올바른값 10번출력
//값 다시 받기 안 됨






