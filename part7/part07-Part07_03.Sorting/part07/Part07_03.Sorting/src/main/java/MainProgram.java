import java.util.Arrays;
import java.util.stream.IntStream;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        int[] temp = Arrays.copyOf(array, array.length);
        sort(temp);
        return temp[0];
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int len = array.length;

        return IntStream.range(0, len)
                .filter(i -> smallest == array[i])
                .findFirst()
                .orElse(-1);
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int[] temp = Arrays.copyOfRange(table, startIndex, table.length);

        return indexOfSmallest(temp) + startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        bubbleSort(array, array.length);
    }

    static void bubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSort(arr, n - 1);
    }
}
