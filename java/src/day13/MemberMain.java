package day13;

public class MemberMain {

	public static void main(String[] args) {
		// Member 클래스 객체 선언
		// 기본생성자를 이용한 객체
		Member m1= new Member();
	   m1.id="id11";
	    m1.password = "비밀번호";
		m1.name = "이름이름";
		m1.age = 99;

      System.out.println("info");
		m1.info();
		System.out.println("update");
		m1.update("변경이름");
		m1.info();
		System.out.println("myname");
		m1.myName();
		m1.info();
		String name1 = m1.myName();
		System.out.println(m1.myName());
		System.out.println(name1);
		
		// 매개변수가 있는 생성자를 이용한 객체
		System.out.println("매개변수있는거");
		Member m2 =
				new Member("id1","pppp","이름1",11);
		m2.info();
		
		

	}

}
