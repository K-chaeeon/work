package ex01;

import javax.xml.transform.Result;

/*아리의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일 사과의 수가 123개이고
 * 하나의 바구니에는 10개의 사과를 담을 수 있다면 13개의 바구니가 필요할 것이다. (1)에 알맞은 코들르 넣으시오
 */

public class Ex08 {
	public static void main(String[] args) {
		int numOFApples = 123;
		int sizeOFBucket = 10;
		int numOFBucket = (numOFApples/sizeOFBucket)+(numOFApples%sizeOFBucket == 0? 0:1);
		System.out.println("필요한 바구니의 수 " + numOFBucket);
	}
}
