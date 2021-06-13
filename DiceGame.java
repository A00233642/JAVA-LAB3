//TAIWO AKINTUNDE
//A00233642
//Application development
//This program is to create a DiceGame, display the currentSide up  and test the Rolling method to dispaly the result


public class DiceGame {

	public static void main(String[] args) {

		int highestValue;			//	To record the highest value of an die

		System.out.println("Creating a default d6...");
		Die die1 = new Die();		// Creating die with zero argument constructor

		Die die2 = new Die(20);		// Creating die with one argument constructor
		System.out.println("Creating a d20...");

		Die die3 = new Die("d10", 10); // Creating die with two argument constructor
		System.out.println("Creating percentile die (a special d10)...");


		System.out.println();
		System.out.printf("The current side up for %s is %d\n",	die1.getType(), die1.currentSide);

		System.out.printf("The current side up for %s is %d\n",die2.getType(), die2.currentSide);

		System.out.printf("The current side up for percentile is %d\n", die3.currentSide);

		System.out.println();
		System.out.println("Testing the roll method");
		System.out.println();

		// initialize the highest value for die1 object
		highestValue = die1.getCurrentSide();


		// Rolling the die

		System.out.println("Rolling the d6...");
		die1.roll();
		System.out.println("The new value is " + die1.getCurrentSide());

		System.out.println("Rolling the d20...");
		die2.roll();
		System.out.println("The new value is " + die2.getCurrentSide());

		System.out.println("Rolling the percentile...");
		die3.roll();
		System.out.println("The new value is " + die3.getCurrentSide());


		// Showing d20

		System.out.println();
		System.out.println("Setting the d20 to show 20...");

		int currentSide;
		do {
			die2.roll();
			currentSide = die2.getCurrentSide();
		}while(currentSide != 20);

		System.out.println("The side up is now 20. Finally.");


	}

}
