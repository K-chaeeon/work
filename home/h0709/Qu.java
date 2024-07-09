package h0709;
/*
 학점계산기
 90점 이상: "A"
 80이상 90미만: "B"
 70이상 80미만: "C"
 60이상 70미만" "D"
 60미만: "F"

 점수는 (int score)로 지정하고 해당 변수를 기반으로 학점을 출력하는 코드
 */

public class Qu {
    public static void main(String[] args) {
        int score = 92;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


    }


}
