package Week7;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 20:05 24/10/21
 * Project: JavaAssignments2021
 */
public class C20_16 {
	public static int countDuplicate(String str) {
		String[] words = str.split("[^[a-zA-Z']]");
		Set<String> wordSet = new HashSet<>();
		Set<String> duplicatedWords = new HashSet<>();
		for (var i : words) {
			if (i.isEmpty()) {
				continue;
			}
			String lower = i.toLowerCase();
			if (!wordSet.add(lower)) {
				duplicatedWords.add(lower);
			}
		}
		return duplicatedWords.size();
	}

	public static void main(String[] args) {
		int dup = countDuplicate("I was a student. McDonald's wAs my FAVOURITE!!! Thanks.");

		// dup == 1
		System.out.printf("%d word(s) has one or more occurrences.\n", dup);
	}
}
