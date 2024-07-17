

public class Ex05 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("asdf");
        sb.append("asdff");

        System.out.println(sb);

        sb.delete(0, 2);
        System.out.println(sb);

        sb.replace(0,5, "kkk"); //0번쨰부터 5번째 전까지 "kkk"값을 바꿔라
        System.out.println(sb);

        sb.append("asdf");
        sb.reverse();
        System.out.println(sb);


    }
}
