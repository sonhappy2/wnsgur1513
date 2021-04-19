package day3;

// 라이브러리를 사용할 때
import java.util.Scanner;

public class Ex2_scanner {
	
	public static void main(String[] args) {	    // 스캐너 기능을 사용하기 위한 스캐너 객체 선언
	    Scanner scan = new Scanner(System.in);
//	    Scanner sc = new Scanner(System.in);
	    String name = "초깃값", address = "주소초깃값" ;
	    int age= 0;
	    System.out.println("스캐너 입력전 name : " + name);
	    System.out.print("이름을 입력하세요 : ");
	    name = scan.next();
	    System.out.println("스캐너로 입력한 name : " + name);
	    
	    System.out.println("스캐너 입력전 address : " + address);
	    System.out.print("주소를 입력하세요 : ");
	     address = scan.next();
	     System.out.println("스캐너로 입력한 address : " + address);
	    System.out.println("스캐너 입력전 age : " + age);
	    // 스캐너 클래스에서 제공하는 next() 메소드를 이용하여
	    // String 값을 입력 받을 수 있음.
	    // 이 입력한 값을 name 변수에 대입하는 문장
	    System.out.print("주소를 입력하세요 : ");
	     
	     address = scan.next();
	    System.out.print("나이를 입력하세요 : ");
	     age = scan.nextInt();
	     
	    
	    
	    
	    // address, age에도 스캐너로 값을 받아서 저장하고 저장된 값을 출력하세요
	    // 정수값을 받을 때는 nextInt() 메소드를 사용
	    
	     
	     
	  
	     System.out.println("스캐너로 입력한 age : " + age);
	     
	    
	    
		
	}

	    

}
