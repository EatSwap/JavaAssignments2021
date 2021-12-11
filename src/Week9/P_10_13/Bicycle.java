package Week9.P_10_13;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 17:40 07/11/21
 * Project: JavaAssignments2021
 */

public class Bicycle implements CarbonFootprint {
	private double footprintToProduce;

	public Bicycle(double footprintToProduce) {
		this.footprintToProduce = footprintToProduce;
	}

	public double getFootprintToProduce() {
		return footprintToProduce;
	}

	public void setFootprintToProduce(double footprintToProduce) {
		this.footprintToProduce = footprintToProduce;
	}

	@Override
	public double getCarbonFootprint() {
		return footprintToProduce;
	}

	@Override
	public String toString() {
		return "Bicycle{" +
			"footprintToProduce=" + footprintToProduce +
			'}';
	}
}
