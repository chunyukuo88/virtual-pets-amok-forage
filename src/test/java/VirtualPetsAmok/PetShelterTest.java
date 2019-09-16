package VirtualPetsAmok;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class PetShelterTest {
	
	PetShelter underTest;
	VirtualPet petUnderTest2 = new VirtualPet("Bobby", 5,5,5);
	VirtualPet petUnderTest = new VirtualPet("chupacabra", 5,5,5);

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
	
	@Test
	public void displayNameAndStatsForOnePet() {
		
		assertThat(underTest.retrievePetAndStatus(petUnderTest), is("| chupacabra | 5 | 5 | 5 |"));
	}
	
	@Test
	public void nameAndStatsForAllPetsCanBeDisplayed() {
		underTest.takeInPet(petUnderTest);
		underTest.takeInPet(petUnderTest2);
		
	@Test
	public void
		
		
		
//		assertEquals();
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
	
	@Test
	public void printPetsAndStats() {
		underTest.takeInPet(petUnderTest);
		String result  = underTest.retrievePetAndStatus(petUnderTest);
		assertThat(result, is("| chupacabra | 5 | 5 | 5 |"));
		
		
		
	}

}
