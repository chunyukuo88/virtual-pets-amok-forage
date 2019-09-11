package VirtualPetsAmok;

import java.util.ArrayList;

public class PetShelter {
	
	private ArrayList<VirtualPet> petsInTheShelter = new ArrayList<>();
	
	public ArrayList<VirtualPet> getPetsInTheShelter() {
		return petsInTheShelter;
	}

<<<<<<< HEAD
	ArrayList<VirtualPet> petsInTheShelter = new ArrayList<>();

		public void petAdder(VirtualPet) {
			
		}

		
		VirtualPet tortoise = new VirtualPet("Chuck Tortoise", 5, 5, 5);
		petsInTheShelter.add(tortoise);
		
		VirtualPet lorax = new VirtualPet("Chuck Lorax", 4, 4, 4);
		petsInTheShelter.add(lorax);
		
		for (VirtualPet pet : petsInTheShelter)
			System.out.println(pet.petName);
=======
	public void petAdder(VirtualPet pet) {
		petsInTheShelter.add(pet);
	


	}
>>>>>>> 368dc01de56dd9b2d7641d589378d0cbb6879c93
}
