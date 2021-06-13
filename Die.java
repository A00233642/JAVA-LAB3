
public class Die {

	String type;
	int numberOfSide;
	int currentSide;


	public Die() {
		this.type = "d6";
		this.numberOfSide = 6;
		this.currentSide = (int)( Math.random() * 6 ) + 1;
	}

	public Die(int numberOfSide) {
		this.type = "d"+numberOfSide;
		this.numberOfSide = numberOfSide;
		this.currentSide = (int)( Math.random() * numberOfSide ) + 1;
	}

	public Die(String type, int numberOfSide) {
		this.type = type;
		this.numberOfSide = numberOfSide;
		this.currentSide = (int)( Math.random() * numberOfSide ) + 1;
	}

	public String getType() {
		return type;
	}


	public int getNumberOfSide() {
		return numberOfSide;
	}

	public void setNumberOfSide(int numberOfSide) {         // references the Object we're working in
		this.numberOfSide = numberOfSide;
		this.type = "d"+numberOfSide;
	}

	public int getCurrentSide() {
		return currentSide;
	}

	public void setCurrentSide(int currentSide) {              // references the Object we're working in
		this.currentSide = currentSide;
	}

	public void roll () {
		setCurrentSide((int)( Math.random() * getNumberOfSide() ) + 1);
	}


}
