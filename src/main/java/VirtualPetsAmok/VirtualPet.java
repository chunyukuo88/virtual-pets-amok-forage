package VirtualPetsAmok;

public class VirtualPet {
	
	int hungerValue = 5;
	int sicknessValue = 5;
	int boredomValue = 5;
	
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

	public int getBoredom() {
		return boredomValue;
	}

	public int givePlay(int playValue) {
		boredomValue = boredomValue - playValue;
		if (boredomValue < 0) {
			boredomValue = 0;
		}
		return boredomValue;
	}
}
