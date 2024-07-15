package qu;

/*
1. 길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서,
홀수와 짝수를 구분 지어 출력하는 프로그램을 작성해 보자.
일단 홀수부터 출력하고 나서 짝수를 출력하도록 하자.
단, 10개의 정수는 main 함수 내에서 입력받도록 하고,
배열 내에 존재하는 홀수만 출력하는 함수와 배열 내에 존재하는 짝수만 출력하는 함수를 각각 정의해서
이 두 함수를 호출하는 방식으로 프로그램을 완성하자.

 */


import java.util.Scanner;

public class a1 {


    public static void main(String[] args) {

        int[] a;
        a = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");

        int i = 0;
        while (i < a.length) {
            i++;
            int b = scan.nextInt();
            a[i] = b;


        }
        System.out.print(a[i] + " ");
        System.out.println();

    }


}






/*
0=1
    1=2
2=3
    3=4
4=5
    5=6
6=7
    7=8
8=9
    9=10
 */
