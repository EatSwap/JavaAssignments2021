package Week12.P_17_10;

import java.awt.*;
import java.util.Objects;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 16:52 28/11/21
 * Project: JavaAssignments2021
 */

public abstract class Shape {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private Color color;

	public Shape(int x1, int y1, int x2, int y2, Color color) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.color = color;
	}

	public Shape() {
		this(0, 0, 0, 0, Color.BLACK);
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Shape shape = (Shape) o;
		return x1 == shape.x1 && y1 == shape.y1 && x2 == shape.x2 && y2 == shape.y2 && color.equals(shape.color);
	}

	@Override
	public int hashCode() {
		return Objects.hash(x1, y1, x2, y2, color);
	}

	abstract void draw(Graphics g);
}
