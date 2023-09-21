package mapper;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Animal animals[] = {new Dinosaur(), new Monkey(), new Zou(), new Jarl(), new Lion()};
		HashMap<String, Integer> animalLists = new HashMap<>();
		boolean isValid = false;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Safari Spectacle Mapper");
		System.out.println("List of Animals: ");

		for(int i = 0; i < animals.length; i ++) {
			animalLists.put(animals[i].name().toLowerCase(), i);
			System.out.print(animals[i].name() + " - ");
		}

		System.out.print("\nWhat animal would you like to see?: ");
		String animal = scanner.nextLine().toLowerCase();

		if (animalLists.containsKey(animal)) {
			System.out.println(animals[animalLists.get(animal)].toString());
		} else {
			System.out.println(animal + " not found.");
			return;
		}

		while(!isValid) {

			System.out.print("Would you like to hear its sound? (Y/N): ");
			String animalSound = scanner.nextLine();

			switch (animalSound) {
			case "Y":
				System.out.println(animals[animalLists.get(animal)].sound());
				isValid = true;
				break;
			case "N":
				isValid = true;
				break;
			default:
				System.out.println("Please input Y for Yes or N for No");
				break;
			}
		} 

		isValid = false;

		while(!isValid) {

			System.out.print("Would you like to know its location? (Y/N): ");
			char animalCage = scanner.nextLine().charAt(0);

			switch(animalCage) {
			case 'Y':
				System.out.println(animals[animalLists.get(animal)].cageNumber());
				isValid = true;
				break;
			case 'N':
				isValid = true;
				break;
			default:
				System.out.println("Please input Y for Yes or N for No");
				break;
			}
		} 

		scanner.close();
		System.out.println("Thank you for visiting Safari Spectacle");
	}

}
