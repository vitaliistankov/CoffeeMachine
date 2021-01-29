import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner inputNumbers = new Scanner(System.in);
        int arrSize = inputNumbers.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = inputNumbers.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[0]);

    }
}

