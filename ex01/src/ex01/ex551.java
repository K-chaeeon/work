package ex01;

import java.util.Scanner;

public class ex551 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			
			n++;
			System.out.println("n="+n);
			if(n==3)
				continue;
			
			int temp = scan.nextInt();
			System.out.println("temp = "+temp);
		}
		
//		System.out.println("종료됩니다.");
	}

}
