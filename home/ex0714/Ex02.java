package ex0714;
/*
사용자가 입력하는 숫자 모두 더하기
0을 입력하면 프로그램 종료
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요: ");
            int num = scan.nextInt();

            if (num == 0) {
                break;

            }
            sum += num;
        }
        System.out.println("합 = "+sum);
    }
}
