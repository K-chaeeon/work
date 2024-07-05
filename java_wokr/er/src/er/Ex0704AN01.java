package er;
/* 1. 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합의 구하시오
 */
public class Ex0704AN01 {

	public static void main(String[] args) {

		// 1 ~ 20 5,7,11,13,
		
		int sum = 0;
		
		for(int n = 1; n < 21; n++) {
			if(n%2!=0 && n%3!=0)  {
				sum = sum+n;
			}
		}
		
		System.out.println(sum);
		
	}
}

