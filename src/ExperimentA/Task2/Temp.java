package ExperimentA.Task2;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 13:34 11/12/21
 * Project: JavaAssignments2021
 */

public class Temp {
	Temp() {
		System.out.println("default");
	}

	Temp(int x) {
		this();
		System.out.println(x);
	}

	Temp(int x, int y) {
		this(5);
		System.out.println(x * y);
	}
}
