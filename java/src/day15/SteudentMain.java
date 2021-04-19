package day15;

import java.util.ArrayList;
import java.util.List;

public class SteudentMain {

	public static void main(String[] args) {
	  Student stu1 = new Student();
	  // setter를 이용하여 필드값 지정
	  // private으로 지정했기 때문에 접근불가
	  
	  stu1.setName("학생1");
	  stu1.setPhone("010-1111-1111");
	  stu1.setAddress("인천광역시");
	  
	  // getter를 이용하여 필드값 가져오기
	  String var2 = stu1.getName();
	  System.out.println(var2);
	  System.out.println("확인");
	  System.out.println(stu1.getAddress());
	  
	  Student stu2 = new Student();
	  
	  stu2.name = "학생2 변경";
	  stu2.setName("학생2 변경");
	  
	  // Student 객체를 ArrayList에 저장하기
	  // Student 객체를 담을 수 있는 ArrayList 필요
	  List<Student> stuList = new ArrayList<Student>();
	  
	  stuList.add(stu1);
	  stuList.add(stu2);
	  
	  // stuList의 0번 인덱스에 저장한 stu1의 name값 출력해보기
	  System.out.println(stuList.get(0).getName());
	  System.out.println(stuList.get(1).getName());
	  
	  
	  

	}

}
