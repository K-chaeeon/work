package er;

import java.util.Scanner;

public class Ex070409 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("곱하고 싶은 값 입력: ");
			int input = scan.nextInt();
			System.out.println(input * input);
		}
	}
	public static int doA(int num) {
		return num * num;
	}
}

