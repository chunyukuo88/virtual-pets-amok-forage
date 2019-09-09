import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.wecancodeit.VirtualPet;

public class ApplicationTest {

    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet();
    }
public class VirtualPetTest {

	@Test
	public void givePetName() 
	{
		VirtualPetApp pet = new VirtualPetApp();
		String expected = pet.getName();
		assertEquals(expected, "Jeff");
	}
}
