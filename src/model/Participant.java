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

	public int point(int n){
		return (point + n);
	} 	
}
