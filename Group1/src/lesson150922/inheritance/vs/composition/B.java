package lesson150922.inheritance.vs.composition;

public class B extends A {// когда унаследовали, получили поле состояния и метод ченьдж для изменения поведения
	
	@Override
	public void change() {
		super.change(); //жестко связан и не изменить
		state *= 2; //добавляем свое действие, умножаем его на два
		
	}
	

}
