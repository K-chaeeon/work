package Quiz;

import ex06.BankAccount;

import java.util.Scanner;

//     2. 프로그램 사용자로부터 초(second)를 입력받은 후에,
//    이를 [시, 분, 초]의 형태로 출력하는 프로그램을 작성해 보자.
//
public class q2 {

//        int i
//    1시간=60분=3600초
//
//        [a,b,c]
//
//    0<i<60일 때
//        a=0, b=0, c=i
//
//    60<=i<=360일 때
//    i%60==0이면 a=0, b=i/60, c=0
//                아니면 a=0, b=int(i/60), c=i%60
//
//    360<i일 때
//        i%3600==0이면 a=i/3600, b=0, c=0
//                아닐 때 i%3600<=60이면 a=int(i/3600), b=0, c=i%3600
//                    아닐 때(나머지가 60보다 큼) (i%3600)%60==0이면 a=i/3600, b=(i%3600)/60, c=0
//                        아닐 때(나머지 60보다 크고 60나눳을 때 떨어지지않음) a=i/3600, b=int((i%3600)/60), c=(i%3600)%60

    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
//        int a = 0;
//        int b = 0;
//        int c = 0;
//
//        if (i > 0 && i < 60) {
//            a = 0;
//            b = 0;
//            c = i;
//        } else if (i >= 60 && i <= 360) {
//            if (i % 60 == 0) {
//                a = 0;
//                b = (i / 60);
//                c = 0;
//            } else {
//                a = 0;
//                b = (i / 60);
//                c = i % 60;
//            }
//        } else if (i > 360) {
//            if (i % 3600 == 0) {
//                a = (i / 3600);
//                b = 0;
//                c = 0;
//            } else if (i % 3600 <= 60) {
//                a = (i / 3600);
//                b = 0;
//                c = i % 3600;
//            } else if ((i % 3600) % 60 == 0) {
//                a = i / 3600;
//                b = (i % 3600) / 60;
//                c = 0;
//            } else {
//                a = i / 3600;
//                b = ((i % 3600) / 60);
//                c = (i % 3600) % 60;
//
//            }
//
//        }
        int a = i/60/60;
        int b = i/60%60;
        int c = i%60;
           System.out.println(a + "시간" + b + "분" + c + "초");







    }


}



