package lesson150928;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UseMagazin {
	
	public static void main(String[] args) {
		
		List<Magazin> magazins = new LinkedList<>();
		
		magazins.add(Magazin.register("ћ€со", "бекон", 3, 100));
		magazins.add(Magazin.register("–ыба", "лосось", 2, 120));
		magazins.add(Magazin.register("ќвощи", "капуста", 4, 120));
		magazins.add(Magazin.register("‘рукты", "€блако", 1, 110));
		magazins.add(Magazin.register("‘рукты", "€блако", 7, 100));
		magazins.add(Magazin.register("–ыба","лосось", 6, 110));
		magazins.add(Magazin.register("–ыба", "тунец", 1, 160));
		magazins.add(Magazin.register("‘рукты","клубника", 4, 160));
		magazins.add(Magazin.register("ћ€со", "гов€дина", 3, 180));
		magazins.add(Magazin.register("‘рукты", "клубника", 7, 180));
		
		
		Collections.sort(magazins);
		
		System.out.println(magazins);
		
		Collections.sort(magazins, Magazin.PRODUCT_COMPARATOR);
		
		System.out.println(magazins);

		Collections.sort(magazins, Magazin.RAZNICA_COMPARATOR);
		
		System.out.println(magazins);
	}

}
