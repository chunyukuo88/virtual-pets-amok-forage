package VirtualPetsAmok;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class PetShelterTest {
	
	PetShelter underTest;

	@Before
	public void setup() {
	underTest = new PetShelter();
	}
	
	@Test
	public void addPetToShelter() {
		VirtualPet petUnderTest = new VirtualPet("chupacabra", 5,5,5);
		underTest.petAdder(petUnderTest);
		assertThat(underTest.getPetsInTheShelter(), contains(petUnderTest));
	} 
	
	@Test
	public void addAnotherPetToShelter() {
		VirtualPet petUnderTest2 = new VirtualPet("Bobby", 5,5,5);
		VirtualPet petUnderTest = new VirtualPet("chupacabra", 5,5,5);
		underTest.petAdder(petUnderTest);
		underTest.petAdder(petUnderTest2);
		Collection<VirtualPet> twoAddedPets = underTest.getPetsInTheShelter();
		//This next line had us stumped for a while because I had done twoAddedPets.containsInAnyOrder [...]
		assertThat(twoAddedPets, containsInAnyOrder(petUnderTest, petUnderTest2));
		
	}
	
}
