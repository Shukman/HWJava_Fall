package lesson150917;

public class B {//��������� ���� �������� �������� (������)
	
	//1  - only once! ����������� ������ (� ������ ���)
	
	static {
		System.out.println("static");
	}
	// 5 ����������� ����� � �� ����������
	public B() {
		System.out.println("constructor");
	}
	//3 ����������� ������, �� ������ �� �� ��� ��������� ������ �� �����
	{
		System.out.println("instance");
	}
	// 2 - only once ����������� ������ � ������ ���
	static {
		System.out.println("static2");
	}
	// 4 ����������� ���������, �� ������ �� �� ��� ��������� ���������
	{
		System.out.println("instance2");
	}
}
