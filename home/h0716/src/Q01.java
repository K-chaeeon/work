/*
public static void main(String[] args) {
 int a = 1;
 int b = 2;
 int c = 3;
 int sum = a + b + c;
 double average = sum / 3.0;
 System.out.println("평균값: " + average);
 int x = 15;
 int y = 25;
 int z = 35;
 sum = x + y + z;
 average = sum / 3.0;
 System.out.println("평균값: " + average);
 }
}
위 코드를 리팩토링
 */

public class Q01 {

    //    public static void doA(int a, int b, int c) {
//        int sum = a + b + c;
//        double average = sum / 3;
//        System.out.println(average);
    public static double average(int a, int b, int c) {
        int sum = a + b + c;

        return sum / 3.0;

    }


    public static void main(String[] args) {

//        doA(1,2,3);
//        System.out.println();
//        doA(15,25,35);
        System.out.println(average(1,2,3));
        System.out.println(average(15,25,35));

    }


}
