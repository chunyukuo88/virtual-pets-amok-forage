package VirtualPetsAmok;

import java.util.Collection;
import java.util.HashMap;

public class PetShelter {

	HashMap<String, VirtualPet> petsInTheShelter;
	
	public PetShelter() {
		petsInTheShelter = new HashMap<>();
	}
	
//	public HashMap<String, VirtualPet> getPetsInTheShelter() {
//		return petsInTheShelter;
//	}
	public Collection<VirtualPet> getPetsInTheShelter() {
		return petsInTheShelter.values();
	}

	public void petAdder(VirtualPet pet) {
		petsInTheShelter.put(pet.getPetName(), pet); 
	}

}