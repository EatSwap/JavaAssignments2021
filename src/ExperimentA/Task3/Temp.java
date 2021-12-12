package ExperimentA.Task3;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 15:51 12/12/21
 * Project: JavaAssignments2021
 */

class Temp {
	// block to be executed before any constructor.
	static {
		System.out.println("init block");
	}

	// no-arg constructor
	Temp() {
		System.out.println("default");
	}

	// constructor with one argument.
	Temp(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
		// Object creation by calling no-argument
		// constructor.
		new Temp();
		// Object creation by calling parameterized
		// constructor with one parameter.
		new Temp(10);
	}
}

