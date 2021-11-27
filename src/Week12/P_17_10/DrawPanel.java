package Week12.P_17_10;

import java.awt.*;
import java.util.Random;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 20:50 27/11/21
 * Project: JavaAssignments2021
 */

public class DrawPanel extends javax.swing.JPanel {
	private MyLine[] lines = null;

	public DrawPanel() {
		setBackground(java.awt.Color.WHITE);

		Random random = new Random();
		lines = new MyLine[random.nextInt(5) + 5];

		for (int i = 0; i < lines.length; i++) {
			lines[i] = new MyLine(
				random.nextInt(300),
				random.nextInt(300),
				random.nextInt(300),
				random.nextInt(300),
				new Color(
					random.nextInt(255),
					random.nextInt(255),
					random.nextInt(255)
				)
			);
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (MyLine line : lines) {
			line.draw(g);
		}
	}
}
