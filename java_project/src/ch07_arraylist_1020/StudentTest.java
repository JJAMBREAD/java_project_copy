package ch07_arraylist_1020;


public class StudentTest {

	public static void main(String[] args) {
		//기본
		//본인 이름의 Student 형으로 객체를 생성합니다. 학번은 임의로
		//본인 수강하고 싶은 과목 3개를 등록하기 (정수 포함), 예) java, spring, Android
		//해당 정보 출력하기. showStudentInfo 활용하기.
		Student jmj = new Student(1004, "주민정");
		jmj.addSubject("java", 70);
		jmj.addSubject("python", 85);
		jmj.addSubject("C++", 100);
		System.out.println("======================================");
		
		
		//응용
		// LunchMenu : ArrayList 만들어서 Student 클래스에 추가해서,
		// 점심 메뉴 추가하는 기능, 출력하는 기능등을 만들어서, 출력해보기.
		// 참고는 Subject를 참고해서 만들어보기.
		jmj.addLunchMenu("스테이크",8900,"자라 건물 5층인데 만화카페 옆 로봇이 배달해줌. 먹을만함.");
		jmj.showStudentInfo();
		
		
		Student studentLee = new Student(1001, "Lee");
		
		//해당 과목 리스트에 과목을 추가하기. 객체를 추가한것.
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		//본인 이름으로 과목 추가해서 , 출력해보기. 시간 3분.
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		Student studentLsy = new Student(1003, "이상용");
		
		//본인 이름으로 과목 추가해서 , 출력해보기. 시간 3분.
		studentLsy.addSubject("국어", 70);
		studentLsy.addSubject("수학", 85);
		studentLsy.addSubject("영어", 100);
		
//		studentLee.showStudentInfo();
//		System.out.println("======================================");
//		studentKim.showStudentInfo();
//		
		System.out.println("======================================");
		studentLsy.showStudentInfo();
		
		
	}
}
