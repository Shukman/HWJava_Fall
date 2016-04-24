package lesson150928;

import java.util.Comparator;

public class Magazin implements Comparable<Magazin> {
	
	static class ProductComparator implements Comparator<Magazin> {

		@Override
		public int compare(Magazin o1, Magazin o2) {
			return o1.product.compareTo(o2.product);
		}
		
	}
	
	static class RaznicaComparator implements Comparator<Magazin> {

		@Override
		public int compare(Magazin o1, Magazin o2) {
			return o1.raznica.compareTo(o2.raznica);
		}
	}
	
	public static final Comparator<Magazin> RAZNICA_COMPARATOR = new RaznicaComparator();	
	
	public static final Comparator<Magazin> PRODUCT_COMPARATOR = new ProductComparator();	
	
	private Magazin() {};
	
	public static Magazin register(String product, String raznica, int month, int price) {
		Magazin magazin = new Magazin();
		magazin.product = product;
		magazin.raznica = raznica;
		magazin.number = new Number();
		magazin.number.month = month;
		magazin.number.price = price;
		return magazin;
		
		
	}
	
	private static class Number {
		int month;
		int price;
		
	}
	
	String product;
	String raznica;
	Number number;
	
	
	@Override
	public String toString() {
		return product + ", "+ raznica + ", " + number.month + ", " + number.price + ";";
	}
	

	@Override
	public int compareTo(Magazin other) {
		int monthDiff = this.number.month - other.number.month;
		if (monthDiff != 0) {
			return monthDiff;			
		}
		return monthDiff;			
		
	}
}
