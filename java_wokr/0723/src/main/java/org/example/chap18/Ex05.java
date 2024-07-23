package org.example.chap18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("a : ");
            int a = scan.nextInt();
            System.out.print("b : ");
            int b = scan.nextInt();


            System.out.println("나누기 시작");
            System.out.println(a / b);
            System.out.println("나누기 끝");
            //예외발생하면 강제종료되지 않고 예외발생지점에서 바로 catch구문으로 들어감

            int c[]=new int[3];
            System.out.println(c[4]);

        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
            System.out.println("0으로 나눌 수 없습니다.");
        }
        catch (InputMismatchException ie){

            System.out.println("문자 넣으면 안 돼요,,");
        }
        catch (Exception p){
            System.out.println("Exception은 모든 예외상황 걸러줌");
        }
        System.out.println("정상종료 되었습니다");
    }
}

/*
try-catch 구문 쓰면 중간에 오류로 강제종료되지 않고 정상작동함
 */