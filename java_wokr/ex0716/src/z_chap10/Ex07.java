package z_chap10;
//import java.lang.* ->생략되어있음

class Test {
    public static void doA() {
        System.out.println("static doA");
    }

    public void doB() {
        System.out.println("그냥..instance doB");
    }
}

public class Ex07 {
/*
    int num = 0;

    static void Add(int n) {
        num += n;       ->유효한가? X -> static변수가 아닌 num은 객체선언을 해야 쓸 수 있음.
    }
*/

    public static void main(String[] args) {
        Test.doA();


        Test b = new Test();    //static아니라서 객체선언해야함
        b.doB();

//        b.doA();    ->되긴하지만 권장X

    }

}
