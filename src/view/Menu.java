package view;


public class Menu {
	private static final int ADDPLAYER = 1;
	private static final int EXIT = 0;
	private static final int STARTTOUR = 2;
	private static final int NO_CHOICE = -1;
	
	public void displayMenu() {
		System.out.println();
		System.out.println("Enter the number for the action you wish to perform");
		System.out.println("Add player............." + ADDPLAYER);
		System.out.println("Start tournament......." + STARTTOUR);		
		System.out.println("Exit..................." + EXIT);		
	
	}

}
