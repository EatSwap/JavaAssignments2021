package Week9.P_10_12;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 15:50 07/11/21
 * Project: JavaAssignments2021
 */

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("BaseSalary must be >= 0.0");
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public double earnings() {
		return super.earnings() + baseSalary;
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee{" +
			"baseSalary=" + baseSalary +
			"} " + super.toString();
	}
}
