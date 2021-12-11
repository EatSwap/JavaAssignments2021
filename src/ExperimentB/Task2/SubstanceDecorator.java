package ExperimentB.Task2;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 19:21 11/12/21
 * Project: JavaAssignments2021
 */

public class SubstanceDecorator extends Pizza {
	protected Pizza tempPizza;

	public SubstanceDecorator(Pizza tempPizza) {
		this.tempPizza = tempPizza;
	}

	@Override
	public int getCost() {
		return tempPizza.getCost();
	}

	@Override
	public String getDescription() {
		return tempPizza.getDescription();
	}

}
