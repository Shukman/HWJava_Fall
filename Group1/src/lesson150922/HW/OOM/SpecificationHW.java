package lesson150922.HW.OOM;

public class SpecificationHW {
	
	static abstract class Plant { 
		abstract void irrigate();
	}
	
	static class Flower extends Plant {
		@Override
		void irrigate() {
			System.out.println("iriigated flower");
		}
	}
	
	
	public static void main(String[] args) {
		Flower b = new Flower();
		b.irrigate();
	}

}
