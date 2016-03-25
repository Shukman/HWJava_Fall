package lesson150921;

public class PetCare {
	
	public static void main(String[] args) {
			
		Cat cat = new Cat();
		Dog dog = new Dog();
		Turtle turtle = new Turtle();
		Parrot parrot = new Parrot();
		Raven raven = new Raven();
	
		Pet pettucchi = parrot; // implicit type cast
//	Pet pettucchi = (Pet)parrot;
 	
//	cat.Care();
	
//	((MammalPetWithFur)pettucchi).comb();
	
//	parrot.Care();
//	raven.Care();
	
		care(cat, dog, turtle, pettucchi, raven);
		
	}
	public static void care(Pet...pets) {
		for(Pet pet : pets) {
			pet.care();
			
		}	
	}

}
