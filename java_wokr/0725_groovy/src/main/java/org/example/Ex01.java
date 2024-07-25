package org.example;

public class Ex01 {

    public static void main(String[] args) {
    /*
        A a = new A();

        a = null;
        //메모리-힙 영역에 있는 A 인스턴스가
        // 가비지 컬렉션(자동으로 인스턴스 함수 날려주는 것) 대상이 됨
      */

        A a1 = new A("AA");
        A a2 = new A("AA");
        A a3 = new A("AAA");

        a1.printThis(a2);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a1));
        System.out.println(a3.equals(a1));
//        equals는 주소값 기준으로 비교하므로 다 false

        System.out.println(a1 == a2);     //할당된 주소값이 다르므로 false,


    }

}
