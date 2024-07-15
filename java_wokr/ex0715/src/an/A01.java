package an;

import java.util.Scanner;

    /*
        10진수를 입력받아 2진수로 출력하기
     */

class Exam {
    //클래스는 클래스 변수(필드,데이터,인스턴스 변수)와
    // 메서드(함수, 클래스 함수, 인스턴스 함수)로 이루어져있음.
    //메서드 없이 클래스 안에 바로 변수를 넣는 건 가능

    Scanner scan = new Scanner(System.in);

    public int inputNumber() {                    //메서드 22222222222222222222
        System.out.println("숫자입력");             //333
        int inputNumber = scan.nextInt();        //4444
        System.out.println("inputNumber().inputNumbrt = " + inputNumber);            //5555
        return inputNumber;                     //6666
    }


}


public class A01 {
    public static void main(String[] args) {
        Exam exam = new Exam();     //참조변수              //111111111111111111111
        int result = exam.inputNumber();                         //호출(메서드라서 괄호있음) 7777
        System.out.println("main.result = " + result);


        int value, namugee;          //몫,나머지

        value = result / 2;
        namugee = result % 2;

        System.out.println("몫 = " + value);
        System.out.println("나머지 = " + namugee);
        System.out.println();

        String all = "" + namugee;        //나머지들

        while (true) {

            namugee = value % 2;
            value = value / 2;
            all = namugee + all;

            System.out.println("몫 = " + value);
            System.out.println("나머지 = " + namugee);
            System.out.println("나머지들 = " + all);
            System.out.println();

            if (value < 2) {
                if(value!=0){
                    all=value+all;
                    System.out.println("나머지들 = "+all);
                }
                break;
            }

        }

    }
}
