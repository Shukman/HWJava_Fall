package lesson150917;

public class B {//жизненный цикл создания объектов (пример)
	
	//1  - only once! выполняется первый (и только раз)
	
	static {
		System.out.println("static");
	}
	// 5 выполняется пятый и за остальными
	public B() {
		System.out.println("constructor");
	}
	//3 выполняется третий, не смотря на то что находится другим по счету
	{
		System.out.println("instance");
	}
	// 2 - only once выполняется второй и только раз
	static {
		System.out.println("static2");
	}
	// 4 выполняется четвертый, не смотря на то что находится последним
	{
		System.out.println("instance2");
	}
}
