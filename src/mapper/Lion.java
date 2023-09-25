package mapper;

public class Lion implements Animal{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Lion";
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Hakuna Matata";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Panthera leo melanochaita";
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Panthera leo melanochaita, commonly known as the Southwest African lion or the Kalahari lion, is a distinctive subspecies of the African lion (Panthera leo)." 
				+" Known for its striking appearance, it features a light-colored mane that ranges from pale blond to black." 
				+"These majestic big cats are primarily found in southwestern Africa, including regions such as the Kalahari Desert."
				+"As apex predators, they play a crucial role in maintaining the ecological balance of their habitats and are revered for their strength and presence in African wildlife.";
	}

	@Override
	public int cageNumber() {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public String toString() {
		return "Name: " + name() + "\n" + "Type: " + type() + "\n" + "Description: " + description();
	}
	
	
}


