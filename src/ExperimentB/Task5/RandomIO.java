package ExperimentB.Task5;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 13:43 11/12/21
 * Project: JavaAssignments2021
 */

public class RandomIO {
	public static void main(String[] args) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("README.txt", "rw");
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		// Write two random lines
		try {
			raf.writeBytes("This is a random line\n");
			raf.writeBytes("This is another random line\n");
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		// Determine where is the end of first line
		long endOfFirstLine = -1;
		try {
			raf.seek(0);
			raf.readLine();
			endOfFirstLine = raf.getFilePointer();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		String secondLine = null;
		try {
			secondLine = raf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		System.out.println("----- START OF THE SECOND LINE -----\n" + secondLine + "\n----- END OF THE SECOND LINE -----\n");

		// Point to the end of the file
		try {
			raf.seek(raf.length());
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		// Write the 3rd line
		try {
			raf.writeBytes("This is the 3rd line\n");
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		// Closing
		try {
			raf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
