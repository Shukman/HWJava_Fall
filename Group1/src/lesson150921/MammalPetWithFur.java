package lesson150921;

public abstract class MammalPetWithFur extends Pet {//млекопитающие с шерстью(кошка и собака)
	
	abstract public void comb(); //абстрактный, так как расчесывать кошек и собак надо по разному 
	
	
//	@Override
//	public void care() {
//		super.Care();
//		comb;
//	}
	
	@Override
	public void special() {
		comb();
	}

}
