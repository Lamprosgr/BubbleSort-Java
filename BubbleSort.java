import java.util.Random;

public class BubbleSort {
    static int Random() {
        Random random = new Random();
        int RandomNumber = random.nextInt(10) + 1;
        return RandomNumber;

    }

    static void Filling(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Random();
        }
    }

    static void bubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int Array[] = new int[10];

        Filling(Array);
        printArray(Array);

        bubblesort(Array);
        System.out.println("Sorted array:");
        printArray(Array);

    }
}
