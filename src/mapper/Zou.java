package mapper;

public class Zou implements Animal {
	public String name() {
		return "Elephant";
	}
	
	public String sound() {
		return "Pawoo!";
	}
	
	public String type() {
		return "Mammal";
	}

	public String description() {
		return "An elephant is the largest living land animal, characterized by its long trunk, columnar legs, and " +
			   "huge head with temporal glands and wide, flat ears.";
	}
	
	public int cageNumber() {
		return 86;
	}
	
	public String toString() {
		return "Name: " + name() + "\n" + "Type: " + type() + "\n" + "Description: " + description() + " ";
	}
}
