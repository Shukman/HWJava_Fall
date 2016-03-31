package lesson150922.inheritance.vs.composition;

public class C implements Changeable{//не будет наследовать от класса

	//опишем поле кот будет хранить ссылку на нечто, что является ченьджабл
	Changeable changer;

	@Override
	public void change() {
		System.out.println("C");
		changer.change(); //тут мы просим сделать наш ченьдер	
		
	}
	
	public void setChanger(Changeable changer){
		this.changer = changer;
	}
	

}
