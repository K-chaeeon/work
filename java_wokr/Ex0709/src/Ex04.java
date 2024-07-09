class AAA {
    int count = 10;

}

public class Ex04 {

    public static void main(String[] args) {

        AAA a1 = new AAA();
        AAA b1 = a1;        //참조변수의 특성 : new 를 넣지 않았으므로 b1=d이 아니라 같은 인스턴스인 a1을 가리킴

        System.out.println("a1.count = " + a1.count);
        System.out.println("b1.count = " + b1.count);

        a1.count = 30;

        System.out.println("a1.count = " + a1.count);
        System.out.println("b1.count = " + b1.count);

        int a = 10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + a);

        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
