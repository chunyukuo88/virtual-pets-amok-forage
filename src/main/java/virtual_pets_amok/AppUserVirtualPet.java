package virtual_pets_amok;

import java.util.Scanner;

public class AppUserVirtualPet {
	
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		PetShelter userPetShelter = new PetShelter();
		
		System.out.println("Welcome to the Virtual Pet Shelter!");
		
		System.out.println("Please populate your virtual pet shelter.");
		System.out.println("Add at least one pet to your shelter.");
		
		System.out.println("What is the pet's name that you wish to add?");
		String petName = userInput.nextLine();
		
		VirtualPet userPet = new VirtualPet(petName);
		
		userPetShelter.takeInPet(userPet);		
		
		boolean userIsAddingPetsToShelter = true;
		
		while (userIsAddingPetsToShelter == true) {
			System.out.println("Add another pet? y/n");
			String response = userInput.nextLine();

			if (response.equalsIgnoreCase("n")  ) {
				userIsAddingPetsToShelter = false;
			}
			else { //add a pet to shelter
				System.out.println("What is the pet's name that you wish to add?");
				String additionalPetName = userInput.nextLine();
				
				VirtualPet additionalPet = new VirtualPet(additionalPetName);
				
				userPetShelter.takeInPet(additionalPet);		
				
			}
			
		}
		
		
		System.out.println("What would you like to do today?");

		boolean userAnswer = true;
		
		while (userAnswer) {
			printMenu();
			String response = userInput.nextLine().toUpperCase();
			if (response.isEmpty()) {
				continue;
			}
			switch (response.charAt(0)) {
				case 'S':// shows all pets in shelter
					System.out.println(userPetShelter.printAllPetsAndStatsInTheShelter());;
					break;
				case 'A'://Add pet to shelter. 
					System.out.println("case A");					
					break;
				case 'F': //Feed all pets.
					System.out.print("How much would you like to feed the pets? Type an modest integer:\n>");
					int amountToFeed = userInput.nextInt();
					userPetShelter.feedAllPets(amountToFeed);
					break;
				case 'P': //Play with single pet.
					System.out.println("These are the pets in the shelter.");
					System.out.println(userPetShelter.showAllPetNames());
					System.out.print("Which pet do you want to play with?\n>");
					String selectPetForPlay = userInput.nextLine();
					userPetShelter.playWithOnePet(selectPetForPlay);
					break;
				case 'G'://Give meds to single pet.");
					System.out.println("These are the pets in the shelter.");
					System.out.println(userPetShelter.showAllPetNames());
					System.out.print("Which pet do you want to Give Meds?\n>");
					String selectPetForMeds = userInput.nextLine();
					userPetShelter.medicateOnePet(selectPetForMeds);
					break;
				case 'T': //Take single pet out of shelter.");
					System.out.println("case T");
					break;
				case 'Q': 
					userAnswer = false;
					break;
				default:
					System.out.println("default");
					break;
			}
			
		} //end while
		
		System.out.println("Thank you for using the Virtual Pet Shelter today!");
		
	}	// end main
		
	public static void printMenu() {
		System.out.println("Please enter the letter for the task "
				+ "you would like to perform:");

		System.out.println("[S]how all pets in the shelter."); 
		System.out.println("[A]dd pet to shelter."); 
		System.out.println("[F]eed all pets.");
		System.out.println("[P]lay with single pet.");
		System.out.println("[G]ive meds to single pet.");
		System.out.println("[T]ake single pet out of shelter.");
		System.out.println("[Q]uit");
		System.out.println();
		System.out.print(">  ");
	}
}


			
//			System.out.println("Interact with one pet or multiple pets?");
//			System.out.println("Type 1 for one pet.\n" +
//							   "Type 2 for multiple pets.");
//			String responseToOneOrMultiple = userInput.nextLine();
//			if (responseToOneOrMultiple == "1") {
//				//move on to the single pet interaction menu.
//				validUserInput = false;
//			}
//			else {
//				//move on to the multiple pet interaction menu.
//				validUserInput = false;
//			}
//		
//		
//		boolean useSoloPetMenu = false;
//		
//		while (useSoloPetMenu == true) {
//			//Menu with things you can do with a single pet.
//		}
//		
//		boolean multiSoloPetMenu = false;
//		
//		while (multiSoloPetMenu == true) {
//			//Menu with things you can do with a single pet.
//		}
