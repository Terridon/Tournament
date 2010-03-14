package model;

import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Round {
	private List<Pair> pairs;
	private Participant[] participants;		

	public Round(Participant[] participants) {
		this.participants = participants;
		pairParticipants();
	}	

	private void pairParticipants() {
		Collections.shuffle(Arrays.asList(participants));
		for (int i = 0; i < participants.length; i++) {
			//	(i + 1) % 2;
			//i++ skal formodentligt sættes til i+2 for at tage par
			Pair pair = new Pair(participants[i], participants[i+1]);	
			this.pairs.add(pair);
		}
	}	
}


