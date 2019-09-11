package VirtualPetsAmok;

import static org.junit.Assert.assertEquals;

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
		assertThat(getPetsInTheShelter().contains(petUnderTest));
	}
//	
//	@Test
//	public void addAnotherPetToShelter() {
//		VirtualPet petUnderTest2 = new VirtualPet("Bobby", 5,5,5);
//		VirtualPet petUnderTest = new VirtualPet("chupacabra", 5,5,5);
//		underTest.petAdder(petUnderTest);
//		underTest.petAdder(petUnderTest2);
//		assertEquals(underTest.getPetsInTheShelter().get(1), (petUnderTest2));
//	}
//	
	
}
