package co.grandcircus;

public class Country {

	private String name;
	private int population;
	
	//Constructors
	public Country() {
		super();
	}

	public Country(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}

	
	//Getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	//toString      India (pop 1,339,000,000)
	@Override
	public String toString() {
		return name + "," + population;
	}
	
	
}
