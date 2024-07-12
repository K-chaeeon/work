package ex0705.src;

//alt enter 빠른에러처리
public class Ex06 {

    public static void main(String[] args) {

        int i = 0;
        double j = 0;
        for ( ; i < 10 && j<5; ) {
            i++;
            j=j+2;

            //while모양으로 for안에 자리만 만들어놓으면 밖으로 빼놔도 됨
            //while문으로 바꾸고 true로 조건 넣으면 그 내용은 if문에 넣어줘야함
            System.out.println("i = "+i);
            System.out.println("j = "+j);


        }

    }
}
