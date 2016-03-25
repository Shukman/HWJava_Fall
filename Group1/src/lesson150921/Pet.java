package lesson150921;

public class Pet { //описали общие поведения для всех животных
	
	public void feed() { //покормить
		System.out.println("Pet is not hungry now");
	}
	public void walk() { //прогулка
		System.out.println("You walked with your pet");
	}
	public void play() {//поиграть
		System.out.println("Played with pet");
	}
	
	public final void care() {//pet = cat
		feed();
		walk();
		play();
		
		special();
		
	}
		
	public void special() {
			
	}
	

}
