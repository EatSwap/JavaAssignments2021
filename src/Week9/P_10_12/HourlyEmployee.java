package Week9.P_10_12;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 15:54 05/11/21
 * Project: JavaAssignments2021
 */

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	public double earnings() {
		if (getHours() <= 40.0) {
			return getHours() * getWage();
		} else {
			return 40.0 * getWage() + (getHours() - 40.0) * getWage() * 1.5;
		}
	}

	@Override
	public String toString() {
		return "HourlyEmployee{" +
				"wage=" + wage +
				", hours=" + hours +
				"} " + super.toString();
	}
}
