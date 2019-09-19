package virtual_pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class PetShelter {

	HashMap<String, VirtualPet> petsInTheShelter;

	public PetShelter() {
		petsInTheShelter = new HashMap<>();
	}

	public Collection<VirtualPet> getPetsInTheShelter() {
		return petsInTheShelter.values();
	}

	public void takeInPet(VirtualPet pet) {
		petsInTheShelter.put(pet.getPetName(), pet);
	}

	public void removePet(VirtualPet pet) {
		petsInTheShelter.remove(pet.getPetName());
	}

	public String retrievePetAndStatus(VirtualPet pet) {
		String petAndStatus = "| " + pet.getPetName() + " | " + pet.getBoredom() + " | " + pet.getHunger() + " | "
				+ pet.getSickness() + " |\n";
		return petAndStatus;
	}

	public static String petsAndStatusHeader() {
		String header = "|Name    |Boredom |Hunger  |Sickness|\n";
		return header;
	}

	public Collection<VirtualPet> retrieveAllPets() {
		return petsInTheShelter.values();
	}

	public String printAllPetsAndStatsInTheShelter() {
		String allPetNamesAndStats = "";
		for (VirtualPet pet : petsInTheShelter.values()) {
			allPetNamesAndStats += retrievePetAndStatus(pet);
		}

		return allPetNamesAndStats;
	}

	public void feedAllPets(int amountToFeed) {
		for (VirtualPet pet : petsInTheShelter.values()) {
			pet.feedFood(amountToFeed);
		}
	}

	public Set<String> showAllPetNames() {
		Set<String> namesOfAllPets = petsInTheShelter.keySet();
		return namesOfAllPets;
	}

	public void playWithOnePet(String petName) {
		petsInTheShelter.get(petName).givePlay();

	}

	public void medicateOnePet(String petName) {
		petsInTheShelter.get(petName).giveMeMyMeds();
	}

	public void removeOnePet(String petName) {
		petsInTheShelter.remove(petName);
	}

	public void tickAllPets() {
		for (VirtualPet pet : petsInTheShelter.values()) {
			pet.tick();
		}
	}

	public VirtualPet getPetFromPetName(String petName) {
		VirtualPet retrievedPet = petsInTheShelter.get(petName);
		return retrievedPet;
	}

}