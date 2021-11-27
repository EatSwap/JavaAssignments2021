package Week12.P_17_10;

import java.awt.*;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 21:06 27/11/21
 * Project: JavaAssignments2021
 */

public record Oval(int x1, int y1, int x2, int y2, Color color, boolean filled) {
	public int getUpperLeftX() {
		return Math.min(x1, x2);
	}

	public int getUpperLeftY() {
		return Math.min(y1, y2);
	}

	public int getWidth() {
		return Math.abs(x1 - x2);
	}

	public int getHeight() {
		return Math.abs(y1 - y2);
	}

	public void draw(Graphics g) {
		g.setColor(color);
		if (filled) {
			g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		} else {
			g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		}
	}
}
