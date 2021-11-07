package Week9.P_10_12;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 17:18 07/11/21
 * Project: JavaAssignments2021
 */

public class PayableInterfaceTest {
	public static void main(String[] args) {
		Payable[] payableObjects = new Payable[7];

		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);
		payableObjects[4] = new HourlyEmployee("WorkerA", "Proletariat", "222-22-2222", 0.01, 112.00);
		payableObjects[5] = new CommissionEmployee("WorkerB", "Proletariat", "114-51-4191", 100000, .01);
		payableObjects[6] = new BasePlusCommissionEmployee("WorkerC", "Proletariat", "918-00-0000", 50000, .005, 1);

		System.out.println("Invoices and Employees processed polymorphically:\n");

		for (Payable currentPayable : payableObjects) {
			if (currentPayable instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
			}
		}

		for (Payable currentPayable : payableObjects) {
			System.out.printf("%s \n%s: $%,.2f\n\n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
		}
	}
}
