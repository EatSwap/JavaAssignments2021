package ExperimentA.Task4;

import java.util.List;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 16:23 12/12/21
 * Project: JavaAssignments2021
 */

public class RecycleBin1 {
	private final List<Object> items;

	private static RecycleBin1 instance;

	private RecycleBin1() {
		this.items = new java.util.ArrayList<Object>();
	}

	public static RecycleBin1 getInstance() {
		if (instance == null) {
			instance = new RecycleBin1();
		}
		return instance;
	}

	public void addItem(Object item) {
		items.add(item);
	}

	public void removeItem(Object item) {
		items.remove(item);
	}

	public void clear() {
		items.clear();
	}

	public int size() {
		return items.size();
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}

	public Object get(int index) {
		return items.get(index);
	}

	public void set(int index, Object item) {
		items.set(index, item);
	}

	public void add(int index, Object item) {
		items.add(index, item);
	}

	public Object remove(int index) {
		return items.remove(index);
	}

	public void removeAll(Object item) {
		items.remove(item);
	}

	public int indexOf(Object item) {
		return items.indexOf(item);
	}

	public int lastIndexOf(Object item) {
		return items.lastIndexOf(item);
	}

	public boolean contains(Object item) {
		return items.contains(item);
	}
}
