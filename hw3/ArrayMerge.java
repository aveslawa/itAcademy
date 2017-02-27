import java.util.Arrays;

/**
 * Created by Viachaslau on 2/24/2017.
 */

public class ArrayMerge {


    public static void main(String[] args) {

        int arrayFirst[] = {1, 2, 3, 4, 5};
        int arraySecond[] = {5, 6, 7};

        int arrayMerge[] = merge(arrayFirst, arraySecond);
        System.out.println(Arrays.toString(arrayMerge));
    }

    public static int[] merge(int arrayFirst[], int arraySecond[]) {
        int[] arrayMerge = new int[arrayFirst.length + arraySecond.length];
        int firstIndex = 0;
        int secondIndex = 0;
        int i = 0;

        while (i < arrayMerge.length) {

            if (firstIndex != arrayFirst.length) {
                arrayMerge[i] = arrayFirst[firstIndex];
                i++;
                firstIndex++;
            }
            if (secondIndex != arraySecond.length) {
                arrayMerge[i] = arraySecond[secondIndex];
                i++;
                secondIndex++;
            }

        }
        return arrayMerge;
    }

}
