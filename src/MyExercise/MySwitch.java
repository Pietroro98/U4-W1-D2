package MyExercise;

import java.util.Scanner;

public class MySwitch {


//        System.out.print("Inserisci un numero tra 0 e 3: ");
//        Scanner sc = new Scanner(System.in);
//        int test = sc.nextInt();
//        System.out.print(stampaNumero(test));
//        sc.close();

    public static String stampaNumero(int num) {
        String risultato;
        switch (num) {
            case 0: {
                risultato = "zero";
                break;
            }
            case 1: {
                risultato = "uno";
                break;
            }
            case 2: {
                risultato = "due";
                break;
            }
            case 3: {
                risultato = "tre";
                break;
            }
            default: risultato = "warning, il risultato non é compreso tra 0 e 3";
        }
        return risultato;
    }
}
