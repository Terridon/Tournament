package control;
import java.util.*;
import view.Menu;
import model.Tournament;
import model.Participant;

public class TourTUI {
		private static final int ADDPLAYER = 1;
		private static final int EXIT = 0;
		private static final int STARTTOUR = 2;
		private static final int NO_CHOICE = -1;
		private Tournament tour;
		private Scanner in;
		private Menu menu;

	public TourTUI(){
	}
	
	public void start() {
		tour = new Tournament();
		int choice = NO_CHOICE;
		menu = new Menu();
		menu.displayMenu();
		//TODO skal rykkes ned i newplayer
		Scanner input = new Scanner(System.in);
		System.out.println("write player-name:");
		String name = input.nextLine();
		Participant player = new Participant(name);
		tour.addParticipant(player);
		//TODO 
		//delete-option ved forkert navn eller change-name-funktion
	}
	
	private int readIntWithPrompt(String prompt) {
		System.out.print(prompt); System.out.flush();
		while (!in.hasNextInt()) {
			in.nextLine();
			System.out.print(prompt); System.out.flush();
		}
		int input = in.nextInt();
		in.nextLine();
		return input;
	}
	
	/**private void displayMenu() {
		System.out.println();
		System.out.println("Enter the number for the action you wish to perform");
		System.out.println("Add player............." + ADDPLAYER);
		System.out.println("Start tournament......." + STARTTOUR);		
		System.out.println("Exit..................." + EXIT);		
	
	}
*/
	private void executeChoice(int choice) {
		System.out.println();
		if (choice == ADDPLAYER)
			newPlayer();
		else if (choice == STARTTOUR)
			try {
				tour.startRound();
			} catch (Exception e) { 
				System.out.println(e);
			}
		else if (choice == EXIT)
			System.out.println("Program has been closed");
	}

	public void newPlayer() {
		
	}


}
