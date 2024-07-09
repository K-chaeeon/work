package h0709;

/*
평점에 따른 영화 추천하기

요청한 평점 이상의 영화를 찾아서 추천하는 프로그램
어바웃타임-평점9점
토이 스토리-평점8점
고질라-평점7점

평점변수는 double rating
if문 사용
 */
public class Qu3 {
    public static void main(String[] args) {
        double rating = 8;

        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이 스토리'을 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'고질라'을 추천합니다.");
        }


    }
}
