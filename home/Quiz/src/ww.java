import java.util.Scanner;

public class ww {
    public static void main(String[] args) {
        // 문제. 평점 (1~5)에서 3번 입력 받는다. 1~5 사이 입력이 아니면 다시 입력 받는다.
        // 실행 1. 평점 입력 >>>0
        //      1번째 평점 입력

        Scanner sc = new Scanner(System.in);

        for (int a = 0 ; a<3; a ++) {
            int grade;
            do {
                System.out.print((a+1) + "번째 평점을 입력하세요>>>");
                grade = sc.nextInt();
            } while(grade <1 || grade >5); // 입력값이 1~5가 아니면 17라인으로 가서 다시 입력 받는다.

        }
    }

}
