import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, Welcome!");

        /*
        * Two Sum
         */

        TwoSum twoSum = new TwoSum();

        int[] twoSumNums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] twoSumResult1 = twoSum.twoSumOptimized(twoSumNums1, target1);
        if (twoSumResult1[0] != -1 && twoSumResult1[1] != -1) {

            System.out.println("\"" + Arrays.toString(twoSumNums1) + "\"" + " : Numbers, " + "\"" + twoSumNums1[twoSumResult1[0]] + "\"" + " and " + "\"" + twoSumNums1[twoSumResult1[1]] + "\"" + " adds upto target, " + "\"" + target1 + "\"");

        } else {

            System.out.println("\"" + Arrays.toString(twoSumNums1) + "\"" + " : No Two Number Found that that adds upto target, " + target1);

        }

        int[] twoSumNums2 = {3, 2, 4};
        int target2 = 6;
        int[] twoSumResult2 = twoSum.twoSumOptimized(twoSumNums2, target2);
        if (twoSumResult2[0] != -1 && twoSumResult2[1] != -1) {

            System.out.println("\"" + Arrays.toString(twoSumNums2) + "\"" + " : Numbers, " + "\"" + twoSumNums2[twoSumResult2[0]] + "\"" + " and " + "\"" + twoSumNums2[twoSumResult2[1]] + "\"" + " adds upto target, " + "\"" + target2 + "\"");

        } else {

            System.out.println("\"" + Arrays.toString(twoSumNums2) + "\"" + " : No Two Number Found that that adds upto target, " + target2);

        }

        int[] twoSumNums3 = {3, 3};
        int target3 = 6;
        int[] twoSumResult3 = twoSum.twoSumOptimized(twoSumNums3, target3);
        if (twoSumResult3[0] != -1 && twoSumResult3[1] != -1) {

            System.out.println("\"" + Arrays.toString(twoSumNums3) + "\"" + " : Numbers, " + "\"" + twoSumNums3[twoSumResult3[0]] + "\"" + " and " + "\"" + twoSumNums3[twoSumResult3[1]] + "\"" + " adds upto target, " + "\"" + target3 + "\"");

        } else {

            System.out.println("\"" + Arrays.toString(twoSumNums3) + "\"" + " : No Two Number Found that that adds upto target, " + target3);

        }

        int[] twoSumNums4 = {2, 7, 11, 15, 17, 19, 20};
        int target4 = 1;
        int[] twoSumResult4 = twoSum.twoSumOptimized(twoSumNums4, target4);
        if (twoSumResult4[0] != -1 && twoSumResult4[1] != -1) {

            System.out.println("\"" + Arrays.toString(twoSumNums4) + "\"" + " : Numbers, " + "\"" + twoSumNums4[twoSumResult4[0]] + "\"" + " and " + "\"" + twoSumNums4[twoSumResult4[1]] + "\"" + " adds upto target, " + "\"" + target4 + "\"");

        } else {

            System.out.println("\"" + Arrays.toString(twoSumNums4) + "\"" + " : No Two Number Found that that adds upto target, " + target4);

        }

    }

}