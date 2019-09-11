package VirtualPetsAmok;

import java.util.ArrayList;

public class PetShelter {

	ArrayList<VirtualPet> petsInTheShelter = new ArrayList<>();

		public void petAdder(VirtualPet) {
			
		}

		
		VirtualPet tortoise = new VirtualPet("Chuck Tortoise", 5, 5, 5);
		petsInTheShelter.add(tortoise);
		
		VirtualPet lorax = new VirtualPet("Chuck Lorax", 4, 4, 4);
		petsInTheShelter.add(lorax);
		
		for (VirtualPet pet : petsInTheShelter)
			System.out.println(pet.petName);
}
