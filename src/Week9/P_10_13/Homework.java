package Week9.P_10_13;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 17:43 07/11/21
 * Project: JavaAssignments2021
 */

public class Homework {
	public static void main(String[] args) {
		List<CarbonFootprint> list = new ArrayList<>();
		list.add(new Car(1, 300, 13));
		list.add(new Building("ZaoGao", 250, 70));
		list.add(new Bicycle(400));

		for (var i : list) {
			System.out.printf("I am %s, and I produce %.1f footprints in my lifetime!\n", i.toString(), i.getCarbonFootprint());
		}
	}
}
