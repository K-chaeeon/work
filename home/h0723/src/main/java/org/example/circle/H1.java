package org.example.circle;

public class H1 {
    public static void main(String[] args) {
        Circle c = new Circle(1.5);
        System.out.println(c.getArea());

        c.setRad(2.5);
        System.out.println(c.getArea());
        c.setRad(-3.3);
        System.out.println(c.getArea());

//        c.rad = -4.5;
        //setRad()를 통하지 않고
        // 이런식으로 직접접근해서
        // 논리적 오류가 생기는 것을 막기 위해 정보은닉 사용
        System.out.println(c.getArea());
    }

}
