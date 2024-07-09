import java.util.Scanner;
import aa.bb.Fact;   //다른 클래스 함수 가져와서 쓸 때
//같은 파일 안에 있으면 안 적어도 됨.그냥 Fact fact = new Fact()만 써도 O

//    1. 2의 n승을 구하는 함수를 재귀적으로 구현해 보자.
//    그리고 그에 따른 적절한 함수를 구현해 보자.
//    참고로 재귀 함수의 구현이 처음에는 어려운 편이기 때문에 여기서는 쉬운 문제를 제시하였다
//

public class aaEx01 {

    public static void main(String[] args) {
        //입력받는 변수 선언
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자입력");
        int result = scanner.nextInt(); //스캐너 안에 있는 nextIn이라는 메서드를 사용(오라클이 제공)
                                        //숫자를 입력받는 콘솔
                                        //실행시, 사용자 입력 기다림

        Fact fact1 = new Fact();
        int retValue= fact1.aa(result); //Fact클래스의 aa메서드 사용




        System.out.println("result = "+result);
        System.out.println("retValue = "+retValue);



//        Fact fact2 = new Fact();




    }
}
