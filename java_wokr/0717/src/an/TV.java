package an;

public class TV {

    private String name;
    private int year;
    private int inch;

    public TV(String name, int year, int inch) {
        this.name = name;
        this.year = year;
        this.inch = inch;
    }
    //알트 인서트 ->constructor  =생성자 자동으로 만들어줌

    public void show() {
        System.out.println(name+"에서 만든 "+year+"년형 "+inch+"인치 TV");
    }

//    public TV(String n,int y, int in ){
//        name = n;
//        year = y;
//        inch = in;
//
//    }


}

