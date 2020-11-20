package assignment1;

public class Politician extends Person{

	private String party;
	

	public Politician(String name, Date birthDate, String gender, String party, double difficulty) {
		super(name, birthDate, gender, difficulty);
		this.party = party;
	}
	//copy constructor
	public Politician(Politician politician) {
		super(politician.getName(), politician.getBorn(), politician.getPerson(),politician.getDifficulty());
		this.party = politician.getParty();
	}
	//Setters and Getters
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	
	public String closingMessage() {
		String close = super.closingMessage() + "Party: "+ party + "\n";
		return close;
	}
	 
	public String entityType() {
		return ("politician!");
	}

	public Person clone() {
		return new Politician(this);
	}
	
}
