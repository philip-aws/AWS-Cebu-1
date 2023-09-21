package mapper;

public class Monkey implements Animal{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Monkey";
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Oh Oh Ah Ah";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Japanese Macaque";
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "The Japanese macaque, also known as "
				+ "the snow monkey, is a terrestrial "
				+ "Old World monkey species that is "
				+ "native to Japan. ";
	}

	@Override
	public int cageNumber() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name() + "\nType: " + type() +"\nDescription: " + description();
	}
	
	

}
