package ch03_test_1018;

public class OperationEx3 {
	public static void main(String[] args) {

		int num1 = 10;
		int i = 0;
		int sum = num1/i;
		System.out.println("num1, i 값을 대입 후,");
				
				
		boolean value = ((num1 = num1 + 10 ) < 10) && ( ( i = i + 2 ) < 10);
		System.out.println("value의 값을 결과 비교후 1");
		
		System.out.println("value의 값"+ value);
		System.out.println("num1의 값"+num1);
		System.out.println("i의 값"+i);
		
		value = ((num1 = num1 + 10 ) > 10) || ( ( i = i + 2 ) < 10);
		System.out.println("value의 값"+value);
		System.out.println("num1의 값"+num1);
		System.out.println("i의 값"+i);
	}
}
