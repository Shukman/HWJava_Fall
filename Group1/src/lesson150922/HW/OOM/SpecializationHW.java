package lesson150922.HW.OOM;

public class SpecializationHW {
	
	static class Tree {
		
		public void irrigate() {
			System.out.println("Growing a Big Tree after irrigated");
		}
	}
	
	static class Flower extends Tree {
		
		@Override
		public void irrigate() {
			super.irrigate();
			bloom();
			System.out.println("blooming a beautiful flower");
		}
		
		private void bloom() {
			System.out.println("after irrigated flower");
			
		}
			
	}
	
	public static void main(String[] args) {
		Flower b = new Flower();
		b.irrigate();
		System.out.println("growthing a big forest");
		
	}
	
	
	
	

}
