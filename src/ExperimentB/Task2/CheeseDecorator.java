package ExperimentB.Task2;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 21:51 11/12/21
 * Project: JavaAssignments2021
 */

public class CheeseDecorator extends SubstanceDecorator {
	public CheeseDecorator(Pizza tempPizza) {
		super(tempPizza);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " with cheese";
	}

	@Override
	public int getCost() {
		return super.getCost() + 1919810;
	}
}
