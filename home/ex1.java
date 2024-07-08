public class ex1 {
    public static void main(String[] args) {

//        int x = 4, y = 2;
//        System.out.println(x+y);

        /*
        변수의 타입
        -변수의 타입은 저장할 값의 타입에 의해 결정된다.

        int -> 정수
        ch -> 문자
        double -> 실수
         */

        /*
       값의 타입
       값(data)
       문자- char
       숫자- 정수-byte,short,int,long  ->순서대로 점점 범위가 넓어짐 / byte범위=-127~127
            실수-float,double         ->double이 정밀도가 더 높음
        ==>실수형이 정수형보다 저장 범위 넓음
       논리- boolean(true/false)
         */

        /*
        변수- 하나의 값을 저장하기 위한 공간
        상수- 한 번만 값을 저장 가능한 변수   final int MAX = 100; 으로 하면 이후 다른 값 저장할 수 없음
        리터럴- 그 자체로 값을 의미하는 것 =>기존의 상수(문자,숫자)
         */

        int score = 100;
        score = 200;
        System.out.println(score);

//        final int score = 100;
//        score = 200;      -> 불가능

        /*
        리터럴의ㅏ 접두사와 접미사
        논리형 - false true
        정수형 - [123, 0b0101,055, 0xRR]=int [100L]=long   -> 접미사 L
        실수형 - 3.14, 3.0e4, 1.4f, 0x1, 0p-1    ->접미사 f(float->생략불가능),d(double->생략가능)
        문자형 - 'A', '1', ['\n']=줄바꿈문자       ->접두사 ch          char / ch = 'a';
        문자열 = "ABXC", "123", "A", "true"      ->접두사 String      String / str = "ABC";
         */


        System.out.println(10.);
        System.out.println(.10);
        System.out.println(10f);
        System.out.println(1e3);






    }
}
