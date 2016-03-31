package lesson150922;

public class Specification {
	
	static abstract class Pet { //спецификация родителя остается на потомке, что делать, должен решить потомок
		abstract void wash();
	}
	
	static class Dog extends Pet{

		@Override
		void wash() { //должен соблюдаться принцып подстановки
			System.out.println("washing dog");			
		} 
		
	}

}
