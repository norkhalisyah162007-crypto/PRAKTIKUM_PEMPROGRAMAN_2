package modul01.problem04;

import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abuRound1 = input.next();
        String abuRound2 = input.next();
        String abuRound3 = input.next();

        System.out.print("Tangan Bagas: ");
        String bagasRound1 = input.next();
        String bagasRound2 = input.next();
        String bagasRound3 = input.next();

        String[] abu = { abuRound1, abuRound2, abuRound3 };
        String[] bagas = { bagasRound1, bagasRound2, bagasRound3 };

        int scoreAbu = 0;
        int scoreBagas = 0;

        for (int i = 0; i < 3; i++){
            String a = abu[i];
            String b = bagas[i];

            if (a.equals(b)){
                continue;
            }

            boolean abuWins = (a.equals("B") && b.equals ("G"))
                    || (a.equals("G") && b.equals("K"))
                    || (a.equals("K") && b.equals("B"));

            if (abuWins){
                scoreAbu++;
            } else {
              scoreBagas++;
            }
        }

        String winner;
        if (scoreAbu > scoreBagas) {
            winner = "Abu";
        } else if (scoreBagas > scoreAbu) {
            winner = "Bagas";
        } else {
            winner = "Seri";
        }

        System.out.println(winner);
        input.close();
    }
}