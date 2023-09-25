package mapper;

public class Dog implements Animal{
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Dog";
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "~Arff~Arff~Arff~";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Mammal";
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Dogs are domesticated mammals known for their wide range of breeds, sizes, and personalities. "
				+ "They are loyal, social animals that have been human companions for thousands of years, serving as pets, working animals, and sources of comfort and joy in homes around the world.";
	}

	@Override
	public int cageNumber() {
		// TODO Auto-generated method stub
		return 120;
	}

	@Override
	public String toString() {
		return "Name: " + name() + "\n" + "Type: " + type() + "\n" + "Description: " + description();
	}
}
