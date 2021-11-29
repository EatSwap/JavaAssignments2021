package Week9.P_10_13;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 17:35 07/11/21
 * Project: JavaAssignments2021
 */

public class Car implements CarbonFootprint {
	private double footprintPerDay;
	private double daysToDrivePerYear;
	private double yearsToDrive;

	public Car(double footprintPerDay, double daysToDrivePerYear, double yearsToDrive) {
		this.footprintPerDay = footprintPerDay;
		this.daysToDrivePerYear = daysToDrivePerYear;
		this.yearsToDrive = yearsToDrive;
	}

	public double getFootprintPerDay() {
		return footprintPerDay;
	}

	public void setFootprintPerDay(double footprintPerDay) {
		this.footprintPerDay = footprintPerDay;
	}

	public double getDaysToDrivePerYear() {
		return daysToDrivePerYear;
	}

	public void setDaysToDrivePerYear(double daysToDrivePerYear) {
		this.daysToDrivePerYear = daysToDrivePerYear;
	}

	public double getYearsToDrive() {
		return yearsToDrive;
	}

	public void setYearsToDrive(double yearsToDrive) {
		this.yearsToDrive = yearsToDrive;
	}

	@Override
	public double getCarbonFootprint() {
		return footprintPerDay * daysToDrivePerYear * yearsToDrive;
	}

	@Override
	public String toString() {
		return "Car{" +
				"footprintPerDay=" + footprintPerDay +
				", daysToDrivePerYear=" + daysToDrivePerYear +
				", yearsToDrive=" + yearsToDrive +
				'}';
	}
}
