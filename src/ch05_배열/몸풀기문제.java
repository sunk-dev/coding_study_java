package src.ch05_배열;

import java.util.ArrayList;
import java.util.Arrays;

public class 몸풀기문제 {
    //정수배열을 정렬해서 반환하는 solution()함수를 작성하시오.

    public static void main(String[] args) {

    }
    private  static int[] solution(int[] arr){
        Arrays.sort(arr); //-> 원본 배열 자체를 변환 시킴
        return  arr;
    }

    private  static int[] solution2(int[] arr){
        int[] clone=arr.clone(); //-> 원본 배열을 복사하여 새 배열을 반환
        Arrays.sort(clone);
        return  clone;
    }
    
}
