public class e00 {
//3. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오

    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;

        int i = 1;
        while (i > 0) {
            i++;
            if (i % 2 == 0) {
                sum1 = (sum1 + i);
            } else {
                sum2 = -(sum2 + i);
            }
            if (sum1 + sum2 > 100) ;
            break;
        }
        System.out.println(sum1 + sum2);
    }
}
