package assignment1;

public class Country extends Entity {
	
	private String capital;
	
	public Country(String name, Date birthDate, String capital, double difficulty) {
		super(name, birthDate, difficulty);
		this.capital = capital;
	}
	
	public Country(Country country) {
		super(country.getName(), country.getBorn(), country.getDifficulty());
		this.capital = country.getCapital();
	}
	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	//Clone method, Methods that go up
	public Entity clone() {
		return new Country(this);
	}
	
	public String closingMessage() {
		String close = super.closingMessage() + "Capital: "+ capital +"\n";
		return close;
	}

	public String entityType() {
		return ("country!");
	}
	

}
