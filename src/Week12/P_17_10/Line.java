package Week12.P_17_10;

import java.awt.*;
import java.util.Objects;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 20:42 27/11/21
 * Project: JavaAssignments2021
 */

public final class Line {
	private final int x1;
	private final int y1;
	private final int x2;
	private final int y2;
	private final Color color;

	public Line(int x1, int y1, int x2, int y2, Color color) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.color = color;
	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null || obj.getClass() != this.getClass()) return false;
		var that = (Line) obj;
		return this.x1 == that.x1 &&
			this.y1 == that.y1 &&
			this.x2 == that.x2 &&
			this.y2 == that.y2 &&
			Objects.equals(this.color, that.color);
	}

	@Override
	public int hashCode() {
		return Objects.hash(x1, y1, x2, y2, color);
	}

	@Override
	public String toString() {
		return "Line[" +
			"x1=" + x1 + ", " +
			"y1=" + y1 + ", " +
			"x2=" + x2 + ", " +
			"y2=" + y2 + ", " +
			"color=" + color + ']';
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	public Color getColor() {
		return color;
	}

}
