/**
 * Created by shafalovichv on 27.02.2017.
 */
public class Linearize {

    static int[] linearize(int[][] targetArray) {
        int counter = 0;
        for (int[] aTargetArray1 : targetArray) {
            for (int anATargetArray1 : aTargetArray1) {
                counter++;
            }
        }
        int[] result = new int[counter];
        counter = 0;
        for (int[] aTargetArray : targetArray) {
            for (int anATargetArray : aTargetArray) {
                result[counter] = anATargetArray;
                counter++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] twoDemArray = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8},
        };

        int result[] = linearize(twoDemArray);
        for (int aResult : result) {
            System.out.println(aResult);
        }
    }
}
