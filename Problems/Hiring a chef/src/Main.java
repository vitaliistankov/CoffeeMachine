//put imports you need here

import java.util.Scanner;

class Main {

    /*private static int age;
    private static int years;

    private static String name;
    private static String stageOfEducation;
    private static String cuisinePref;*/

    public static void main(String[] args) {
        // put your code here

        Scanner formObg = new Scanner(System.in);
        String name = formObg.next();
        int age = formObg.nextInt();
        String stageOfEducation = formObg.next();
        int yearsOfExp = formObg.nextInt();
        String cuisinePref = formObg.next();


        System.out.printf("The form for %s is completed. We will contact you if we need a chef " +
                "that cooks %s dishes.", name, cuisinePref);
    }
}