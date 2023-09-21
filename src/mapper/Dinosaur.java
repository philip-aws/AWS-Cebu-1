package mapper;

public class Dinosaur implements Animal{

	

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Dinosaur";
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "~Jurassic Park Theme Song~";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Reptile";
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Dinosaurs are a diverse group of reptiles[note 1] of the clade Dinosauria. They first appeared during the Triassic period, between 243 and 233.23 million years ago (mya), although the exact origin and timing of the evolution of dinosaurs is a subject of active research. "
				+ "They became the dominant terrestrial vertebrates after the Triassic–Jurassic extinction event 201.3 mya and their dominance continued throughout the Jurassic and Cretaceous periods.";
	}

	@Override
	public int cageNumber() {
		// TODO Auto-generated method stub
		return 119;
	}
	
}
