package view;
import java.util.List;

public class Menu {
	private static final int ADDPLAYER = 1;
	private static final int EXIT = 0;
	private static final int STARTTOUR = 2;
	private static final int NO_CHOICE = -1;
	private List<String> options;
	private int number = 0;

	public Menu(List<String> options) {
		this.options = options;
	}	
	public void displayMenu() {
		//Liste af deltagere
		for (String option : options) {
			number++;
			System.out.println(option + number);

		}
			
		System.out.println();
		System.out.println("Enter the number for the action you wish to perform");
		System.out.println("Add player............." + ADDPLAYER);
		System.out.println("Start tournament......." + STARTTOUR);		
		System.out.println("Exit..................." + EXIT);		
	
	}

}
