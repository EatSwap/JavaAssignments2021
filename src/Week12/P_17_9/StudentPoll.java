package Week12.P_17_9;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 09:11 26/11/2021
 * Project: JavaAssignments2021
 */

public class StudentPoll {
    public static void main(String[] args) {
        // student response array
        int[] responses = {1};
        int[] frequency = new int[6];

        for (int i = 0; i < responses.length; ++i) {
            try {
                ++frequency[responses[i]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("   responses[%d] = %d\n\n", i, responses[i]);
            }
        }
    }
}
