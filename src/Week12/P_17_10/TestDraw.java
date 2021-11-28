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


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JOptionPane pane = new JOptionPane();
		String linesCnt = JOptionPane.showInputDialog(pane, "Enter the number of lines you want to draw");
		int lines = Integer.parseInt(linesCnt);

		String ovalsCnt = JOptionPane.showInputDialog(pane, "Enter the number of ovals you want to draw");
		int ovals = Integer.parseInt(ovalsCnt);

		String rectsCnt = JOptionPane.showInputDialog(pane, "Enter the number of rectangles you want to draw");
		int rects = Integer.parseInt(rectsCnt);

		frame.setSize(300, 300);
		frame.setVisible(true);

		DrawPanel panel = new DrawPanel(lines, ovals, rects);
		frame.add(panel);
		JLabel statusBar = new JLabel(panel.getStatus());
		frame.add(statusBar, "South");
		frame.setVisible(true);
	}
}
