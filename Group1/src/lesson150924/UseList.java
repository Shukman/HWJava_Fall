package lesson150924;

public class UseList {
	
	public static void main(String[] args) {
		
		MyList<String> list = new MyList<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
//		list.add(10); ERROR! тк список из строк!
		
		System.out.println(list);
		
		HWMyList2<String> list2 = new HWMyList2<>();
		
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		
		
		System.out.println(list2);
	
	}
}

