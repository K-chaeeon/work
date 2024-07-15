package returnChap_9.quiz;
/*
1. 문자열을 입력받아 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
    제한사항 1<= str의 길이 <=10
    입력 #1
    abcde
    출력
    a
    b
    c
    d
    e
    */

//값을 입력받는다->변수 String str ="입력값"
//str의 길이를 구한다 = str.length
//for (int i = 0; i < str.length; i++) str[i]=
//str[

import java.util.Scanner;
import java.util.Arrays;
public class Q01 {

    public static void main(String[] args) {
        System.out.print("값을 입력하세요: ");

        Scanner scanner = new Scanner(System.in);
        String a =scanner.nextLine();

        String str[] = new String[a.length()];
        System.out.println("입력값 = "+a);
        while (true) {
            for (int i = 0; i < a.length(); i++) {

                str[i] = String.valueOf(a.charAt(i));
                System.out.println(str[i]);

            }
            break;
        }
    }
}

