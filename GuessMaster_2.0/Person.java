package assignment1;

public class Person extends Entity{

	private String gender;

	public Person(String name, Date birthDate, String gender, double difficulty) {
		super(name, birthDate, difficulty);
		this.gender = gender;
	}
	
	public Person(Person person) {
		super(person.getName(), person.getBorn(), person.getDifficulty());
		this.gender = person.getPerson();
	}

	public String getPerson() {
		return gender;
	}

	public void setPerson(String gender) {
		this.gender = gender;
	}
	
	public String closingMessage() {
		String close = super.closingMessage() + "Gender: "+ gender +"\n";
		return close;
	}

	public String entityType() {
		return ("person!");
	}

	public Entity clone() {
		return new Person(this);
	}
	


}
