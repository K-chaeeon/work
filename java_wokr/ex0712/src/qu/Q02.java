package qu;
/*
   2. 숫자로 이루어진 문자열 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
        만일 문자열이 "12345" 면 ‘1+2+3+4+5’ 결과인 15를 출력하여야한다.
        (1) 에 알맞은 코드를 넣으시오 .
        [Hint] String 클래스의 charAt(int i)을 사용
 */




public class Q02 {

    public static void main(String[] args) {

        String str = "7412";

//        int []num = new int[str.length()];
//
//
//        System.out.println(str.length());


        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += i;
//            BB[] n = new BB(sum);
        }

        System.out.println(str);

        String testStr = new String(str);
        System.out.println(testStr);



//    char[] test = "테스트".toCharArray();
//        for (int i = 0; i < test.length; i++) {
//        System.out.println("test["+i+"]="+test[i]);
    }
}



/*
class Exercise4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for(int i=0; i < str.length(); i++) {

        }
        System.out.println("sum="+sum);
    }
}
 */


/*
String str = "15453"
str=15453
str.length=
int[]str.length = , , , ,



 */