package ex0710.src.an;
/*
초를 입력받음
int를 넘겨주면 String을 반환하는 함수
 */


//toStroing운 생략됨

//public String toString() {
//    return "내맘대로"

//}

import java.util.Scanner;

public class CalSecond {
    //초입력받는함수
    public int inputNumber() {
        System.out.println("초입력: ");
        Scanner scanner = new Scanner(System.in);
        int resulte = scanner.nextInt();
        return resulte;
    }

    //int를 넘겨주면 String을 반환하는 함수
    //216747 ->6시간 2분 47초
    public String calculate(int second) {
        int hour = second / 3600;
        int min = (second % 3600) / 60;
        int sec = (second % 3600) % 60;
        return hour + "시간" + min + "분 " + sec + "초";
    }
}




