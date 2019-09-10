package VirtualPetsAmok;

public class VirtualPet {
	
	int hunger = 5;
	int sickness = 5;
	int boredom = 5;
	//refactor "value"
	
	public int getHunger()
	{
		return hunger;
	}
	
	public int feedFood(int inputFeedValue)
	{
		hunger = hunger - inputFeedValue;
		if (hunger < 0) {
			hunger = 0;
		}
		return hunger;
	}

	public int getSickness() {
		return sickness;
	}

	public int giveMeMyMeds(int medValue)
	{
	sickness = sickness - medValue;
	if (sickness < 0) {
		sickness = 0;	
	}
		return sickness;
	}

	public int getBoredom() {
		return boredom;
	}

	public int givePlay(int playValue) {
		boredom = boredom - playValue;
		if (boredom < 0) {
			boredom = 0;
		}
		return boredom;
	}

	public void tick() {
		hunger ++;
		boredom ++;
	}
}
