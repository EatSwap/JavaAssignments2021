package Week12.P_17_10;

import java.awt.*;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 21:06 27/11/21
 * Project: JavaAssignments2021
 */

public final class Oval extends BoundedShape {
	public Oval(int x1, int y1, int x2, int y2, Color color, boolean filled) {
		super(x1, y1, x2, y2, color, filled);
	}

	public Oval() {
		super();
		this.setFilled(false);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(this.getColor());
		if (this.isFilled()) {
			g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		} else {
			g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		}
	}
}
