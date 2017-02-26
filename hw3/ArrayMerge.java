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
            arrayMerge[i] = arrayFirst[firstIndex] < arraySecond[secondIndex] ? arrayFirst[firstIndex++] : arraySecond[secondIndex++];
            if (firstIndex == arrayFirst.length) {
                System.arraycopy(arraySecond, secondIndex, arrayMerge, ++i, arraySecond.length - secondIndex);
                break;
            }
            if (secondIndex == arraySecond.length) {
                System.arraycopy(arrayFirst, firstIndex, arrayMerge, ++i, arrayFirst.length - firstIndex);
                break;
            }
            i++;
        }
        return arrayMerge;
    }

}
