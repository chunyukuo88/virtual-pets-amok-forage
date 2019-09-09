package VirtualPetsAmok;

public class VirtualPet {
	
	int hungerValue = 5;
	int sicknessValue =5 ;
	
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

	public int getSickness() {
		return sicknessValue;
	}

	public int giveMeMyMeds(int medValue)
	
	{
	sicknessValue = sicknessValue - medValue;
	if (sicknessValue < 0) {
	sicknessValue = 0;	
	}
		return sicknessValue;
		
	}
}
