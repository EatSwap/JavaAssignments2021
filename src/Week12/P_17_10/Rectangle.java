package Week12.P_17_10;

import java.awt.*;
import java.util.Objects;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 21:00 27/11/21
 * Project: JavaAssignments2021
 */

public final class Rectangle {
	private final int x1;
	private final int y1;
	private final int x2;
	private final int y2;
	private final Color color;
	private final boolean filled;

	public Rectangle(int x1, int y1, int x2, int y2, Color color, boolean filled) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.color = color;
		this.filled = filled;
	}

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
			g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		} else {
			g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null || obj.getClass() != this.getClass()) return false;
		var that = (Rectangle) obj;
		return this.x1 == that.x1 &&
			this.y1 == that.y1 &&
			this.x2 == that.x2 &&
			this.y2 == that.y2 &&
			Objects.equals(this.color, that.color) &&
			this.filled == that.filled;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x1, y1, x2, y2, color, filled);
	}

	@Override
	public String toString() {
		return "Rectangle[" +
			"x1=" + x1 + ", " +
			"y1=" + y1 + ", " +
			"x2=" + x2 + ", " +
			"y2=" + y2 + ", " +
			"color=" + color + ", " +
			"filled=" + filled + ']';
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

	public boolean isFilled() {
		return filled;
	}
}