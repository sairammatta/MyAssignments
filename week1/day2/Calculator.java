package week1.day2;

public class Calculator {

	public static void main(String[] args) {

		Calculator cal=new Calculator();
		int addition=cal.addThreeNumbers(2, 0, 3);
		float substraction=cal.subtwoNumbers(2,1.35f);
		int division=cal.twoNumbers(4, 2);
		
		System.out.println("addition values are "+addition);
		System.out.println("substraction values are "+substraction);
		System.out.println("division values are "+division);
		
		
	}

	public int addThreeNumbers (int a , int b , int c) {
		return a+b+c;
	}
	
	public float subtwoNumbers (int a , float b ) {
		return a-b;
	}
	
	public int twoNumbers (int a , int b ) {
		return a/b;
	}
}
