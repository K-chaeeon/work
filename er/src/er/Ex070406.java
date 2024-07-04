package er;

public class Ex070406 {

	public static int aa() {    //2
		System.out.println("aa");   //3
		return 10;   //4
	}
	public static void main(String[] args) {
		aa();
		int a = (int) aa();      //1    //5
		System.out.println(a);  //6
		
	}
}
