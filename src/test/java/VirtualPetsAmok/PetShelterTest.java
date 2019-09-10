package VirtualPetsAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetShelterTest {

	@Test
	
	
	
	public void addPetToShelter() {
		PetShelter underTest = new PetShelter();
		VirtualPet petUnderTest = new VirtualPet("chupacabra", 5,5,5);
		underTest.petsInTheShelter.add(petUnderTest);
		assertEquals(underTest.petsInTheShelter.get(0), (petUnderTest));
		
	}
	
}
