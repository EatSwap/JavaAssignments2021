package Week12.P_17_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 20:50 27/11/21
 * Project: JavaAssignments2021
 */

public class DrawPanel extends javax.swing.JPanel {
	private ArrayList<Shape> shapes = new ArrayList<>();

	// Line = 0
	// Rectangle = 1
	// Oval = 2
	private int shapeType = 0;

	private Shape currentShape = null;

	private Color currentColor = Color.BLACK;

	private boolean filledShape = false;

	private JLabel statusLabel = null;

	private ControlPanel controlPanel = null;

	public DrawPanel(JLabel statusLabel, ControlPanel controlPanel) {
		this.statusLabel = statusLabel;
		this.statusLabel.setText(getStatus(0, 0));

		this.setBackground(Color.WHITE);
		this.setLayout(new BorderLayout());

		this.controlPanel = controlPanel;
		this.controlPanel.addClearButtonListener(e -> clearDrawing());
		this.controlPanel.addUndoButtonListener(e -> clearLastShape());
		this.controlPanel.addShapeComboBoxListener(e -> setShapeType(this.controlPanel.getShapeComboBox().getSelectedIndex()));
		this.controlPanel.addFilledCheckBoxListener(e -> setFilledShape(this.controlPanel.getFilledCheckBox().isSelected()));
		this.controlPanel.addColorComboBoxListener(e -> {
			switch (this.controlPanel.getColorComboBox().getSelectedIndex()) {
				case 0 -> setCurrentColor(Color.BLACK);
				case 1 -> setCurrentColor(Color.BLUE);
				case 2 -> setCurrentColor(Color.CYAN);
				case 3 -> setCurrentColor(Color.DARK_GRAY);
				case 4 -> setCurrentColor(Color.GRAY);
				case 5 -> setCurrentColor(Color.GREEN);
				case 6 -> setCurrentColor(Color.LIGHT_GRAY);
				case 7 -> setCurrentColor(Color.MAGENTA);
				case 8 -> setCurrentColor(Color.ORANGE);
				case 9 -> setCurrentColor(Color.PINK);
				case 10 -> setCurrentColor(Color.RED);
				case 11 -> setCurrentColor(Color.WHITE);
				case 12 -> setCurrentColor(Color.YELLOW);
				default -> {
				}
			}
		});

		// this.shapes = new Shape[100];
		this.addMouseListener(new MouseUtilise());
		this.addMouseMotionListener(new MouseUtilise());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Shape shape : shapes) {
			shape.draw(g);
		}
		if (currentShape != null) {
			currentShape.draw(g);
		}
	}

	public void clearDrawing() {
		shapes.clear();
		repaint();
	}

	public void clearLastShape() {
		if (shapes.size() > 0) {
			shapes.remove(shapes.size() - 1);
			repaint();
		}
	}

	public String getStatus(int mouseX, int mouseY) {
		int L = 0, O = 0, R = 0;
		if (shapes.size() > 0 && shapes != null) {
			for (Shape shape : shapes) {
				if (shape == null) {
					// Do Nothing
				} else if (shape instanceof Line) {
					L++;
				} else if (shape instanceof Rectangle) {
					R++;
				} else if (shape instanceof Oval) {
					O++;
				}
			}
		}
		return String.format("Mouse (%d, %d), Lines: %d, Rectangles: %d, Ovals: %d", mouseX, mouseY, L, R, O);
	}

	public String getStatus() {
		return getStatus(0, 0);
	}

	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
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

	public ControlPanel getControlPanel() {
		return controlPanel;
	}

	public void setControlPanel(ControlPanel controlPanel) {
		this.controlPanel = controlPanel;
	}

	class MouseUtilise extends MouseAdapter implements MouseMotionListener {
		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {
			if (shapeType == 0) {
				currentShape = new Line(e.getX(), e.getY(), e.getX(), e.getY(), currentColor);
			} else if (shapeType == 1) {
				currentShape = new Rectangle(e.getX(), e.getY(), e.getX(), e.getY(), currentColor, filledShape);
			} else if (shapeType == 2) {
				currentShape = new Oval(e.getX(), e.getY(), e.getX(), e.getY(), currentColor, filledShape);
			}
			if (statusLabel != null) {
				statusLabel.setText(getStatus(e.getX(), e.getY()));
			}
			repaint();
		}

		@Override
		public void mouseDragged(java.awt.event.MouseEvent e) {
			if (currentShape != null) {
				currentShape.setX2(e.getX());
				currentShape.setY2(e.getY());
				repaint();
			}
			if (statusLabel != null) {
				statusLabel.setText(getStatus(e.getX(), e.getY()));
			}
		}

		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {
			if (currentShape != null) {
				currentShape.setX2(e.getX());
				currentShape.setY2(e.getY());
				shapes.add(currentShape);
				currentShape = null;
				repaint();
			}
			if (statusLabel != null) {
				statusLabel.setText(getStatus(e.getX(), e.getY()));
			}
		}

		@Override
		public void mouseMoved(java.awt.event.MouseEvent e) {
			if (statusLabel != null) {
				statusLabel.setText(getStatus(e.getX(), e.getY()));
			}
		}

		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {
			if (statusLabel != null) {
				statusLabel.setText(getStatus(e.getX(), e.getY()));
			}
		}

		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {
			if (statusLabel != null) {
				statusLabel.setText(getStatus(-1, -1));
			}
		}
	}

}
