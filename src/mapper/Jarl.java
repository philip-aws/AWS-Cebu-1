package mapper;

public class Jarl implements Animal {
	public String name() {
		return "Jarl";
	}
	
	public String sound() {
		return "Uun";
	}
	
	public String type() {
		return "Human";
	}

	public String description() {
		return "A Jarl is an introverted human who would rather stay at home by himself and play video games than go out.";
	}
	
	public int cageNumber() {
		return 29;
	}
	
	public String toString() {
		return "Name: " + name() + "\n" + "Type: " + type() + "\n" + "Description: " + description() + " ";
	}
}
