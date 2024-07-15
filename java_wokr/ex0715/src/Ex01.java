import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {

        int num[][] = new int[4][3];

        System.out.println(num.length);
        System.out.println(num[0].length);
        System.out.println(num[1].length);
        System.out.println(num[2].length);
        System.out.println(num[3].length);
//        System.out.println(num[4].length);   X
        System.out.println();

        int a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = a++;

            }
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {           //=  for (int i = 0; i < num.length; i++)
            for (int j = 0; j < 3; j++) {       //=  for (int j = 0; j < num[i].length; i++)
                System.out.print(num[i][j]+"\t");

            }
            System.out.println();
        }

        System.out.println(a);

        System.out.println(Arrays.toString(num[0]));        //외워라
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));
        System.out.println(Arrays.toString(num[3]));

        System.out.println();

        Arrays.fill(num[0],20);       // -> 숫자 채우기
        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));
        System.out.println(Arrays.toString(num[3]));

    }

}
