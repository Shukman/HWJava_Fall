package lesson150921;

public class InheritanceMethods {
	
	static class A { //создаем класс ј
		
		int calc() { 
			return 2 * 2; //создаем метод
		}
		
	}
	static class B extends A { //обращаемс€ к классу ј за его методом
		
		@Override //переопредел€ем метод класса ј на свой метод класса ¬
		int calc() {
			return 10 + super.calc(); //переопределили метод и вернулись к 10 и прибавили метод класса ј через супер 
		}
		int calcSuper() { //создали новый метод
			return super.calc();//сделали возврат  к методу
		}
	}
	
	static class C extends B {//обращаемс€ к методу ¬ через —
		@Override //переопредел€ем метод
		int calc() {
			return calcSuper(); //возвращаемс€ уже к калксупер, который у нас равен 4 тк в ¬ классе переопределили на свой который возвращаетс€ из класса ј
		}
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.calc());
		
		B b = new B();
		System.out.println(b.calc());
		
		C c = new C();
		System.out.println(c.calc());
	}

}
