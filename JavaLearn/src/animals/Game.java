package animals;

public class Game {
	
	public static void main(String[] args) {
		IAnimals a =new Dog();
		
		a.drinking();
		a.running();
		a.sleeping();
		a.getAnimalName();
		
		
		Dog b =new Dog();
		b.bark();
		b.drinking();
		b.getAnimalName();
		b.running();
		b.sleeping();
	}
}
