package er;

public class Ex070408 {
	public static void main(String[] args) {
		int result = doA(3);
		String temp = doB("안녕하세여");
		System.out.println(result);
		System.out.println(temp);
//    =
		System.out.println(doA(3));
		System.out.println(doB("안녕하세여"));
		
		
	}
	
	
	public static int doA(int num ) {
		return num*num;
	}
	
	public static String doB(String str) {
		return str + str;
	}
	
}
