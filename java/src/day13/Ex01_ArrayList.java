package day13;

import java.util.ArrayList;
import java.util.List;



public class Ex01_ArrayList {

	public static void main(String[] args) {
		// ArrayList
		/*
		 * collection Framework : List, Set, Map
		 */
		// ArrayList 선언(저장데이터 타입 : String)
		List<String> list = new ArrayList<String>();
		
		// list 에 데이터 저장 : add 메소드 호출
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add("네번째");
		list.add("다섯째");
		
		// list에 담긴 데이터 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// list 크기 확인
		System.out.println(list.size());
		
		// list 데이터 삭제
		list.remove(1);
		System.out.println(list.get(1));
		
		System.out.println("for문시작");
		// for문을 이용하여 list에 담긴 모른 데이터 출력
		for(int i=0; i<list.size();i++) {
			
				System.out.println(list.get(i));
			
		}
     // list에 정수를 저장할때  
		List<Integer> list1 = new ArrayList<Integer>(); // wrapper Class
		
		String var = "값";
		
        
	}

}
