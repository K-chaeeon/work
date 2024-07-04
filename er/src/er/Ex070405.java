package er;
//메서드와 변수범위
public class Ex070405 {

	//구구단 호출하는 메서드 => 2 3
	public static void aa(int dan) {
		System.out.println("aa");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan*i);
		}
	}
	
	//두 수를 받아서 최소공배수 출력하는 메서드
	//num1로 나누었을 떄 나머지가 0, 그리고 num2로 나누었을 때 나머지가 0
	public static void bb(int num1, int num2) {
		System.out.println("bb");

		for(int num = 0; num<50; num++) {
			
//		=>	int num = 0;
//			while(num<50) {
//				num++;
			
			if( num % num1 ==0 && num % num2 ==0) {
				System.out.println("최소공배수는 = " + num);
				break;
		}
	}
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		aa(7);
		bb(3,5);
//		System.out.println(num1); //?
		System.out.println("프로그램 끝");
		
	}
}
