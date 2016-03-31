package lesson150922.HW.OOM;

public class ExtensionHW {
	
	static class Table {
		
		public void table(){
			System.out.println("only table");	
			
		}
		
	}
	
	static class ComputerTable extends Table {
		
		public void staycomp() {
			System.out.println("stay the computer system on table");
		}
	}
	
	public static void main(String[] args) {
		Table b = new Table();
		b.table();
		ComputerTable a = new ComputerTable();
		a.staycomp();
		
	}

}
