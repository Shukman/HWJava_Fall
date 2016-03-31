package lesson150922.interfaces;

public class GarbageCollector {
	
	public static void main(String[] args) {
		
		Car car = new Car();//ссылка на машину
		Table table = new Table();//ссылка на стол
		
		Crashable[] things = {car, table};
		
		collect(things);
	}

	private static void collect(Crashable[] things) {
		for (Crashable crashable : things) {
			crashable.crash();
		}
		
	}

}
