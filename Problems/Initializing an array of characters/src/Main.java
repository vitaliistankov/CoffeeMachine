import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8};

    /*
        char[] characters = {'a', 'z', 'e', 'd'};
       System.out.println(Arrays.toString(characters));
       char[] array = new char[10000000000000];
       char[] array = new char[-1];
       char[] array = { 'a', 'b', 'c', 'd' };
       System.out.println(Arrays.toString(array));
    */
        //    char[] chars = {'a', 'b', 'c', 'd', 'e'};

    /*    for (int i = 2; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    */
        //    for (int i = chars.length - 1; i < chars.length; i++) { System.out.println(chars[i]); }

        //      for (int i = 3; i < chars.length; i++) { System.out.println(chars[i]); }

    //    for (int i = 0; i <= 3; i++) {System.out.println(nums[i]); } //2 4 6 8

    //    for (int i = 1; i <= 3; i++) { System.out.println(nums[i]); } //4 6 8

    //    for (int i = 0; i <= 3; i++) { System.out.println(nums[0]); } //2 2 2 2

    //    for (int i = 0; i < nums.length; i++) { System.out.println(nums[i]); } //2 4 6 8

       for (int i = nums.length - 1; i >= 0; i--)
       { System.out.println(nums[i]); } //8 6 4 2

    }
}