package modul01.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();
        int startNumber = input.nextInt();

        int counter = 0;
        boolean isFirst = true;
        StringBuilder result = new StringBuilder();

        do {
            if ((startNumber % 2) !=0){
                if (!isFirst){
                    result.append(", ");
                }
                result.append(startNumber);
                isFirst = false;
                counter++;
            }
            startNumber++;
        } while (counter < count);

        System.out.println(result.toString());

        input.close();
    }
}