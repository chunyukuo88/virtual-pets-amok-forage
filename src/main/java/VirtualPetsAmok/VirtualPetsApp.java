package VirtualPetsAmok;

import java.util.Scanner;

public class VirtualPetsApp {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Name your pet!\n>");
		String petOneName = userInput.nextLine();
		VirtualPet petOne = new VirtualPet(petOneName, 5,5,5);
		System.out.println("Pet name: " + petOneName);
	}
}