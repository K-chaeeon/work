package er;

// 2. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+10)의 결과를 계산하시오
public class Ex0704An02 {
	public static void main(String[] args) {
		/*
		 * i가 1일 때 j가 한 번 i가 2일 때 j가 두 번
		 * 
		 * i가 9일 때 j가 열 번
		 */

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i < 11; i++) {
				sum2 = sum2 + i;
//				System.out.println(sum2);
		sum1 = sum1+sum2;
		}			
		System.out.println(sum1);
	}	
}
