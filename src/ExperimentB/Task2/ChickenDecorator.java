package ExperimentB.Task2;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 21:50 11/12/21
 * Project: JavaAssignments2021
 */

public class ChickenDecorator extends SubstanceDecorator {
	public ChickenDecorator(Pizza tempPizza) {
		super(tempPizza);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " with chicken";
	}

	@Override
	public int getCost() {
		return super.getCost() + 114514;
	}

}
