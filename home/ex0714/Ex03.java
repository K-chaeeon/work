package ex0714;
/*
사이숫자 구하기
 */
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요:");
        int num1 = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("두번째 숫자를 입력하세요:");
        int num2 = scan1.nextInt();


        if (num2 < num1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
            for (int i = num1; i <= num2; i++) {
                System.out.print(i);

                if (i != num2) {
                    System.out.print(",");
                }


            }
        }
    }

//            int i = num1;
//            while(i >= num1 && i <= num2) {
//                System.out.print(i+" ");
//                i=i+1;



