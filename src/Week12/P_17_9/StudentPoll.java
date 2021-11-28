package Week12.P_17_9;

import java.io.*;
import java.util.Scanner;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 09:11 26/11/2021
 * Project: JavaAssignments2021
 */

public class StudentPoll {
    public static void main(String[] args) {

        Scanner selections = null;
        try {
            File selectionsFile = new File("numbers.txt");
            selections = new Scanner(selectionsFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Cannot open 'number.txt' to read.");
            return;
        }

        assert selections != null;

        int[] frequency = new int[6];

        for (int i = 0; selections.hasNextInt(); ++i) {
            int selection = selections.nextInt();
            try {
                if (selection > 0 && selection < 7) {
                    ++frequency[--selection];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        FileWriter resultsFile = null;
        try {
            resultsFile = new FileWriter("output.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cannot open 'output.txt' to write.");
        }
        assert resultsFile != null;

        try {
            resultsFile.write("Choice Frequency\n");
            for (int i = 0; i < frequency.length; ++i) {
                resultsFile.write(String.format("%6d%10d\n", 1+i, frequency[i]));
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.printf("In writing 'output.txt': %s\n", e.getMessage());
        }

        try {
            resultsFile.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.printf("In closing 'output.txt': %s\n", e.getMessage());
        }

        System.out.println("Results written.");
    }
}
