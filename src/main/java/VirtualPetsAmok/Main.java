package VirtualPetsAmok;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to the Pet Shelter");

		boolean validUserInput = true;
		
		while (validUserInput) {
			System.out.println("Interact with one pet or multiple pets?");
			System.out.println("Type 1 for one pet.\n" +
							   "Type 2 for multiple pets.");
			String responseToOneOrMultiple = userInput.nextLine();
			if (responseToOneOrMultiple == "1") {
				//move on to the single pet interaction menu.
				validUserInput = false;
			}
			else {
				//move on to the multiple pet interaction menu.
				validUserInput = false;
			}
		}
		
		boolean useSoloPetMenu = false;
		
		while (useSoloPetMenu == true) {
			//Menu with things you can do with a single pet.
		}
		
		boolean multiSoloPetMenu = false;
		
		while (multiSoloPetMenu == true) {
			//Menu with things you can do with a single pet.
		}
		
	}
}
