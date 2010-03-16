package model;
import java.util.Collections;
import java.util.*;

public class Round {
	private List<Pair> pairs;
	private List<Participant> participants;         

	public Round(List<Participant> participants) {
		this.participants = participants;
		pairParticipants();
	}       

	private void pairParticipants() {
		Collections.shuffle(participants);
		for (int i = 0; i < participants.size(); i=i+2) {
			Pair pair = new Pair(participants.get(i), participants.get(i+1));       
			this.pairs.add(pair);
		}
	}       
}

