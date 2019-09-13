package VirtualPetsAmok;

import java.util.ArrayList;
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

	public void takeInPet(VirtualPet pet) {
		petsInTheShelter.put(pet.getPetName(), pet); 
	}

	public void removePet(VirtualPet pet) {
		petsInTheShelter.remove (pet);
		
	}


	public String retrievePetAndStatus(VirtualPet pet) {
		
		String petAndStatus = "| " + pet.getPetName() +
							 " | " + pet.getBoredom() +
							 " | " + pet.getHunger() +
							 " | " + pet.getSickness() +
							 " |";
		return petAndStatus;
	}
	
//			An idea:
//	public String produceListOfPetsInShelter() {
//		
//		for (VirtualPet pet : petsInTheShelter) {
//			System.out.println("Pet name is %s.", getpetname);
//			System.out.println("Pet species is %s.", getpetname);
//			System.out.println("Pet age is %d.", getpetage);
//		}
//	}
	
	
}