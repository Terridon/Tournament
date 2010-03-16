package model;

public class Participant {
 	private String name;
	private int point = 0;
	
	public Participant(String name) {
		this.name = name;
	}

	public String name() {
		return name;	
	}

	public void point(int n){
		point= point + n;
	} 

	public int score() {
		return point;
	}
}
