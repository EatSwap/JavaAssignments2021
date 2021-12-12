package ExperimentA.Task5;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 16:33 12/12/21
 * Project: JavaAssignments2021
 */

public class DiceTest {
	public static void main(String[] args) {
		int[] bucket = new int[6];
		for (int i = 0; i < 1000; i++) {
			switch (Dice.roll().getFace()) {
				case ONE -> bucket[0]++;
				case TWO -> bucket[1]++;
				case THREE -> bucket[2]++;
				case FOUR -> bucket[3]++;
				case FIVE -> bucket[4]++;
				case SIX -> bucket[5]++;
			}
		}
		for (int i = 0; i < bucket.length; i++) {
			System.out.println((i + 1) + ": " + bucket[i]);
		}
	}
}
