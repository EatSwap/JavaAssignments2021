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
	private Shape[] shapes = null;

	public DrawPanel(int linesCnt, int ovalsCnt, int rectanglesCnt) {
		setBackground(java.awt.Color.WHITE);
		shapes = new Shape[linesCnt + ovalsCnt + rectanglesCnt];

		Random random = new Random();

		for (int i = 0; i < linesCnt; i++) {
			shapes[i] = new Line(
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

		for (int i = linesCnt; i < ovalsCnt + linesCnt; i++) {
			shapes[i] = new Oval(
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

		for (int i = linesCnt + ovalsCnt; i < shapes.length; i++) {
			shapes[i] = new Rectangle(
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
		for (Shape shape : shapes) {
			shape.draw(g);
		}
	}

	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}

	public String getStatus() {
		int L = 0, O = 0, R = 0;
		for (Shape shape : shapes) {
			if (shape instanceof Line) {
				L++;
			} else if (shape instanceof Oval) {
				O++;
			} else if (shape instanceof Rectangle) {
				R++;
			}
		}
		return "Lines: " + L + ", Ovals: " + O + ", Rectangles: " + R;
	}
}
