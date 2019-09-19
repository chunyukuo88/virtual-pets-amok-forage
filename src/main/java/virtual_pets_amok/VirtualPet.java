package virtual_pets_amok;

public class VirtualPet {

	String petName;
	int hunger = 5;
	int sickness = 5;
	int boredom = 5;

	public VirtualPet(String nameOfPet) {
		this.petName = nameOfPet;
	}

	public VirtualPet(String nameOfPet, int hunger, int sickness, int boredom) {
		this.petName = nameOfPet;
		this.hunger = hunger;
		this.sickness = sickness;
		this.boredom = boredom;
	}

	public String getPetName() {
		return petName;
	}

	public int getHunger() {
		return hunger;
	}

	public void feedFood(int inputFeedValue) {
		hunger = hunger - inputFeedValue;
		if (hunger < 0) {
			hunger = 0;
		}
	}

	public int getSickness() {
		return sickness;
	}

	public void giveMeMyMeds() {
		sickness = sickness - 3;
		if (sickness < 0) {
			sickness = 0;
		}
	}

	public int getBoredom() {
		return boredom;
	}

	public void givePlay() {
		boredom = boredom - 3;
		if (boredom < 0) {
			boredom = 0;
		}
	}

	public void tick() {
		hunger++;
		boredom++;
		sickness++;

	}
}
