package MyExercise;

import java.util.Scanner;

public class MyFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserire un numero per il conto alla rovescia");
        int num = sc.nextInt();
        contoAllaRovescia(num);
        sc.close();
    }

    public static void contoAllaRovescia(int num) {
        System.out.println("conto alla rovescia" + num + "fino a 0");

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}