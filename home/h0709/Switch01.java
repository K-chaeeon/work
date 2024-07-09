package h0709;

public class Switch01 {

    public static void main(String[] args) {
        int grade = 2;

//          int coupon;
//        if (grade == 1) {
//            coupon = 1000;
//        } else if (grade == 2) {
//            coupon = 2000;
//        } else if (grade == 3) {
//            coupon = 3000;
//        } else {
//            coupon = 500;
//        }


        //switch문으로 바꿈

//        int coupon;
//        switch (grade) {
//            case 1:
//                coupon = 1000;
//                break;
//            case 2:
//                coupon = 2000;
//                break;
//            case 3:
//                coupon = 3000;
//            default:
//                coupon = 500;
//        }
//
//        System.out.println("발급받은 쿠폰" + coupon);


        //새로운 switch문

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰"+coupon);



    }
}

//switch문은 조건식이 특정 case와 같은지 체크만 할 수 있다.

