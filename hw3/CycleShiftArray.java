/**
 * Created by Viachaslau on 2/24/2017.
 */
public class CycleShiftArray {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 6, 5, 7, 8, 9, 10};
        for (int i : shiftArray(array, 1)) {
            System.out.printf("%7d", i);
        }
    }

    public static int gcd(int length, int shift) {
        while (shift != 0) {
            int temp = length;
            length = shift;
            shift = temp % length;
        }
        return length;
    }

    public static int[] shiftArray(int array[], int shift) {
        int lengthArray = array.length;
        shift %= lengthArray;
        if (shift < 0) {
            shift = lengthArray + shift;
        }
        int d = gcd(lengthArray, shift);
        for (int i = 0; i < d; i++) {
            int temp = array[i];
            for (int j = i - shift + lengthArray; j != i; j = (j - shift + lengthArray) % lengthArray)
                array[(j + shift) % lengthArray] = array[j];
            array[i + shift] = temp;
        }
        return array;
    }
}



