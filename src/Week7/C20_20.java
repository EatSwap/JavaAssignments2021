package Week7;

import java.util.Set;
import java.util.TreeSet;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 20:52 24/10/21
 * Project: JavaAssignments2021
 */

public class C20_20 {
	public static void printWordsAscending(String str) {
		String[] words = str.split("[^[a-zA-Z']]");
		Set<String> s = new TreeSet<>();
		for (String i : words) {
			if (!i.isEmpty())
				s.add(i);
		}
		for (String i : s)
			System.out.println(i);
	}

	public static void main(String[] args) {
		printWordsAscending("I love printing words ascending!");
	}
}
