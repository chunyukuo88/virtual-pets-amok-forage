package virtual_pets_amok;

public class VirtualPet{
	
	int hunger = 5;
	int sickness = 5;
	int boredom = 5;
	String petName;
	
	public String getPetName() {
		return petName;
	}

	public VirtualPet(String nameOfPet, int hunger, int sickness, int boredom) {
		this.petName  = nameOfPet;
		this.hunger   = hunger;
		this.sickness = sickness;
		this.boredom  = boredom;
	}
	
	public String toString() {
		//String returnValue = null;
		return petName+","+hunger+",";
	}

	public int getHunger()
	{
		return hunger;
	}
	
	public void feedFood(int inputFeedValue)
	{
		hunger = hunger - inputFeedValue;
		if (hunger < 0) {
			hunger = 0;
		}
	}

	public int getSickness() {
		return sickness;
	}

	public void giveMeMyMeds(int medValue)
	{
	sickness = sickness - medValue;
	if (sickness < 0) {
		sickness = 0;	
	}
		//return sickness;
	}

	public int getBoredom() {
		return boredom;
	}

	public void givePlay(int playValue) {
		boredom = boredom - playValue;
		if (boredom < 0) {
			boredom = 0;
		}
		//return boredom;
	}

	public void tick() {
		hunger ++;
		boredom ++;
	}
}
