package ExperimentB.Task2;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 18:48 11/12/21
 * Project: JavaAssignments2021
 */

abstract class Pizza {
	// it is an abstract pizza
	String description = "Unknown Pizza";

	// describe all the ingredients of the Pizza
	public String getDescription() {
		return description;
	}

	// return price of the pizza, including the base and toppings
	public abstract int getCost();
}
