package h0709;

public class Samhang1 {

    public static void main(String[] args) {

        int age = 20;

//        if (age >= 18) {
//            System.out.println("성인입니다");
//
//        } else {
//            System.out.println("미성년자입니다");

        String statue = (age >= 18) ? "성인" : "미성년자";

        System.out.println("age = " + age + " statue = " + statue);


    }

}
