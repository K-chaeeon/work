
public class Person {

    private String jumun;
    private String passport;

    public Person() {
//기본생성자 선언
    }

    public Person(String jumun) {       //@@@@@@이쪽으로 감 (잘 안 씀)

    }

    public Person(String jumun, String passport) {

//            this(jumun);        //@@@@@@@
        this.jumun = jumun;
        this.passport = passport;

    }

    @Override
    public String toString() {
        return "Person{" +
                "jumun='" + jumun + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }

    public void show() {
        System.out.println("jumin= " + jumun);
        System.out.println("passport= " + passport);

    }

}


