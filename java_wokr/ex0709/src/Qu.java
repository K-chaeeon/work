/*
1. 가위 바위 보 게임을 만들어 보자.

    사용자로부터 가위 바위 보 중에서 하나를 입력 받는다.
    그리고 컴퓨터는 난수 생성을 통해서 가위 바위 보 중에서 하나를 선택하게 한다.
     이 둘을 비교해서 승자와 패자를 가려주는 프로그램을 작성해 보자.
    단 프로그램의 진행은 사용자가 질 때까지 계속되어야 하고,
    마지막에 가서는 게임의 결과(예: 4승 3무)까지 출력해 주도록 하자.
 */

/*
가위-바위/바위-보/보-가위 =>패

스캔 가위 -> 가위=무, 바위=승, 보=패
스캔 바위 -> 가위=패, 바위=무, 보=승
스캔 보  -> 가위=승, 바위=패, 보=무
만약 fail이면 그만.


 */


import java.util.Scanner;


class GA {

    public static void doA(String aa) {

        for (int i = 0; i < 1; i++) {
            int a = (int) (Math.random() * 3);


            String bb = "";

            if (aa.equals("가위")) {

                if (a == 0) {
                    System.out.println("가위");
                    System.out.println(bb = "무승부");
                }
                if (a == 1) {
                    System.out.println("바위");
                    System.out.println(bb = "패");
                }
                if (a == 2) {
                    System.out.println("보");
                    System.out.println(bb = "승");
                }


                if (aa.equals("바위")) {

                    if (a == 0) {
                        System.out.println("가위");
                        System.out.println(bb = "승");
                    }
                    if (a == 1) {
                        System.out.println("바위");
                        System.out.println(bb = "무승부");
                    }
                    if (a == 2) {
                        System.out.println("보");
                        System.out.println(bb = "패");
                    }
                }

                if (aa.equals("보")) {

                    if (a == 0) {
                        System.out.println("가위");
                        System.out.println(bb = "패");
                    } else if (a == 1) {
                        System.out.println("바위");
                        System.out.println(bb = "승");
                    } else {
                        System.out.println("보");
                        System.out.println(bb = "무승부");
                    }

                }

            }


        }

    }
}


//    class And {
//
//        public static int doB(int a) {
//            if (a == 0) {
//                System.out.println("가위");
//            } else if (a == 1) {
//                System.out.println("바위");
//            } else {
//                System.out.println("보");
//            }
//            return a;
//        }
//    }


class Qu {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String aa = scanner.next();
        String bb = "";

        GA.doA(aa);

        if (bb.equals("승") || bb.equals("무승부")) {
            GA.doA(aa);

        } else {
            System.out.println();

//        And.doB();


//        0 = "가위";
//        1 = "바위";
//        2 = "보";


        }
    }
}


//int result = scanner.nextInt();
















