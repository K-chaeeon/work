package ex01;

public class ex331 {
	public static void main(String[] args) {
	//do 중괄호영역 확인 후 조건 검사
		int n =10;
		do {
			System.out.println(n);
			n--; //n에서 1 뻄
		}while(n>10); //9는 8보다 크기떄문에 다시 중괄호로 올라가서 9 출력됨
	
	}
	
}

//do 중괄호 내용이 while에서 false여도 첫 결과는 출력이 됨->	System.out.println(n);