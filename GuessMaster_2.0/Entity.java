package assignment1;

public abstract class Entity {
	private String name;
	private Date born;
	private double difficulty;
	
	public Entity(String name, Date birthDate, double difficulty) {
		this.name = name;
		this.born = new Date(birthDate);
		this.difficulty = difficulty;//no privacy leak
	}
	
	public Entity(Entity entity) {
		this.name = entity.name;
		this.born = new Date(entity.born); //no privacy leak
	}
	// setters and getters
	public void setDifficulty(double difficulty) {
		this.difficulty = difficulty;
	}
	
	public double getDifficulty() {
		return difficulty;
	}

	public String getName() {
		return name;
	}

	public Date getBorn() {
		return new Date(born);
	}
	
	public int getAwardedTicketNumber() {
		return (int)(difficulty*100);
	}
	
	public abstract String entityType();
	
	public abstract Entity clone();
	
	public String welcomeMessage() {
		String welcome = "Welcome! Let's start the game! this entity is a "
				+ entityType() + "\n";
		return welcome;
	}
	
	public String closingMessage() {
		String close = "\nCongragulations! The detailed information of the entity you guessed is:\n"
				+ "Name: " + name +"\n"
				+ "Born: " + born +"\n";
		return close;
	}
	
		
}

	

