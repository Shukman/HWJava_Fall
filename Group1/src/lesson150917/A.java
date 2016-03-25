package lesson150917;

public class A { //������ �� ���������
	
	private static final int NONE = -1;

	private static int globalCount; //���������� �������
	
	private int x; //���� ���������� (���� �� �������� ��������� ������ �, �� � ��� ����� ���������� �, �������������)
	
	public A(int x) {
		this.x = x; //��������� �����, � ��� �� ��������
		globalCount++; //����������� ��� �� 1
	}
	
	
	public A() {
		this(NONE); //�������� �� ��������� -1
	}


	public static void staticMethod() {
		System.out.println("static");
//		this.x = 10; ERROR!
	}
	
	public static void staticMethod(A a) { //���� ������ �� ��������� �
		a.x = 10;
	}


	public static void printCount() {
		System.out.println("Count = " + globalCount);
		
	}

	
}
