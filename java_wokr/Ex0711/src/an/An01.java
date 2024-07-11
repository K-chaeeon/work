package Ex0711.src.an;
/*
재귀함수
 */


import java.util.Scanner;

class Fact {
    public int fact(int num) {
        System.out.println("여기오나" + num);           //~~~~3입력받은거 넣어서 출력댐

        //메서드는 반환값을 적게 되면 반호나값이 무조건 있어야 한다

//        fact();     //->이것만 적으면 무한루프이므로 if
        if (num > 0)                                //~~~~~4
            return 2 * fact(num - 1);
        //2 * fact(2)
        //2 * 2 * fact(1)
        //2 * 2 * 2 * fact(0)         //num이 0이므로     11111
        //2 * 2 * 2 * 1 = 8           //333333333
        else {                  //메서드는 반환값을 적게 되면 반호나값이 무조건 있어야 하므로 else 넣어줘야함
            return 1;           //222222222


        }
    }
}

public class An01 {
                    /*
                    String을 int로 바꿀 때 ->   int num = Integer.parseInt(a);
                    int를 String으로 바꿀 때 -> 10+"";
                    answkduf dlqfur scan.nextline 숫자입력scan.nextInt
                     */

    public static void main(String[] args) {

//        2*2*2 num3
//        2*2*2*2 num4

        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 승 구할래?");

        String a = scanner.nextLine();     //->문자형을 입력받음
        int num = Integer.parseInt(a);      //문자열을 숫자열로 바꾸는 방법


        //클래스의 정의와 인스턴스화
        Fact fact = new Fact();             //~~~~1객체선언
        fact.fact(num);                     //~~~~2호출 (fact메서드로)



//        System.out.println(a);
//        System.out.println(num);
//        int num = scanner.nextInt();

    }


}
