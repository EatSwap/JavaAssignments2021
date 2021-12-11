package ExperimentB.Task2;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 21:53 11/12/21
 * Project: JavaAssignments2021
 */

public class PizzaTest {
	public static void main(String[] args) {
		Pizza pizza = new ChickenDecorator(new VegPizza());
		System.out.println(pizza.getDescription() + " -> $" + pizza.getCost());
	}
}
