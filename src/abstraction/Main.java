package abstraction;

public class Main {

	public static void main(String[] args) {
		Animal dinosaur = new Dinosaur();
		Animal dog = new Dog();
		Animal doubutsu = new Doubutsu();
		Animal fish = new Fish();
		Animal jarl = new Jarl();
		Animal lion = new Lion();
		
		dinosaur.talk();
		dog.talk();
		doubutsu.talk();
		fish.talk();
		jarl.talk();
		lion.talk();
	}

}
