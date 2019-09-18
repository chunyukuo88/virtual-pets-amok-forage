package virtual_pets_amok;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import virtual_pets_amok.PetShelter;
import virtual_pets_amok.VirtualPet;

public class PetShelterTest {
	

	VirtualPet petUnderTest2 = new VirtualPet("Bobby", 5,5,5);
	VirtualPet petUnderTest = new VirtualPet("chupacabra", 5,5,5);
	PetShelter underTest;

	@Before
	public void setup() {
	underTest = new PetShelter();
	}
	
	@Test
	public void addPetToShelter() {
		underTest.takeInPet(petUnderTest);
		assertThat(underTest.getPetsInTheShelter(), contains(petUnderTest));
	} 
	
	@Test
	public void addAnotherPetToShelter() {
		underTest.takeInPet(petUnderTest);
		underTest.takeInPet(petUnderTest2);
		Collection<VirtualPet> twoAddedPets = underTest.getPetsInTheShelter();
		//This next line had us stumped for a while because I had done twoAddedPets.containsInAnyOrder [...]
		assertThat(twoAddedPets, containsInAnyOrder(petUnderTest, petUnderTest2));
	}
	
	@Test
	public void removePetFromShelter() {
		underTest.takeInPet(petUnderTest);
		underTest.takeInPet(petUnderTest2);
		Collection<VirtualPet> petsAddedAndRemoved = underTest.getPetsInTheShelter();
		underTest.removePet(petUnderTest);
		assertThat(petsAddedAndRemoved, containsInAnyOrder(petUnderTest, petUnderTest2));
	}
	
//	@Test
//	public void displayNameAndStatsForOnePet() {
//		//Arrange
//		underTest.takeInPet(petUnderTest);
//		//Act
//		String result = underTest.retrievePetAndStatus(petUnderTest);
//		//Assert
//		assertThat(result, is("| chupacabra | 5 | 5 | 5 |"));
//	}
	
	@Test
	public void nameAndStatsForAllPetsCanBeDisplayed() {
		underTest.takeInPet(petUnderTest);
		underTest.takeInPet(petUnderTest2);
	}
		

	
//	@Test
//	public void viewPetsInShelter() {
//		//Arrange
//		//Act
//		underTest.takeInPet(petUnderTest);
//		Collection<String> result = underTest.retrieveMultiplePetsAndStatus();
//
//		//Assert
//		assertThat(result, containsInAnyOrder(petUnderTest));
//
//	}
	
//	@Test
//	public void printPetsAndStats() {
//		underTest.takeInPet(petUnderTest);
//		String result  = underTest.retrievePetAndStatus(petUnderTest);
//		assertThat(result, is("| chupacabra | 5 | 5 | 5 |"));
//	}

	
	@Test
	public void canFeedAllPets() {
		underTest.takeInPet(petUnderTest);
		underTest.takeInPet(petUnderTest2);	
		underTest.feedAllPets(3);
		int expectedpetUnderTest2Hunger = petUnderTest2.getHunger();
		assertEquals(expectedpetUnderTest2Hunger, 2);
	}
	
	@Test
	public void canDisplayAllPetNamesOnly() {
		underTest.takeInPet(petUnderTest);
		underTest.takeInPet(petUnderTest2);
		Set<String> setOfPetNames = underTest.showAllPetNames();
		assertThat(setOfPetNames, containsInAnyOrder(petUnderTest.getPetName(), petUnderTest2.getPetName()));
	}
}
