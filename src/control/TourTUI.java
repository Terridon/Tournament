package control;
import java.util.*;
import model.Tournament;
import model.Participant;

public class TourTUI {

	public TourTUI(){

	}

	public void start() {
		Tournament tour = new Tournament();
<<<<<<< HEAD:src/control/TourTUI.java
		Scanner input = new Scanner(System.in);
		System.out.println("write player-name:");
		String name = input.nextLine();
		Participant player = new Participant(name);
		tour.addParticipant(player);
		//TODO 
		//delete-option ved forkert navn
=======
		//TODO: userprompt somehow;
		Participant player = new Participant("Dan");
		tour.addParticipant(player);	
>>>>>>> 62292a8f7f135eeb0d73679a4121538081c829f3:src/control/TourTUI.java
	}



}
