package Week9.P_10_12;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 15:53 07/11/21
 * Project: JavaAssignments2021
 */

public class PayrollSystemTest {
	public static void main(String[] args) {
		SalariedEmployee salariedEmployee = new SalariedEmployee(
			"John",
			"Smith",
			"111-11-1111",
			800.00
		);
		HourlyEmployee hourlyEmployee =
			new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		CommissionEmployee commissionEmployee =
			new CommissionEmployee(
				"Sue", "Jones", "333-33-3333", 10000, .06);
		BasePlusCommissionEmployee basePlusCommissionEmployee =
			new BasePlusCommissionEmployee(
				"Bob", "Lewis", "444-44-4444", 5000, .04, 300);
		System.out.println("Employees processed individually:\n");

		System.out.printf("%s\n%s: $%,.2f\n\n",
			salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n",
			hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n",
			commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee,
			"earned", basePlusCommissionEmployee.earnings());

		Employee[] employees = new Employee[4];
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		System.out.println("Employees processed polymorphically:\n");

		for (var i : employees) {
			System.out.println(i);
			if (i instanceof BasePlusCommissionEmployee) {
				var j = (BasePlusCommissionEmployee) i;
				j.setBaseSalary(1.10 * j.getBaseSalary());
				System.out.printf("new base salary with 10%% increase is: $%,.2f\n",
					j.getBaseSalary());
			}
			System.out.printf("earned $%,.2f\n\n", i.earnings());
		}
		// get type name of each object in employees array
		for (int j = 0; j < employees.length; j++)
			System.out.printf("Employee %d is a %s\n", j,
				employees[j].getClass().getName());
	}
}
