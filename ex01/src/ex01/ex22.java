package ex01;

import java.util.Scanner;

public class ex22 {
	//조건확인후
	public static void main(String[] args) {
		//입력선언
		Scanner scan = new Scanner(System.in);
		//break 만나면 while 구문 탈출
		//break 만나면 switch 구문 탈출
		
		while(true) {
			int num = scan.nextInt(); //사용자입력 기다림
			System.out.println("num = "+num);
			
			if(num==0) {
				break;
			}
		}
	System.out.println("종료됩니다.");
	}
}
