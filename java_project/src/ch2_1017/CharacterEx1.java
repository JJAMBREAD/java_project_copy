package ch2_1017;

public class CharacterEx1 {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		//ch1 변수를 형변환, 명시적 형변환. 
		// 캐스팅 연산자를 갑자기 사용하고 있음. 당황하지 마세요.
		//7장 까지는 가볍게 들어보시고, 복습하면 됩니다. 
		System.out.println((int)ch1);
		System.out.println("=====================");
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println("=====================");
		int i1 = 67;
		System.out.println(i1);
		System.out.println((char)i1);
		System.out.println("=====================");
		char ch3 = '한';
		char ch4 = '\uD55C';
		
		System.out.println(ch3);
		System.out.println(ch4);

		int a = 65;
		int b = -66;
		
		char a2 = 65;
//		char b2 = -66; 문자형 변수에 음수를 넣으면 오류가 발생하므로 주석 처리
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
		
		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		boolean isMarried = true;
		System.out.println(isMarried);
		
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
//		str=3; str 변수는 String형으로 먼저 사용되었기 때문에 정수 값을 넣을 수 없음
		
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
//		MAX_NUM = 10000; 오류 발생. 상수는 값을 변경할 수 없음
	}

}
