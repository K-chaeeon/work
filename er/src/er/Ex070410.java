package er;

import java.util.Scanner;

public class Ex070410 {

	public static void doA() {
		System.out.println("doA함수");
	}
	public static void doB() {
		System.out.println("doB함수");
	}
	public static void main(String[] args) {
		
	
		//제어문
		//1번입력 doA()함수
		//2번 입력하면 doB()함수 호출
		
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		
		if(select==1)
			doA();
		else if(select==2)
			doB();

	
	
	}
}
