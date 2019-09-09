package VirtualPetsAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetTest {
	VirtualPet underTest;

	@Before //Runs this method before each test.
	public void setup() {
		underTest = new VirtualPet();
	}
	
	@Test
	public void getHungerTest() {
		int expected = underTest.getHunger();
		assertEquals(expected, 5); 
	}	

	@Test
	public void feedingDecreasesHunger() {
		int expected = underTest.feedFood(2);
		assertEquals(expected, 3);
	}
	
	@Test
	public void hungerCannotGoBelowZero() {
		int expected = underTest.feedFood(11);
		assertEquals(expected, 0);
	}

	
}
