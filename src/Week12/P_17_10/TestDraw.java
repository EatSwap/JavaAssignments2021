package Week12.P_17_10;

import javax.swing.*;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 20:55 27/11/21
 * Project: JavaAssignments2021
 */

public class TestDraw {
	public static void main(String[] args) {
		DrawPanel panel = new DrawPanel();

		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
