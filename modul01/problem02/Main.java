package modul01.problem02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int startNumber = input.nextInt();
        int counter = 0;
        StringBuilder result = new StringBuilder();

        while (counter <= 10){
            int displayedValue;

            if (startNumber % 5 == 0) {
                displayedValue = (startNumber / 5) - 1;
            } else {
                displayedValue = startNumber;
            }

            if (counter > 0){
                result.append(", ");
            }
            result.append(displayedValue);

            startNumber++;
            counter++;
        }
        System.out.println(result.toString());

        input.close();
    }
}
