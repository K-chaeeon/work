package er;

import java.util.Scanner;


public class ex070401 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
	
		String age_type = sc.next();
		int answer = 0;
		
		//a==10 숫자비교
		//a.equals("10")문자열 비교
		//
		
		if (age_type.equals("KOREA")) {
			answer = 2030 - year +1;
		} else if (age_type.equals("Year")) {
			answer = 2030 - year;
		}
			
			
			
//		if (age_type.equals("Year:))
//			answer = ;
//		}
//		else if (age_type.equals()) {
//			;
//		}
			
			System.out.println("age_type = " + age_type);
			System.out.println("answer = " +answer);
			System.out.println("year = " +year);

	}
}