package VirtualPetsAmok;

public class VirtualPet {
	
	int hungerValue = 5;
	
	public int getHunger()
	{
		return hungerValue;
	}
	
	public int feedFood(int inputFeedValue)
	{
		hungerValue = hungerValue - inputFeedValue;
		if (hungerValue < 0) {
			hungerValue = 0;
		}
		return hungerValue;
	}
}
