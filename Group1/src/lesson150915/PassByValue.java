package lesson150915;

public class PassByValue { //передача параметров по значению (переменного типа)
	
	public static void main(final String[] args) {
		
		final int x = 10; // в качестве параметра число
		
		change(x); // 10
		
		System.out.println(x); 
	}

	static void change(final int x) { //другая х, тк другая функция (x=10)
//		x = 20; ERROR
		
	}

}
