package lesson150922.inheritance.vs.composition;

public class Composition {
	
	static class A {
		void doIt() {
			System.out.println(this.getClass().getSimpleName() + " is working");//обращаюсь к этому объекту,беру ссылку на объект описывающий его класс,беру у него его название,без имени пакета
			
		}
	}
	
	static class B extends A {
		
	}
	
	static class C {
		A a = new A(); 
		void doIt() {
			a.doIt();
		}
	}
	
	static class D {
		A a;
		D(A a) {//можем передать ссылку на А что бы он работал как В
			this.a = a; 
		}
		void doIt() {
			a.doIt();
		}
	}
	
	static class E {
		A a;
		
		void setA(A a) {
			this.a = a;
		}
		
		void doIt() {
			a.doIt();
		}
	}
	
	static class F {
		void doIt(A a) {
			a.doIt();
		}
		
	}
	
	public static void main(String[] args) {
		
		A a = new A(); a.doIt();
		B b = new B(); b.doIt();
		C c = new C(); c.doIt();
		D d = new D(new B()); d.doIt();
		E e = new E(); e.setA(new A()); e.doIt();
		F f = new F(); f.doIt(new B());
	}
	

}
