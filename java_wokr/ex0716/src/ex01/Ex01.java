package ex01;

//Person
class Personn {
    private String name;  //펴블릭 아니라서 메인함수에서 참조를 못함
    private int age;

//    public Person(){      //^^^^^^^^^^^^^^^^^^^
//
//    }


    public Personn(String name) {            //@@@@@@@@@@@@@@@
        this.name = name;
    }

    //행동하는 메서드(함수)
    public void greeting() {
        System.out.println(this.name + "님이 인사를 합니다."); //같은 메서드 안에 name변수가 있으면 this.생략 불가능

    }

    public void setName(String name) {              //####################
        this.name = name;  //this생략하면 다른 메서드에서 입력한 name을 쓸 수 없음
    }

    @Override   //재정의
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//constructor(생성자)로 private 변수를 바꿀 수 있다. @@@@@@@@@@@@@@@@@@@@@@@
//setter로 private 변수를 바꿀 수 있다.              #######################

public class Ex01 {

    public static void main(String[] args) {
//기본생성자 선언 후 setter로 변수 name변경
        Personn p1 = new Personn("홍길동");
        //name을 바꾸는 다른 생성자로 선언해서
        Personn p2 = new Personn("박길동");
//        p1.setName("홍길동");   //다른 생성자 선언시 기본 생성자 생략 불가능      ^^^^^^^^^^^^^^^^^^^^^

        p1.greeting();
        p2.greeting();

        System.out.println(p1);
        System.out.println(p2);
    }
}
