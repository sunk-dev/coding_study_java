package src.ch05_배열;

public class 배열개념 {
    public static void main(String[] args) {
//        배열 선언
        int[] arr={0,0,0,0,0,0};
        int [] arr1=new int[6];// 위와 결과값 동일

//        배열과 차원
//        배열은 차원과 무관하게 메모리에 연속 할당됨
//        2차원 배열
        int[][] arr2={{1,2,3},{4,5,6}};
        System.out.println(arr2[1][2]);

        //arr2[1][2]에  저장된 값을 7로 변경
        arr2[1][2]=7;
        //변경된 값출력
        System.out.println(arr2[1][2]);
    }
}
