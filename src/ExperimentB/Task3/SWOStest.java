package ExperimentB.Task3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 22:51 11/12/21
 * Project: JavaAssignments2021
 */

public class SWOStest {
	public static void main(String[] args) {
		SkipWhitespaceOutputStream out = new SkipWhitespaceOutputStream(System.out);
		Scanner stdin = new Scanner(System.in);
		while (stdin.hasNextLine()) {
			String s = stdin.nextLine();
			try {
				out.write(s.getBytes());
				out.write('\n');
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
