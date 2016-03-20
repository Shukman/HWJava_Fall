package start;

public class Hello {
	
	public static void main(String[] args) {
		System.out.println("Hello, world!!!");
		
		for (int arg = 0; arg < args.length; arg++){ // цикл for, автоматически добавлять блоки
			System.out.println("arg" + args[arg]);  // то что нужно вывести на экран (arg)
		}	
		
		
	}

}
