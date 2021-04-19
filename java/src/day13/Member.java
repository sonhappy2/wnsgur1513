package day13;

public class Member {
	String id; String password; String name; int age;
	
	// 생성자 선언
	// 기본생성자
	// 생성자이름 : 클래스이름과 동일함
	Member(){
		this.id=id;
		this.password=password;
		this.name=name;
		this.age=age;
	}
	// 모든 필드를 매개변수로 하는 생성자
	Member(String id, String password, String name, int age ) {
		this.id=id;
		this.password=password;
		this.name=name;
		this.age=age;
	}
	// 리턴 없고 매개변수 없음
	void info() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.name);
		System.out.println(this.age); 
	}
	// update 메소드 리턴 없 고 매개변수 있음
	void update(String name) {
		this.name=name;
	}
	// myName 메소드 리턴 있고 매개변수 없음
   String myName() {
	   return this.name;
	   
   }
	
	

}
