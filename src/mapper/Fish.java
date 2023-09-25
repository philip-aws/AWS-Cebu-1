package mapper;

public class Fish implements Animal{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Fish";
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "~blablablablablabla~";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Aquatic Vertebrate";
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "The term fish includes a very wide range of aquatic animals. In fact, there are about as many species of fishes than there are of all other vertebrates combined."
				+ "Fishes are “poikilothermic, aquatic chordate(s) with appendages (when present) developed as fins, whose chief respiratory organs are gills and whose body is usually covered with scales.";
	}

	@Override
	public int cageNumber() {
		// TODO Auto-generated method stub
		return 202;
	}

	@Override
	public String toString() {
		return "Name: " + name() + "\n" + "Type: " + type() + "\n" + "Description: " + description();
	}
	
	
	
	
	
}
