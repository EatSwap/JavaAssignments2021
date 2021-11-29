package Week12.P_17_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 20:50 27/11/21
 * Project: JavaAssignments2021
 */

public class DrawPanel extends javax.swing.JPanel {
	private Shape[] shapes = null;
	private int shapeCount = 0;
	private int shapeType = 0;
	private Shape currentShape = null;
	private Color currentColor = Color.BLACK;
	private boolean filledShape = false;
	private JLabel statusLabel = null;

	public DrawPanel(int linesCnt, int ovalsCnt, int rectanglesCnt) {
		setBackground(java.awt.Color.WHITE);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < shapeCount; i++) {
			shapes[i].draw(g);
		}
	}

	public void clearDrawing() {
		shapeCount = 0;
		repaint();
	}

	public void clearLastShape() {
		if (shapeCount > 0) {
			shapeCount--;
			repaint();
		}
	}

	public String getStatus() {
		int L = 0, O = 0, R = 0;
		for (Shape shape : shapes) {
			if (shape instanceof Line) {
				L++;
			} else if (shape instanceof Oval) {
				O++;
			} else if (shape instanceof Rectangle) {
				R++;
			}
		}
		return "Lines: " + L + ", Ovals: " + O + ", Rectangles: " + R;
	}

	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}

	public int getShapeCount() {
		return shapeCount;
	}

	public void setShapeCount(int shapeCount) {
		this.shapeCount = shapeCount;
	}

	public int getShapeType() {
		return shapeType;
	}

	public void setShapeType(int shapeType) {
		this.shapeType = shapeType;
	}

	public Shape getCurrentShape() {
		return currentShape;
	}

	public void setCurrentShape(Shape currentShape) {
		this.currentShape = currentShape;
	}

	public Color getCurrentColor() {
		return currentColor;
	}

	public void setCurrentColor(Color currentColor) {
		this.currentColor = currentColor;
	}

	public boolean isFilledShape() {
		return filledShape;
	}

	public void setFilledShape(boolean filledShape) {
		this.filledShape = filledShape;
	}

	public JLabel getStatusLabel() {
		return statusLabel;
	}

	public void setStatusLabel(JLabel statusLabel) {
		this.statusLabel = statusLabel;
	}

	class MouseUtilise extends MouseAdapter implements MouseMotionListener {

	}

}
