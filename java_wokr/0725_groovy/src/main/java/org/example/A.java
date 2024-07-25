package org.example;

public class A extends Object {

    private String name;

    public A(String name) {
        this.name = name;
    }

    public void printThis(Object obj) {
        System.out.println("this = " + this);   //this->A라는 클래스 안에서 사용하는 변수명?
                                                 // 아무튼 변수 name을 가리키고있음
        System.out.println("(A)obj = " + ((A) obj));
        System.out.println("this.name = " + this.name);
        System.out.println("((A) obj).name = " + ((A) obj).name);
    }

    @Override
    public boolean equals(Object o) {
        return this.name.equals(((A) o).name);


    }

}
