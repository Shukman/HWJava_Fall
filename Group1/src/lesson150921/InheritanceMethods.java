package lesson150921;

public class InheritanceMethods {
	
	static class A { //������� ����� �
		
		int calc() { 
			return 2 * 2; //������� �����
		}
		
	}
	static class B extends A { //���������� � ������ � �� ��� �������
		
		@Override //�������������� ����� ������ � �� ���� ����� ������ �
		int calc() {
			return 10 + super.calc(); //�������������� ����� � ��������� � 10 � ��������� ����� ������ � ����� ����� 
		}
		int calcSuper() { //������� ����� �����
			return super.calc();//������� �������  � ������
		}
	}
	
	static class C extends B {//���������� � ������ � ����� �
		@Override //�������������� �����
		int calc() {
			return calcSuper(); //������������ ��� � ���������, ������� � ��� ����� 4 �� � � ������ �������������� �� ���� ������� ������������ �� ������ �
		}
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.calc());
		
		B b = new B();
		System.out.println(b.calc());
		
		C c = new C();
		System.out.println(c.calc());
	}

}
