package ex01;

class person {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void greeting() {
        System.out.println(name + "님이 인사합니다.");
        System.out.println(name + "님은 " + age + "세 입니다.");
    }
}

public class practice {


    public static void main(String[] args) {
        person p1 = new person("김길동", 20);
        person p2 = new person("박길동", 50);

        p1.greeting();
        p2.greeting();

    }
}
