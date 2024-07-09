package h0709;

/*
특정 금액을 미국 달러에서 한국 원으로 변환하는 프로그램을 작성하자. 환율은 1달러당 1300원이라고 가정한다.

달러가 0 미만->잘못된 금액입니다
달러가 0일 때->환전할 금약이 없습니다
달러가 0 초과일 때->환전 금액은 (계산원화)원입니다
 */
public class Qu2 {
    public static void main(String[] args) {
        int dollar = 150;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println("환전 금액은" + won + "원입니다.");


//            System.out.println("환전 금액은" + dollar * 1300 + "원입니다.");
        }


    }


}
