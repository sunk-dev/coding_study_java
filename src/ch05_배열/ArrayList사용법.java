package src.ch05_배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayList사용법 {
    public static void main(String[] args) {
        // ArrayList: 자바에서 크기가 동적으로 변경되는 배열이 필요할때 사용
        //선언
        ArrayList<Integer>list=new ArrayList<>();
        //리스트의 맨끝에 데이터 추가
        list.add(1);
        System.out.println(list);
        list.add(2);
        System.out.println(list);
        list.add(3);
        System.out.println(list);
        // 다른 컬렉션으로 부터 데이터 초기화
        //ArrayList 생성자의 매개변수로 컬렉션을 넘기면 매개변수로 넘긴 컬렉션에 담긴 데이터로 초기화 할수 있음
        ArrayList<Integer>list2=new ArrayList<>(list);
        System.out.println(list2);
        //get() 메서드로 인덱스로 통해 데이터에 접근
        System.out.println(list.get(1));

        //remove()메서드로 데이터 삭제
        // remove() 메서드는 데이터를 삭제하는 위치에따라 데이터를 복사하는 연산이 필요하므로 O(N) 까지 증가할수 있기때문에 주의
        list.remove(list.size()-1); //끝에 있는 데이터 삭제
        System.out.println(list);

        //ArryList 연관 메서드
        int [] arr={1,2,4,5,3};
        System.out.println(arr.length);
        Arrays.sort(arr,1,3); //정렬 [1,2,3,4,5]-> 이런식으로 인덱스를 줘서 특정범위만 정렬 가능
        //배열의 모든 배열은 String 으로 변환
        System.out.println(Arrays.toString(arr)); //출력 [1,2,3,4,5]
        
        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(1,2,4,5,3));
//        ArrayList의 전체 데이터 개수를 반환
        System.out.println(list3.size());
//        저장된 데이터 여부를 반환
        System.out.println(list3.isEmpty());
//        ArrayList의 모든 데이터 정렬
        Collections.sort(list3)
        System.out.println(list3);
        

    }
}
