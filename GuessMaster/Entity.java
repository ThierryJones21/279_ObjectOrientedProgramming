//Thierry Jones 20108349

public class Entity {

	private String name;
	private Date born;
	

	public Entity(String name, String stringDate) {
		this.name = name;
		this.born = new Date(stringDate);
	}
	
	public Entity(String name, Date date) {
		this.name = name;
		this.born = date;
	}
	public Entity(Entity entity) {
		this.name = entity.name;
		this.born = entity.born;
	}
	public Date getDate() {
		return new Date(born);
	}
	public String getName() {
		return name;
	}
	
	
}
