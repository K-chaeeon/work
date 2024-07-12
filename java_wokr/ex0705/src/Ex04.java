package ex0705.src;

public class Ex04 {




    public static void main(String[] args) {
        //   int result = add();
        // System.out.println("result = "+result);
        // =
        System.out.println("result ="+add());  //111111 로
        System.out.println("result ="+add(5));  //222222로

    }

    public static int add() {               //111111
        System.out.println("기본 add");
        return 10;
    }

    public static int add(int mun) {         //222222
        System.out.println("num add");
        return 10;
    }

    }



