import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner objectForNumbers = new Scanner(System.in);
        int b = objectForNumbers.nextInt();
        int h = objectForNumbers.nextInt();

        // call the method here
        countAreaOfParallelogram(b, h);
    }

    // Do not change code below   
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}