package control;
import java.util.*;
import model.Tournament;
import model.Participant;

public class TourTUI {

	public TourTUI(){

	}

	public void start() {
		Tournament tour = new Tournament();
		Scanner input = new Scanner(System.in);
		System.out.println("write player-name:");
		String name = input.nextLine();
		Participant player = new Participant(name);
		tour.addParticipant(player);
		//TODO 
		//delete-option ved forkert navn
	}



}
