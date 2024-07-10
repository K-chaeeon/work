package Ex071010.src.An;

/*
프로그램 시분초 출력
 */
public class An01 {

    public static void main(String[] args) {

        CalSecond calSecond = new CalSecond();


        int retValue = calSecond.inputNumber();
        System.out.println(retValue);

       String calculate = calSecond.calculate(retValue);
        System.out.println(calculate);

//      System.out.println(calSecond.inputNumber());


//        CalSecond calSecond2 = calSecond;
//
//        System.out.println(calSecond);
//        System.out.println(calSecond2);

    }
}
