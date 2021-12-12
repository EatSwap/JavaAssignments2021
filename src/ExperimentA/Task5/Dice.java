package ExperimentA.Task5;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 16:29 12/12/21
 * Project: JavaAssignments2021
 */

public class Dice {
	public enum Face {
		ONE, TWO, THREE, FOUR, FIVE, SIX
	}

	private final Face face;

	private static final Dice[] dice = new Dice[6];

	static {
		for (int i = 0; i < dice.length; i++) {
			dice[i] = new Dice(i + 1);
		}
	}

	private Dice(int face) {
		this.face = Face.values()[face - 1];
	}

	public static Dice getDice(int i) {
		return dice[i - 1];
	}

	public static Dice getDice(Face face) {
		return dice[face.ordinal()];
	}

	public static Dice roll() {
		return getDice((int) (Math.random() * 6) + 1);
	}

	public Face getFace() {
		return face;
	}

}
