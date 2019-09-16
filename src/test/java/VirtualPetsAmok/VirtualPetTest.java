package VirtualPetsAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetTest {
	VirtualPet underTest;

	@Before //Runs this method before each test.
	public void setup() {
		underTest = new VirtualPet("Chuck Norris", 5, 5, 5);
	}
	
	@Test
	public void getHungerTest() {
		int expected = underTest.getHunger();
		assertEquals(expected, 5); 
	}	

	@Test
	public void feedingDecreasesHunger() {
		underTest.feedFood(2);
		int expected = underTest.getHunger();
		assertEquals(expected, 3);
	}
	
	@Test
	public void hungerCannotGoBelowZero() {
		underTest.feedFood(11);
		int expected = underTest.getHunger();
		assertEquals(expected, 0);
	}
	
	@Test
	public void getSicknessTest() {
		int expected = underTest.getSickness();
		assertEquals(expected, 5);
	}
	
	@Test
	public void healingDecreasesSickness() {
		underTest.giveMeMyMeds(2);
		int expected = underTest.getSickness();
		assertEquals(expected, 3);		
	}
	
	@Test
	public void sicknessCannotGoBelowZero() {
		underTest.giveMeMyMeds(11);
		int expected = underTest.getSickness();
		assertEquals(expected, 0);
	}
	
	@Test
	public void getBoredomTest() {
		int expected = underTest.getBoredom();
		assertEquals(expected, 5);
	}
	
	@Test
	public void playingDecreasesBoredom() {
		underTest.givePlay(2);
		int expected = underTest.getBoredom();
		assertEquals(expected, 3);		
	}
	
	@Test
	public void boredomCannotGoBelowZero() {
		underTest.givePlay(11);
		int expected = underTest.getBoredom();
		assertEquals(expected, 0);
	}
	
	@Test
	public void shouldTickHunger() {
		int initialHunger = underTest.getHunger();
		underTest.tick();
		int hungerAfterTick = underTest.getHunger();
		assertEquals(initialHunger+1, hungerAfterTick);
	}
	
	@Test
	public void shouldTickBoredom() {
		int initialBoredom = underTest.getBoredom();
		underTest.tick();
		int boredomAfterTick = underTest.getBoredom();
		assertEquals(initialBoredom+1, boredomAfterTick);
	}
	

	@Test
	public void toStringMethodReturnsNameAndStats() {
		String result = underTest.toString();
		assertEquals(result, "| Chuck Norris | 5 | 5 | 5 |");
	}
	
	
}
