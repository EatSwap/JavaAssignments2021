package Week12.P_17_10;

import java.awt.*;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 20:42 27/11/21
 * Project: JavaAssignments2021
 */

public record Line(int x1, int y1, int x2, int y2, Color color) {
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}
}
