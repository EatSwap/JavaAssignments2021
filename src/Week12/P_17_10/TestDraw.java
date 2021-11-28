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
		JFrame frame = new JFrame();

		DrawPanel panel = new DrawPanel(5, 5, 5);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		JLabel statusBar = new JLabel(panel.getStatus());
		frame.add(statusBar, "South");

		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
