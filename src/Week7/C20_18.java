package Week7;

import java.util.LinkedList;
import java.util.List;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 20:35 24/10/21
 * Project: JavaAssignments2021
 */
public class C20_18 {
	public static void main(String[] args) {
		char[] charArray = "1234567890".toCharArray();
		List<Character> listA = new LinkedList<>();
		for (char i : charArray) {
			listA.add(i);
		}
		List<Character> listB = new LinkedList<>();
		for (char i : listA) {
			listB.add(0, i);
		}

		for (char i : listA) {
			// 1234567890
			System.out.print(i);
		}
		System.out.print("\n");
		for (char i : listB) {
			// 0987654321
			System.out.print(i);
		}
	}
}
