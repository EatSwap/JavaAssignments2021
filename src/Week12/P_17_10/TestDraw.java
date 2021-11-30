package Week12.P_17_10;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 20:55 27/11/21
 * Project: JavaAssignments2021
 */

public class TestDraw {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel statusBar = new JLabel();
		ControlPanel controlPanel = new ControlPanel();
		DrawPanel drawPanel = new DrawPanel(statusBar, controlPanel);

		frame.add(controlPanel, BorderLayout.NORTH);
		frame.add(drawPanel, BorderLayout.CENTER);
		frame.add(statusBar, BorderLayout.SOUTH);

		frame.setSize(700, 500);
		frame.setVisible(true);
	}
}
