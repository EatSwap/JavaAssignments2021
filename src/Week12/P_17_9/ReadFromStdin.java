package Week12.P_17_9;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 14:42 26/11/2021
 * Project: JavaAssignments2021
 */

public class ReadFromStdin {
    public static void main(String[] args) {
        Formatter out;
        try {
            out = new Formatter("numbers.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open 'number.txt' to write.");
            return;
        }
        assert out != null;

        // Initialise stdin
        var stdin = new Scanner(System.in);

        for (int i = 0; true; i++) {
            System.out.printf("Enter your #%d selection of the vote (0 to stop): ", i);
            int vote = stdin.nextInt();
            if (vote == 0) {
                break;
            }
            out.format("%d\n", vote);
        }

        // Indicate termination
        out.format("0\n");

        out.close();
        System.out.println("You have successfully entered your votes, thank you!");
    }
}
