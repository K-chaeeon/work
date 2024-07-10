public class Ex03 {
    /*
    정수x가 주어지면 x가 짝수이면 "짝수", x가 홀수이면 "홀수"를 출력하는 프로그램을 작성
    삼항연산자로
     */
    public static void main(String[] args) {
        int x = 2;

        String result = (x % 2 == 0) ? "짝수" : " 홀수 ";

        System.out.println("x = " + x + " " + result);

    }


}
