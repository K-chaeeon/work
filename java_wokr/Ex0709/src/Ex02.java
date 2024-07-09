//class정의


class B {

    int num = 10;

    public void doA() {
        System.out.println(" 만들기 ");
    }

}
public class Ex02 {
    public static void main(String[] args) {
        int num = 10;
        int num1 = 20;
        int num3 = 30;

//선언하는순간 메모리에 적재된다
        B a1 = new B();
        B a2 = new B();
        B a3 = new B();


        System.out.println(a1.num);
        a1.doA();
        a1.num = 30;

        System.out.println("a1.num = " + a1.num);

        System.out.println("a2.num = " + a2.num);
        a2.doA();

    }


}
