package aa.bb;

import java.sql.PreparedStatement;

public class Fact {

    public int aa(int num) {  //int num에 result값 넣어줌
        System.out.println("test 전"+num);
        num = num+1;  //An01 main의 resaul값이 30으로 바뀐 건 아님
        System.out.println("test후 = " + num);
        return 1;
        //result값을 num값으로 바꾸고 싶으면 return num;으로 바꿔서 활용
        //      return num;



    }
}


//??? 왜 Main에 있는 result로 안 쓰고 int num으로 쓰는쥐 -> 다른 메모리에 있다는 걸 구분하기 위해
//                                                     같은 걸로 적는다고 둘이 연동되는 것은 아님
//                                                     Main에서 받은 값을 Fact메서드에 가져와서 부여하는 것일 뿐


