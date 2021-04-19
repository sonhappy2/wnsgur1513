package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02_ArrayListEx {

	public static void main(String[] args) {
		/*
		 * ArrayList에 영어로 된 단어 5개를 소캐너로 입력 받고
		 * 입력받은 단어를 모두 출력하고
		 * 마지막에는 가장 긴 단어를 출력하세요
		 */
		String a;
		int max=0;
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		System.out.print("단어 입력 : ");
		a=sc.next();
		System.out.print("단어 입력 : ");
		a=sc.next();
		System.out.print("단어 입력 : ");
		a=sc.next();
		System.out.print("단어 입력 : ");
		a=sc.next();
		System.out.print("단어 입력 : ");
		a=sc.next();
		list.add(a);
		list.add(a);
		list.add(a);
		list.add(a);
		list.add(a);
		for(int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));
		
		}
		for(int i=0; i<a.length(); i++) {
			;
		}
		
		System.out.println("가장 긴 단어는 : " );
	}

}
