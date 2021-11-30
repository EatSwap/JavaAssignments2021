package Week12.P_17_10;

import java.awt.*;
import java.io.Serializable;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 20:42 27/11/21
 * Project: JavaAssignments2021
 */

public final class Line extends Shape implements Serializable {
	public Line(int x1, int y1, int x2, int y2, Color color) {
		super(x1, y1, x2, y2, color);
	}

	public Line() {
		super();
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(this.getColor());
		g.drawLine(this.getX1(), this.getY1(), this.getX2(), this.getY2());
	}

	@Override
	public String toString() {
		return "Line{} " + super.toString();
	}
}
