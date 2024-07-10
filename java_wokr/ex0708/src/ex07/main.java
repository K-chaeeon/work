package ex07;

public class main {

    public static void main(String[] args) {
        box a = new box();
        box b = new box();

        System.out.println(a);
        System.out.println(b);


        a.setName("사과"); //함수호출
        System.out.println(a);
        System.out.println(b);
        b.setName("수박");
        System.out.println(a);
        System.out.println(b);
    }

}
