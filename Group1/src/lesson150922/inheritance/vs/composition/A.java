package lesson150922.inheritance.vs.composition;

public class A {
	
	int state; //целочисленное значение
	
	public A() {
		this(10);
	
	}
	
	public A (int initialState){
		state = initialState;
	}
	
	
	public void change() {// просим его изменить состояние
		state++;
	}

}
