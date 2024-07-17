package quiz;

import java.util.Scanner;

/*
1. Student 클래스를 작성하는 연습을 해보도록하자.
    Student클래스에 getTotal()과 getAverage() 를 추가하시오
    1. :  getTotal 메서드
    기 능 국어 영어 수학 의 점수를 모두 더해서 반환한다 :
        (kor), (eng), (math) .
        반환타입 : int
        매개변수 없음 :
    2. : getAverage 메서드
    기 능 총점 국어점수 영어점수 수학점수 을 과목수로 나눈 평균을 구한다 : ( + + ) .
    소수점 둘째자리에서 반올림할 것.
    반환타입 : float
    매개변수 없음
 */

public class Qu01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("국어점수: ");
        int kor = sc.nextInt();
        System.out.print("영어점수: ");
        int eng = sc.nextInt();
        System.out.print("수학점수: ");
        int math = sc.nextInt();

        Student get = new Student();

        get.getTotal(kor,eng,math);
        get.getAverage(kor,eng,math);


        System.out.println("총합은 " + Student.getTotal(kor,eng,math) + "입니다.");
        System.out.println("평균은 " + Student.getAverage(kor,eng,math) + "입니다.");


    }
}


class Student {


    public static int getTotal(int kor, int eng, int math) {

        return kor + eng + math;
    }


    public static float getAverage(int kor, int eng, int math) {

        return ((float) (kor + eng + math) /3);
    }


}

