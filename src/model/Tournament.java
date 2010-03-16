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

	public Round start() {
		started = true;
		Round firstRound = new Round(participants);
		return firstRound;	
	}
	
	public Round startRound() {
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
