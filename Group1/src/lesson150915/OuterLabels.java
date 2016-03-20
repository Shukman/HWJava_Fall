package lesson150915;

public class OuterLabels { //внешние метки
	
	public static void main(String[] args) {
		
		int[][] matrix = {  // запись матрицы(в каждой из 4 строк, по 3 числа)
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12},
				}; 
		OUTER:
		for (int i = 0; i < matrix.length; i++) { //шаблоны цыклов по перебору строк матрицы
		for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+ " "); //добавляем пробел между цыфрами
				if (matrix[i][j] == 5) { //прерываем матрицу,числа больше либо равно 5, после чего обраывается.
					break OUTER;
				}
			}
			System.out.println(); //чтобы печаталось в столбик
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
				if (matrix1[i][j] == 2 || matrix1[i][j] == 5 || matrix1[i][j] == 8) { // вместо одного, выбрали несколько цифр, при помощи OR(|)
					continue OUTER;   
				}
			}
			System.out.println();
		}
	}
}
