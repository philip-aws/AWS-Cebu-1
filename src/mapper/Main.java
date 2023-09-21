package mapper;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Animal animals[] = {new Lion(), new Dinosaur(), new Dog(), new Moneky(), new Fish(), new Jarl(), new Zou()};
		HashMap<String, Integer> animalLists = new HashMap<>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Miss Julia's Zoo Mapper");
		System.out.println("List of Animals: ");
		
		for(int i = 0; i < animals.length; i ++) {
			animalLists.put(animals[i].name(), i);
			System.out.print(animals[i].name() + " ");
		}
		
		System.out.println("What animal would you like to see?: ");
		String animal = scanner.nextLine().toLowerCase();

		// Sneak Peak of animal
		if (animalLists.containsKey(animal)) {
			System.out.println(animals[animalLists.get(animal)].toString());
		}
		
		System.out.println("Would you like to hear its sound? (Y/N): ");
		
		try {
			char animalSound = scanner.nextLine().charAt(0);
			switch(animalSound) {
				case 'Y':
					System.out.println(animals[animalLists.get(animal)].sound());
					break;
				case 'N':
					break;
			}
		} catch(InputMismatchException err) {
			System.out.println("Please input Y if Yes or N if No");
		}
		
		System.out.println("Would you like to know where " + animals[animalLists.get(animal)] + " is located? (Y/N): ");
		
		try {
			char animalSound = scanner.nextLine().charAt(0);
			switch(animalSound) {
				case 'Y':
					System.out.println(animals[animalLists.get(animal)].cageNumber());
					break;
				case 'N':
					break;
			}
		} catch(InputMismatchException err) {
			System.out.println("Please input Y if Yes or N if No");
		}
		
		System.out.println("Thank you for visiting Miss Julia's Zoo");
	}

}
