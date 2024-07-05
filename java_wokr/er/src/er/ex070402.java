package er;

import java.util.Iterator;

public class ex070402 {
	public static void main(String[] args) {
		
		/*
		 * i = 0일 때 J는 0~2까지 반복하라
		 * i = 1일 때 j는 0~2까지 반복하라
		 * i - 2일 때 j는 0~2까지 반복하라
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.println("i = " + i +"j = " +j);		
			}
		}
		
	}
}
