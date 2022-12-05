package ch06_staticex_1019;

public class StudentTest1 {

	public static void main(String[] args) {
		//Student1 클래스로 객체를 생성해서, 자동으로 학번이 어떻게 부여되는지 확인.
		Student1 jmjStudent3 = new Student1();
		System.out.println("jmjStudent3의 학번: "+jmjStudent3.studentID);
		
		Student1 jmjStudent4 = new Student1();
		System.out.println("jmjStudent4의 학번: "+jmjStudent4.studentID);
		
		Student1 jmjStudent5 = new Student1();
		System.out.println("jmjStudent5의 학번: "+jmjStudent5.studentID);
		
		//static 키워드에 접근 하는 방법.
		// 인스턴스 (객체를) 생성해서 접근. 비추.
		// 해당 클래스명으로 접근.
		Student jmjStudent = new Student();
		jmjStudent.setStudentName("주민정");
		System.out.println(jmjStudent.serialNum);
		System.out.println(Student.serialNum);
		jmjStudent.serialNum++;
		System.out.println(jmjStudent.serialNum);
		System.out.println(Student.serialNum);
		
		System.out.println("jmjStudent2의 정보");
		Student jmjStudent2 = new Student();
		System.out.println(jmjStudent2.serialNum);
//		Student studentLee = new Student();
//		studentLee.setStudentName("이지원");
//		System.out.println(studentLee.serialNum); // 초깃값 출력
//		studentLee.serialNum++;					// static 변수 증가
//		System.out.println("현재 값 : " + studentLee.serialNum);
//		
//		Student studentSon = new Student();
//		studentSon.setStudentName("손수경");
//		studentSon.serialNum++;	
//		System.out.println("한번더 클래스 변수 값 증가하기. ");
//		System.out.println("studentSon 의 값" + studentSon.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee);
//		System.out.println("studentSon 의 값" + studentSon);
	}
}

