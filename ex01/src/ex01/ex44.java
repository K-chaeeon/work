package ex01;

import java.util.Iterator;

public class ex44 {
	
	public static void main(String[] args) {
	
		/*i==-0 일 때 행해라
		 * i==-1 일 때 행해라
		 * i==-2 일 때 행해라
		 * i==-3 일 때 행해라
		 * i==-4 일 때 행해라
		 */
		for (int i = 0; i < 5; i++) {
			System.out.println("I love JAVA "+i);
		}
	}
}


/* int i=0 
*for (   ; i < 5; i++) {
 * System.out.println("I love JAVA "+i); 
	}		
		System.out.println(i); //i의 사용은 위 중괄호 내에서만 사용됨, 여기까지 i쓰일려면 for이전에 int i=0 으로 지정해줘야함

