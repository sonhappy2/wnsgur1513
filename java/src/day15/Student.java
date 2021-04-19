package day15;

public class Student {

	/*
	 * 접근 제한 자 : public, default public : 누구나 접근 가능 private : 클래스 내에서만 접근이 가능함. 다른
	 * 클래스
	 */
//    Student Class
//    -이름(name), 전화번호(phone), 주소(address)필드
//    생성자
//    -기본생성자
//    -모든 필드를 매개변수로 하는 생성자
//    
//    StudentMain class
//    student클래스 객체를 선언하고 필드값을 지정한 후 이 객체를 ArrayList에 저장.

	// 필드
	String name;
	String phone;
	String address;

	// 기본 생성자
	Student() {

	}

	// 매개변수 있는 생성자
	Student(String name, String phone, String address) {

	}

	// name필드의 getter
	// 필드값을 가져다 쓸 때
	// 필드값 다입의 리턴
	public String getName() {
		return name;

	}

	// name필드의 setter
	// 필드값을 바꿀 때
	// 리턴 없음.
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		
		
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	// 필드는 private으로 선언하고
	// get 메소드 set 메소드를

}
