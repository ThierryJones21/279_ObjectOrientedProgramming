//Thierry Jones 20108349

public class GuessMaster {
	private int numberOfCandidateEntities = 3;
	private Entity[] entities =  new Entity[numberOfCandidateEntities];
	private int cnt = 0;
	
	public void addEntity(Entity entity) {
			//adds new entities into Entity
		entities[cnt] = entity;
		cnt++;
	}
	public void playGame(Entity entity) {
		//given an entity play guessing game with reguard to that entity
		//precedes(Date otherDate) use this method
		Date guessDate = new Date();//stores date guesses
		Date birthday = entity.getDate();
		System.out.println("Guess the birthday of: " + entity.getName());
		while(true) {
			guessDate.readInput();
			if(guessDate.equals(birthday)) {
				System.out.println("You Got It!");
				playGame();
			}
			else if(guessDate.precedes(birthday)) {
				System.out.println("Try a later date\n");
			}
			else {
				System.out.println("Try an earlier date\n");
			}
		}
		
	}
	public void playGame(int entityInd) {
		//entity index, use index to fetch 
		//the entity from entites and play guessing game 
		// according to that entity
		playGame(entities[entityInd]);
	}
	public void playGame() {
		int index = genRandomEntityIndex();
		playGame(index);
	}

	public int genRandomEntityIndex() {
		int index = (int)(Math.random() * numberOfCandidateEntities);
		return index;
	}
	
	public static void main(String args[]) {
		Entity trudeau = new Entity("Justin Trudeau", new Date("12-25-1971"));//Initialize entities 
		Entity dion = new Entity("Celine Dion",new Date("3-30-1968"));
		Entity usa = new Entity("United States", new Date("7-4-1776"));
	
		GuessMaster gm = new GuessMaster();
		gm.addEntity(trudeau);
		gm.addEntity(dion);
		gm.addEntity(usa);
		
		gm.playGame();//start game
		
	}
	
	
}
