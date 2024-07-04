public class q1-2 {
    
    public static void doA()
    int sum = 0;
    for (int i = 0; i <= 20; i++) {
        if (i%2!=0&&i%3!=0) {
            System.out.println(i);
            sum+=i;
        }
    }
    System.out.println("sum = " + sum);
}


