package lesson150915;

public class OuterLabels { //������� �����
	
	public static void main(String[] args) {
		
		int[][] matrix = {  // ������ �������(� ������ �� 4 �����, �� 3 �����)
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12},
				}; 
		OUTER:
		for (int i = 0; i < matrix.length; i++) { //������� ������ �� �������� ����� �������
		for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+ " "); //��������� ������ ����� �������
				if (matrix[i][j] == 5) { //��������� �������,����� ������ ���� ����� 5, ����� ���� �����������.
					break OUTER;
				}
			}
			System.out.println(); //����� ���������� � �������
		}
		// OUTER exit point
		{
		System.out.println("\nhw");
		}
		int[][] matrix1 = {  
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12},
				}; 
		OUTER:
		for (int i = 0; i < matrix1.length; i++) { 
		for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j]+ " "); 
				if (matrix1[i][j] == 2 || matrix1[i][j] == 5 || matrix1[i][j] == 8) { // ������ ������, ������� ��������� ����, ��� ������ OR(|)
					continue OUTER;   
				}
			}
			System.out.println();
		}
	}
}
