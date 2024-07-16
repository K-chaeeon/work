package z_chap10;
import aa.Circle;
//Circle 같이 참고

public class Ex06 {
    public static void main(String[] args) {



        System.out.println(Circle.PI);
        System.out.println(Circle.a);


//        Circle.doA();
//        System.out.println(Circle.sum);
//

        Circle c = new Circle();

        c.do둘레();   //호출
        c.do넓이();   //호출

        System.out.println(c.doA());
//        int result = c.doA();
//        System.out.println(result);

    }

}
