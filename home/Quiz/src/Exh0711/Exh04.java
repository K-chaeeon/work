package Exh0711;

import java.util.Scanner;

/*
4. 평점1~5에 따른 별 출력하기
 */
public class Exh04 {

    /*
    1<=int i<=5
    별의 갯수 ->String a = "*"

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*");

        }

    }


}
