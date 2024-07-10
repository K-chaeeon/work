package ex06;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();
// =>(like) int c = 10;


        //클래스 변수(=참조 변수) 출력할 때.. //toString은 생략 가능함
        //원래는 주소값이 16진수(0~f)로 나오는데 toString은 내가 다시 정리할 수 있다.

        System.out.println("a참조변수= "+a.toString());
        System.out.println("b참조변수=" +b);


        a.mod();  //a에 있는 함수를 출력하라
        System.out.println();

        System.out.println("a참조변수= "+a.toString());
        System.out.println("b참조변수=" +b);


    }
}
