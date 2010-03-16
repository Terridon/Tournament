package model;
import java.util.*;

public class Tournament{
	private List<Participant> participants;
	private boolean started = false;
	private int winningNumber = 0;

	public Tournament() {

	}

	public void addParticipant(Participant p) {
		if (started == false){
			participants.add(p);		
		} else {
			System.out.println("you can't add more after start");
		}			
	}


	public Round startRound() {
		if (participants.size() > 0 && participants.size() % 2 == 0) {
			if (started == false) {
				Round firstRound = new Round(participants);
				started = true;
				return firstRound;
			} else {	
				winningNumber++;
				List<Participant> p = new ArrayList<Participant>();
				for(Participant participant : participants) {
					if (participant.score() == winningNumber) {
						p.add(participant);
					}
				}	

				Round nextRound = new Round(p);
				return nextRound;
			}
		}
		throw exception "omg i needz equal numberz";
	}

}	
