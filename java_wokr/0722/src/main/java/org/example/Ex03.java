package org.example;

/*
배열에서,,
클래스 다형성 문법
    Friend 클래서 배열로 친구관리를 할 수 있는 프로그램
    부모참조변수는 자식인스턴스를 참조할 수 있다
    모든 클래스는 Object클래스를 상속받음
    Object obj = new String();
    Object aa = new A();


오버라이드
    @Override ->부모클래스의 메서드를 재정의할 때만 붙일 수 있음
                (부모클래스에는 없는 메서드에 오버라이딩 붙이면 오류 뜸)
    toString 메서드..

    final은
    변수,..상수..
    final이 붙으면 메서드 오버라이드 불가
                  클래스 상속 불가
 */



class A extends Object{
    @Override
    public String toString() {
        return "A{}";
    }
}

    public class Ex03 extends Object {       //extends Object -> 항상 생략되어있음.
        // 오브젝트 클래스 안에 toString 메서드가 포함되어있어서 또한 생략 가능

        public static void main(String[] args) {
            A a = new A();


        }

    }
