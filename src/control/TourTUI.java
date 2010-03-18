package control;
import java.util.*;
import model.Tournament;
import model.Participant;

public class TourTUI {
		private static final int ADDPLAYER = 1;
		private static final int EXIT = 0;
		private static final int STARTTOUR = 2;
		private static final int NO_CHOISE = -1;

	public TourTUI(){
	}
	
	public void start() {
		Tournament tour = new Tournament();
		int choise = NO_CHOISE;
		displayMenu();
		//TODO skal rykkes ned i newplayer
		Scanner input = new Scanner(System.in);
		System.out.println("write player-name:");
		String name = input.nextLine();
		Participant player = new Participant(name);
		tour.addParticipant(player);
		//TODO 
		//delete-option ved forkert navn eller change-name-funktion
	}
	
	private void displayMenu() {
		System.out.println();
		System.out.println("Enter the number for the action you wish to perform");
		System.out.println("Add player............." + ADDPLAYER);
		System.out.println("Start tournament......." + STARTTOUR);		
		System.out.println("Exit..................." + EXIT);		
	
	}

	private void executeChoise(int choise) {
		System.out.println();
		if (choise == ADDPLAYER)
			newPlayer();
		else if (choise == STARTTOUR)
			tour.startRound();
		else if (choise == EXIT)
			System.out.println("Program has been closed");
	}

	public void newPlayer() {
		
	}


}
