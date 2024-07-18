package org.example;
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
import org.example.an.An01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class An1 {

    An1() {
        An01 student = new An01("홍길동", 98, 80, 60); //객체생성
        //non-static공간인 An01로 감,
        // An01이 public static int num = 0;이면 프로그램 시작부터 생성되어있으므로 참조할라면 int num~으로 호출해야함

        System.out.println(student); //toString없으면 주소값만 나옴@@@@@@@@@@@@@@@@@@@@@

        float result = student.getAverage();
        System.out.println(result);

        System.out.println((student.getTotal()));
    }

    public static void main(String[] args) {

        new An1();




    }
}