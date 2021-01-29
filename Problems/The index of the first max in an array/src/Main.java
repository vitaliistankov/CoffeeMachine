import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];


        for (int i = 0; i < size; i++) {

            arr[i] = input.nextInt();

        }
        int maxValue = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {

            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}