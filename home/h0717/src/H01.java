package h0717.src;

public class H01 {

    public static void main(String[] args) {

        Person java = new Person();

        java.name = "mine";
        java.age = 9;

        System.out.println(java.A());
    }

}


class Person {
    String name;
    int age;

    public String A() {

        return name + age;
    }
}