package lesson150921;

public class Parrot extends Pet implements Chirikable {
	
	@Override
	public void chirik() {
		System.out.println("��� �����!");
	}
	
	@Override
	public void special() {
		chirik();
	};
	
}
