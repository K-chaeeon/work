package Ex0711.src.an;

/*
3. 필자가 좋아하는 것 중 하나가 금요일 저녁 퇴근길에 DVD나 만화책을 잔뜩 빌리고,
동네 슈퍼에 들러서 군것질거리를 사 가지고 집에 들어가는 것이다.
오늘은 금요일이다. 현재 필자의 주머니에는 5천 원이 있다.
DVD 한 편을 빌리면 3,500원이 남는다.
슈퍼에 들려서 크림빵(500원), 새우깡(700원), 콜라(400원)를 사려한다.
잔돈을 하나도 남기지 않고 이 세 가지 물건을 하나 이상 반드시 구매하려면
어떻게 구매를 진행해야 하겠는가? 물론 여기에는 여러 가지 경우의 수가 있을 것이다.

 */

public class An02 {

    public static void main(String[] args) {
        int total = 5000;
        System.out.println("DVD 한 편 빌려서 3500원");
        System.out.println();
        total = 3500;

        int cri = 500;
        int sa = 700;
        int cock = 400;

        total = total - (cri + sa + cock);
        System.out.println("기본 하나씩 사면 남은 돈 " + total + "을 마저 다 써야 한다.");
        System.out.println();

//        1900 = 500*3 + 700*0 + 400*1
//               500*1 + 700*2 + 400*0

        /*
        cri 0~3 4부턴 2000 넘음
        sa 0~2
        cock 0~3
        1900원 일 때 출력하면 댐
         */
        System.out.println("결국 3,500원으로는");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    if (1900 == (cri * i + sa * j + cock * k)) {
                        System.out.println("======================");
                        System.out.println("i= " + i + ", j= " + j + ", k= " + k);
                        System.out.println("크림빵은 " + (1 + i) + "개");
                        System.out.println("새우깡은 " + (1 + j) + "개");
                        System.out.println("콜라는 " + (1 + k) + "개 살 수 있다.");
                        System.out.println("======================");
                        System.out.println();
                    }
                }
            }
        }

    }


}
