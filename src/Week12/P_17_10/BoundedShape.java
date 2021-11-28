package Week12.P_17_10;

import java.awt.*;
import java.util.Objects;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 21:05 28/11/21
 * Project: JavaAssignments2021
 */

public abstract class BoundedShape extends Shape {
	private boolean isFilled;

	public BoundedShape(int x1, int y1, int x2, int y2, Color color, boolean isFilled) {
		super(x1, y1, x2, y2, color);
		this.isFilled = isFilled;
	}

	public BoundedShape() {
		super();
		this.isFilled = false;
	}

	public int getUpperLeftX() {
		return Math.min(getX1(), getX2());
	}

	public int getUpperLeftY() {
		return Math.min(getY1(), getY2());
	}

	public int getWidth() {
		return Math.abs(getX1() - getX2());
	}

	public int getHeight() {
		return Math.abs(getY1() - getY2());
	}

	@Override
	abstract void draw(Graphics g);

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean filled) {
		isFilled = filled;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		BoundedShape that = (BoundedShape) o;
		return isFilled == that.isFilled;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), isFilled);
	}
}
