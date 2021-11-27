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
	private Line[] lines = null;
	private Oval[] ovals = null;
	private Rectangle[] rectangles = null;

	public DrawPanel() {
		setBackground(java.awt.Color.WHITE);

		Random random = new Random();
		lines = new Line[random.nextInt(5) + 1];

		for (int i = 0; i < lines.length; i++) {
			lines[i] = new Line(
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

		ovals = new Oval[random.nextInt(5) + 1];
		for (int i = 0; i < ovals.length; i++) {
			ovals[i] = new Oval(
				random.nextInt(300),
				random.nextInt(300),
				random.nextInt(300),
				random.nextInt(300),
				new Color(
					random.nextInt(255),
					random.nextInt(255),
					random.nextInt(255)
				),
				random.nextInt(2) == 1
			);

		}

		rectangles = new Rectangle[random.nextInt(5) + 1];
		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle(
				random.nextInt(300),
				random.nextInt(300),
				random.nextInt(300),
				random.nextInt(300),
				new Color(
					random.nextInt(255),
					random.nextInt(255),
					random.nextInt(255)
				),
				random.nextInt(2) == 1
			);
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (Line line : lines) {
			line.draw(g);
		}

		for (Oval oval : ovals) {
			oval.draw(g);
		}

		for (Rectangle rectangle : rectangles) {
			rectangle.draw(g);
		}
	}
}
