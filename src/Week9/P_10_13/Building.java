package Week9.P_10_13;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 17:39 07/11/21
 * Project: JavaAssignments2021
 */

public class Building implements CarbonFootprint {
	private String name;
	private double footprintPerYear;
	private double yearsToUse;

	public Building(String name, double footprintPerYear, double yearsToUse) {
		this.name = name;
		this.footprintPerYear = footprintPerYear;
		this.yearsToUse = yearsToUse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFootprintPerYear() {
		return footprintPerYear;
	}

	public void setFootprintPerYear(double footprintPerYear) {
		this.footprintPerYear = footprintPerYear;
	}

	public double getYearsToUse() {
		return yearsToUse;
	}

	public void setYearsToUse(double yearsToUse) {
		this.yearsToUse = yearsToUse;
	}

	@Override
	public double getCarbonFootprint() {
		return footprintPerYear * yearsToUse;
	}

	@Override
	public String toString() {
		return "Building{" +
				"name='" + name + '\'' +
				", footprintPerYear=" + footprintPerYear +
				", yearsToUse=" + yearsToUse +
				'}';
	}
}
