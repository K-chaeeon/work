package qu;

/*
  1. 배열 [10,20,30,40,50] 알맞은 코드를 넣어 총합과 평균을 구하세요
 */
public class Q01 {

    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50};
        int total=0;
        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
            total +=a[i];

        }
        System.out.println("배열의 총합은 = "+total);
        System.out.println("배열의 총합의 평균은 = "+total/(a.length));
    }


}
