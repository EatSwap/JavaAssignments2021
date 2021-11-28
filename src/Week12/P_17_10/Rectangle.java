package Week12.P_17_10;

import java.awt.*;
import java.util.Objects;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 21:00 27/11/21
 * Project: JavaAssignments2021
 */

public final class Rectangle extends BoundedShape {
	public Rectangle(int x1, int y1, int x2, int y2, Color color, boolean filled) {
		super(x1, y1, x2, y2, color, filled);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(this.getColor());
		if (this.isFilled()) {
			g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		} else {
			g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		}
	}
}