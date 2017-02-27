/**
 * Created by shafalovichv on 27.02.2017.
 */
public class DeleteDoubles {

    static int[] deleteDoubles(int arrayFirst[]) {
        boolean flag;
        int[] tempArr = new int[arrayFirst.length];
        int counter = 0;
        for (int element : arrayFirst) {
            flag = true;
            for (int j = 0; j < arrayFirst.length && flag; j++) {
                if (tempArr[j] == element) flag = false;
                else if (j == arrayFirst.length - 1) {
                    tempArr[counter] = element;
                    counter++;
                }
            }
        }

        int[] result = new int[counter];
        System.arraycopy(tempArr, 0, result, 0, counter);
        return result;
    }

    public static void main(String[] args) {
        int array[] = {1, 1, 1, 2, 2, 3, 4, 5, 5, 6, 6, 6, 7, 7, 8, 9, 9, 10, 10, 10};
        int noDoublesArray[] = deleteDoubles(array);
        for (int aNoDoublesArray : noDoublesArray) {
            System.out.println(aNoDoublesArray);
        }

    }

}
