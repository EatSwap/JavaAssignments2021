package Week12.P_17_10;

import java.awt.*;
import java.util.Objects;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 21:00 27/11/21
 * Project: JavaAssignments2021
 */

public final class Rectangle extends Shape {
	private final boolean filled;

	public Rectangle(int x1, int y1, int x2, int y2, Color color, boolean filled) {
		super(x1, y1, x2, y2, color);
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

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		if (filled) {
			g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		} else {
			g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Rectangle rectangle = (Rectangle) o;
		return filled == rectangle.filled;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), filled);
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

	public boolean isFilled() {
		return filled;
	}
}