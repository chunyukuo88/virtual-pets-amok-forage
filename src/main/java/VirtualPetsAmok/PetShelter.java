package VirtualPetsAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

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

	public void takeInPet(VirtualPet pet) {
		petsInTheShelter.put(pet.getPetName(), pet); 
	}

	public void removePet(VirtualPet pet) {
		petsInTheShelter.remove (pet);
		
	}

	public Set displayPetsAndStatus(HashMap petsInTheShelter) {
		return petsInTheShelter.keySet();
		
	}

}