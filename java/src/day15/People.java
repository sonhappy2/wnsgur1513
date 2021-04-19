package day15;

public class People {
//	People Class
//	*필드(접근제한자는 private로)
//	-이름(name), 주민번고(rNumber), 주소(address), 나이(age)
//	*생성자
//	  -기본생성자, 모든 필드를 매개변수로 하는 생성자
//    PeopleMain Class
//    *People클래스 객체를 3개만들어서 각각 필드값을 입력한 뒤
//     -객체를 만들 때는 기본생성자를 활용
//     *peopleList라는 ArrayList에 저장
//     *ArrayList에 담긴 모든 데이터 출력
	
	private String name;
	private String rNumber;
	private String address;
	private int age;
	
	People(){
		
	}
	
	public People(String name, String rNumber, String address, int age) {
		// 부모클래스가 가지고 잇는 생성자를 호출
		super();
		this.name = name;
		this.rNumber = rNumber;
		this.address = address;
		this.age=age;
	}
}
