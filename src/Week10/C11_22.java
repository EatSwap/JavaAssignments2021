package Week10;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 23:54 14/11/21
 * Project: JavaAssignments2021
 */

public class C11_22 {
	private static void func1() throws Exception {
		try {
            func2();
        } catch (RuntimeException e) {
            System.out.println("func1 catch");
        }
	}

	private static void func2() throws Exception {
        throw new Exception("func2 exception");
    }

	public static void main(String[] args) {
        try {
			func1();
		} catch (Throwable e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
    }
}
