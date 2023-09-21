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
		return "An elephant is the largest living land animal, characterized by its long trunk (elongated upper lip and nose), columnar legs, and"
				+ " huge head with temporal glands and wide, flat ears. Elephants are grayish to brown in colour, and their body hair is sparse"
				+ " and coarse. They are found most often in savannas, grasslands, and forests but occupy a wide range of habitats,"
				+ " including deserts, swamps, and highlands in tropical and subtropical regions of Africa and Asia.";
	}
	
	public int cageNumber() {
		return 86;
	}
	
	public String toString() {
		return "Elephant Sneak Peek";
	}
}
