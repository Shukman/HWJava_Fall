package lesson150917;

public class UseA {
	
	public static void main(String[] args) {
		A.staticMethod(); //стандартное, правильное обращение к статическому методу. указываю им€ класса и дальше им€ метода
		
		A a = new A(); // () дефолтный конструктор
		
		A.staticMethod(a); //сработает так как указали ссылку на экземпл€р
		
//		a.x = 10; //нельз€, так как х приватно
		
//		A.globalCount = 0;  ERROR
		
		A a2 = new A(90); //второй экземпл€р
		
		A.printCount();
	}

}
