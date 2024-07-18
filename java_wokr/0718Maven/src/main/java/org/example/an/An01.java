package org.example.an;

import lombok.AllArgsConstructor;
import lombok.ToString;

//spring가면 @Getter @Setter @toString

@ToString
@AllArgsConstructor
public class An01 {

        private String name;
        private int kor;
        private int eng;
        private int math;


//    public An01(String name, int kor, int eng, int math) {          //생성자
//        this.name = name;
//        this.kor = kor;
//        this.eng = eng;
//        this.math = math;


//    }

    public float getAverage(){
        return (kor+eng+math)/(float)3;
    }
    public int getTotal(){

            return kor+eng+math;
    }



//    @Override
//    public String toString() {              //@@@@@@@@@@@@@@@@@@@@@@@@@@
//        return "An01{" +
//                "name='" + name + '\'' +
//                ", kor=" + kor +
//                ", eng=" + eng +
//                ", math=" + math +
//                '}';
//    }
}



