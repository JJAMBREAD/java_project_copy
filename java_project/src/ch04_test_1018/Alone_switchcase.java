package ch04_test_1018;

public class Alone_switchcase {
public static void main (String[]args) {
	int floor = 6;
	String ment;
	
	switch(floor) {
	case 1: ment = "1층 약국";
	break;
	case 2: ment = "2층 정형외과";
	break;
	case 3: ment = "3층 피부과";
	break;
	case 4: ment = "4층 치과";
	break;
	case 5: ment = "5층 헬스클럽";
	break;
	
	default: ment = "존재하지 않는 층";
	}
	System.out.println(ment+"입니다.");
	}
}
