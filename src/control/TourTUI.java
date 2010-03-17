package control;
import java.util.*;
import model.Tournament;
import model.Participant;

public class TourTUI {
	private Scanner in;

	public TourTUI(){

	}

	public void start() {
		Tournament tour = new Tournament();
		//userprompt somehow;
		Participant player = new Participant("Dan");
		tour.addParticipant(player);	
	}

}
