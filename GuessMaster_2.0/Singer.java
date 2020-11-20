package assignment1;

public class Singer extends Person{

	private String debutAlbulm;
	private Date debutAlbulmReleaseDate;
	

	public Singer(String name, Date birthDate, String gender, String debutAlbulm, Date debutAlbulmReleaseDate, double difficulty) {
		super(name, birthDate, gender, difficulty);
		this.debutAlbulm = debutAlbulm;
		this.debutAlbulmReleaseDate = debutAlbulmReleaseDate;
	}
	//copy constructor
	public Singer(Singer singer) {
		super(singer.getName(), singer.getBorn(), singer.getPerson(), singer.getDifficulty());
		this.debutAlbulm = singer.getDebutAlbulm();
		this.debutAlbulmReleaseDate = singer.getDebutAlbulmReleaseDate();	
	}
	//Setters and Getters
	public String getDebutAlbulm() {
		return debutAlbulm;
	}
	public void setDebutAlbulm(String debutAlbulm) {
		this.debutAlbulm = debutAlbulm;
	}
	public Date getDebutAlbulmReleaseDate() {
		return debutAlbulmReleaseDate;
	}
	public void setDebutAlbulmReleaseDate(Date debutAlbulmReleaseDate) {
		this.debutAlbulmReleaseDate = debutAlbulmReleaseDate;
	}
	
	public String closingMessage() {
		String close = super.closingMessage() + "Debut album: "+ debutAlbulm +"\n"
				+ "Release Date: " + debutAlbulmReleaseDate;
		return close;
	}
	 
	public String entityType() {
		return ("singer!");
	}

	public Person clone() {
		return new Singer(this);
	}
	
	
}
