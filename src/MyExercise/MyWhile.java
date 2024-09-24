package MyExercise;

import java.util.Scanner;

public class MyWhile {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Inserisci una stringa");
            str = sc.nextLine();
            String[] testo = str.split("");
            System.out.println(String.join(",", testo));
        } while (!str.equals(":q"));
        sc.close();
        System.out.println("programma chiuso");
    }


}
