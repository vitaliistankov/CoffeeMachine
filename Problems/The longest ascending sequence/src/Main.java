import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 1;
        int max = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
            } else {
                if (max < count) {
                    max = count;
                }
                count = 1;
            }
        }
        //System.out.println(max > count ? max : count);
        System.out.println(Math.max(count, max));

    }
}