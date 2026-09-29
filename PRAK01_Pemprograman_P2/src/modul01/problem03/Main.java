package modul01.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();
        int startNumber = input.nextInt();

        int counter = 0;

        do {
            if ((startNumber % 2) != 0) {
                System.out.print(startNumber);
                counter++;
                if (counter < count) {
                    System.out.print(", ");
                }
            }
            startNumber++;
        } while (counter < count);
        System.out.println();

        input.close();
    }
}