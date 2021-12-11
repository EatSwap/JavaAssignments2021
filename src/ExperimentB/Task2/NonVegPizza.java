package ExperimentB.Task2;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 19:19 11/12/21
 * Project: JavaAssignments2021
 */

public class NonVegPizza extends Pizza {

	private final String description = "NonVegPizza";

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public int getCost() {
		return 998;
	}

}
