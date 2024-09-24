package MyExercise;


import java.util.Scanner;

public class MyFor {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("inserire un numero per il conto alla rovescia");
//        int num = sc.nextInt();
//        contoAllaRovescia(num);
//        sc.close();


    public static void contoAllaRovescia() {
        Scanner sc = new Scanner(System.in);

        System.out.println("conto alla rovescia fino a 0");
        int num = sc.nextInt();


        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}