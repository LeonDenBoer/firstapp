package nl.hu.v1.wac.firstapp.persistence;

public class Country {
	
	private String code, name, continent, region, governmentForm;
	private int population;
	private double surface;
	
	public Country(String code, String name, String continent, String region, double surface, int population, String governmentForm) {
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.region = region;
		this.governmentForm = governmentForm;
		this.surface = surface;
		this.population = population;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getContinent() {
		return continent;
	}

	public String getRegion() {
		return region;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public int getPopulation() {
		return population;
	}

	public double getSurface() {
		return surface;
	}
}
