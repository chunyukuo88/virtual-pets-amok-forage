package VirtualPetsAmok;

import java.util.ArrayList;

public class PetShelter {
	
	private ArrayList<VirtualPet> petsInTheShelter = new ArrayList<>();
	
	public ArrayList<VirtualPet> getPetsInTheShelter() {
		return petsInTheShelter;
	}

	public void petAdder(VirtualPet pet) {
		petsInTheShelter.add(pet);
	


	}
}
