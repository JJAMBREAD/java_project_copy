package ch05_test_1018;

public class Mantest {
	public static void main(String[]args) {
	Man man = new Man();
	man.name="James";
	man.age=40;
	man.isMarried=true;
	man.numOfChildren=3;
	
	System.out.println("나이:"+man.age);
	System.out.println("이름:"+man.name);
	System.out.println("결혼여부:"+man.isMarried);
	System.out.println("자녀수:"+man.numOfChildren);
}
}

