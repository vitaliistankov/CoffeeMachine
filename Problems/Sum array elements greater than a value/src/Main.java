import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // put your code here

        Scanner inputNumbers = new Scanner(System.in);
        int arrSize = inputNumbers.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {

            arr[i] = inputNumbers.nextInt();
        }
        int n = inputNumbers.nextInt();
        int sum = 0;
        for (int var :
                arr) {
            if (var > n) {
                sum += var;
            }
        }
        System.out.println(sum);
    }
}
