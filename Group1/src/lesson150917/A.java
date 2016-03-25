package lesson150917;

public class A { //работа со статиками
	
	private static final int NONE = -1;

	private static int globalCount; //глобальный счетчик
	
	private int x; //поле экземпл€ра (если мы создадим экземпл€р класса ј, то в нем будет переменна€ х, целочисленна€)
	
	public A(int x) {
		this.x = x; //указываем точно, с чем мы работаем
		globalCount++; //увеличиваем его на 1
	}
	
	
	public A() {
		this(NONE); //значение по умолчанию -1
	}


	public static void staticMethod() {
		System.out.println("static");
//		this.x = 10; ERROR!
	}
	
	public static void staticMethod(A a) { //есть ссылка на экземпл€р а
		a.x = 10;
	}


	public static void printCount() {
		System.out.println("Count = " + globalCount);
		
	}

	
}
