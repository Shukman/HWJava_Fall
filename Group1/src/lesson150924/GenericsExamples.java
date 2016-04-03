package lesson150924;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GenericsExamples {
	
	public static void main(String[] args) {
		
		List list = new LinkedList();
		
		list.add(10);
		
		list.add("Hello");
		
		List<String> listOfString = Collections.checkedList(new LinkedList<String>(), String.class);
		
		listOfString.add("Hello");
//		listOfString.add(10); ERROR!
		
		List t = listOfString;
//		t.add(10); Runtime Exception!
		
		List<String> menu = Arrays.asList("Steak", "Fri", "Chiken"); //список строк
//		List<String> menu2 = Arrays.asList(10, 20 , 30); ERROR! возрожает так как это список из чисел
//		List<Integer> menu2 = Arrays.asList(10, 20 , 30); OK!
		
//		print(menu); Runtime Exception!
		
		List<String> menu3 = new ArrayList<>();
		menu3.add("One");
		menu3.add("Two");
		menu3.add("Three");
		
		print(menu3);
		
		System.out.println(menu3);
		
		menu3 = Collections.unmodifiableList(menu3); //не даст потэйто появится в списке

		print(menu3);
	}

	private static void print(List<String> menu) {
		menu.add("Potato");
		
	}

}
