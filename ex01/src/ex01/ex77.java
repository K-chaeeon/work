package ex01;

import java.util.concurrent.CountDownLatch;

public class ex77 {

	public static void main(String[] args) {
		int num = 0;
		while((num++)<100) {  //처음 0으로 하고 돌아와서 num++값으로 시작
			if(num%5!=0 || num%7!=0)
				continue;
			System.out.println("num = "+num);
		}
		
	}
}
