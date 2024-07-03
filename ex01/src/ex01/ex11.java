package ex01;

public class ex11 {
	public static void main(String[] args) {
		int n = 3;
		switch (n) {
		case 1:
			System.out.println("n은 1입니다.");
			break;
		case 2:
			System.out.println("n은 2입니다.");
			break;
		case 3:
			System.out.println("n은 3입니다.");
			break;
		case 4:
			System.out.println("n은 4입니다.");
			break;
		default:
			break;
		}
		System.out.println("종료합니다.");

	
//if구문
		if(n==1) {
			System.out.println("n은 1입니다.");
		} else if (n==2) {
			System.out.println("n은 2입니다.");
		} else if (n==3) {
			System.out.println("n은 3입니다.");
		} else if (n==3) {
			System.out.println("n은 4입니다.");
		} else {
			System.out.println("기본");
		}
		
		System.out.println("종료됩니다.");
	}
}


