package ch05_test2_1202;

public class PersonTest {
   
	 public static void main(String[] args) {
		 //기본 생성자 호출
		 Person jmj = new Person();
	//	  jmj.name = "주민정";
		  jmj.weight = 100;
		  jmj.height = 170;
		  jmj.setName("주민정세터로추가했음.");
		  jmj.showInfo();
		  System.out.println("get메서드로 이름호출"
				  +jmj.getName());
		  
		  //set(메서드)를 이용해서 name 값 설정하기.

		  
		  // 매개변수가 1개인 생성자를 호출.
		  Person jmj2 = new Person("주민정");
		  jmj2.weight = 100;
		  jmj2.height = 170;
		  jmj2.showInfo();
		  
		  // 매개변수가 3개인 생성자를 호출.
		  Person jmj3 = new Person("주민정", 100, 170);
		  jmj3.showInfo();
//		  personKim.name = "������";
//		  personKim.weight = 85.5F;
//		  personKim.height = 180.0F;
//		
//		  Person personLee = new Person("�̼���", 175, 75);
	 }
}
