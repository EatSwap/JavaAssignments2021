package Week12.P_17_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 13:54 30/11/2021
 * Project: JavaAssignments2021
 */

public class ControlPanel extends JPanel {
	private static final String[] shapeStrings = {"Line", "Rectangle", "Oval"};
	private static final String[] colorStrings = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
	private JButton undoButton = null;
	private JButton clearButton = null;
	private JComboBox<String> shapeComboBox = null;
	private JCheckBox filledCheckBox = null;
	private JComboBox<String> colorComboBox = null;
	private JButton loadButton = null;
	private JButton saveButton = null;

	ControlPanel() {
		super();

		this.undoButton = new JButton("Undo");
		this.clearButton = new JButton("Clear");
		this.shapeComboBox = new JComboBox<>(shapeStrings);
		this.filledCheckBox = new JCheckBox("Filled");
		this.colorComboBox = new JComboBox<>(colorStrings);
		this.loadButton = new JButton("Load");
		this.saveButton = new JButton("Save");

		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(this.undoButton);
		this.add(this.clearButton);
		this.add(this.shapeComboBox);
		this.add(this.filledCheckBox);
		this.add(this.colorComboBox);
		this.add(this.loadButton);
		this.add(this.saveButton);
	}

	void addUndoButtonListener(ActionListener listener) {
		this.undoButton.addActionListener(listener);
	}

	void addClearButtonListener(ActionListener listener) {
		this.clearButton.addActionListener(listener);
	}

	void addShapeComboBoxListener(ActionListener listener) {
		this.shapeComboBox.addActionListener(listener);
	}

	void addFilledCheckBoxListener(ActionListener listener) {
		this.filledCheckBox.addActionListener(listener);
	}

	void addColorComboBoxListener(ActionListener listener) {
		this.colorComboBox.addActionListener(listener);
	}

	void addLoadButtonListener(ActionListener listener) {
		this.loadButton.addActionListener(listener);
	}

	void addSaveButtonListener(ActionListener listener) {
		this.saveButton.addActionListener(listener);
	}

	public JButton getUndoButton() {
		return undoButton;
	}

	public void setUndoButton(JButton undoButton) {
		this.undoButton = undoButton;
	}

	public JButton getClearButton() {
		return clearButton;
	}

	public void setClearButton(JButton clearButton) {
		this.clearButton = clearButton;
	}

	public JComboBox<String> getShapeComboBox() {
		return shapeComboBox;
	}

	public void setShapeComboBox(JComboBox<String> shapeComboBox) {
		this.shapeComboBox = shapeComboBox;
	}

	public JCheckBox getFilledCheckBox() {
		return filledCheckBox;
	}

	public void setFilledCheckBox(JCheckBox filledCheckBox) {
		this.filledCheckBox = filledCheckBox;
	}

	public JComboBox<String> getColorComboBox() {
		return colorComboBox;
	}

	public void setColorComboBox(JComboBox<String> colorComboBox) {
		this.colorComboBox = colorComboBox;
	}
}
