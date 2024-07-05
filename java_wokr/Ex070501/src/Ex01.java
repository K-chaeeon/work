import java.sql.SQLOutput;

//shift f10 현재 실행된 파일 실행
//ctrl shift f10 열려있는 파일 실행
//ctrl alt L 정렬
//alt1 프로젝트 경로->esc누르면 다시 돌아옴
//alt insert 파일 생성
//ctrl E 파일 이동창
//shift shift 파일찾기
public class Ex01 {
    public static void main(String[] args) {
/*
1+(1+2)+(1+2+3)+...+(1+2+3+...+10)의 결과
i = 0일 때 j가 0에서 0+1미만 반복해라
i=1 -> j가 0에서 0+1미만 반복해라
i=2 -> j가 0에서 2+1미만 반복해라
i=3 -> j가 0에서 3+1미만 반복해라
...
i=10 -> j가 0에서 10+1미만 반복해라
 */
        int sum = 0;
        for (int i = 0; i < 11; i++) {

            for (int j = 1; j < i + 1; j++) {
                System.out.println("j = " + j);
                sum = sum + j;

           }
            System.out.println("sum = " + sum);

        }
        System.out.println("sum = " + sum);
    }
}

