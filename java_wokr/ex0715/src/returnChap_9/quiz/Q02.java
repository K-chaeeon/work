package returnChap_9.quiz;

/*
  2. int[][] arr = {
        { 5, 5, 5, 5, 5},
        {10,10,10,10,10},
        {20,20,20,20,20},
        {30,30,30,30,30}
    };
    arr 배열을 총합과 평균을 구하는 프로그램을 작성하세요
 */
public class Q02 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                a = a + (arr[i][j]);


            }

        }
        System.out.println(a);
    }
}


