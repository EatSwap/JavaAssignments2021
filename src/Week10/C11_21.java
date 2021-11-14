package Week10;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 23:35 14/11/21
 * Project: JavaAssignments2021
 */

public class C11_21 {
    private static void someMethod() {
        System.out.println("I am someMethod");
        try {
            someMethod2();
        } catch (Throwable e) {
            System.out.println("I am someMethod catch");
            // e.printStackTrace();
            throw new RuntimeException("I am some exception caused when calling someMethod2!", e);
        }
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Throwable e) {
            System.out.println("I am main catch");
            e.printStackTrace();
        }
    }

    private static void someMethod2() {
        System.out.println("I am someMethod2");
        throw new RuntimeException("I am some exception!");
    }
}
