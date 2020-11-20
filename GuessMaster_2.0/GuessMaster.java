package assignment1;

import java.util.Random;
import java.util.Scanner;

public class GuessMaster {
	private int numOfEntities;
	private Entity[] entities;
	private int sum = 0;
	
	public GuessMaster() {
		numOfEntities = 0;
		entities = new Entity[100]; 
	}

	public void addEntity(Entity entity) {
		Entity clone = entity.clone();
		entities[numOfEntities++] = clone;
	}
	
	public void playGame(int entityId) {
		Entity entity = entities[entityId];
		playGame(entity);
	}
	
	public void playGame(Entity entity) {
		System.out.println(entity.welcomeMessage());
		System.out.printf("\nGuess %s's birthday\n", entity.getName());
		System.out.println("(mm/dd/yyyy)");

		Date guessDate = new Date();//stores date guesses
		Date birthday = entity.getBorn();
		
			while(true) {
				guessDate.readInput();
				if(guessDate.equals(birthday)) {
					sum += entity.getAwardedTicketNumber();
					System.out.println("*************Bingo!***************");
					System.out.print("You won " + entity.getAwardedTicketNumber() + " tickets in this round. The total number of your tickets is " + sum);
					System.out.println(entity.closingMessage());
					break;
				
				}
				else if(guessDate.precedes(birthday)) {
					System.out.println("Try a later date\n");
				}
				else {
					System.out.println("Try an earlier date\n");
				}
			}
			
		}
	
	public void playGame() {
		while (true) {
			int entityId = genRandomEntityId();
			playGame(entityId);
		}
	}

	public int genRandomEntityId() {
		Random randomNumber = new Random();
		return randomNumber.nextInt(numOfEntities);
	}

	public static void main(String[] args) {
		System.out.println("=========================\n");
		System.out.println("     GuessMaster 2.0 \n Thierry Jones - 20108349\n");
		System.out.println("=========================");
		Politician jTrudeau = new Politician("Justin Trudeau", new Date("December", 25, 1971), "Male", "Liberal", 0.25);
		Singer cDion = new Singer("Celine Dion", new Date("March", 30, 1968), "Female","La voix du bon Dieux",new Date("November",6,1981), 0.5);
		Person myCreator = new Person("myCreator", new Date("October", 21, 2000), "Male", 0.85);
		Country usa = new Country("United States", new Date("July", 4, 1776), "Washington D.C.", 0.1);

		GuessMaster gm = new GuessMaster();
		gm.addEntity(jTrudeau);
		gm.addEntity(cDion);
		gm.addEntity(myCreator);
		gm.addEntity(usa);
		
		gm.playGame();
		
	}
}
