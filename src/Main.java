import MyExercise.MyFor;
import MyExercise.MySwitch;
import MyExercise.MyWhile;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str1 = "Mario";
        String str2 = "Pietro";

        System.out.println("La stringa " + str1 + " ha lunghezza pari? " + stringaPariDispari(str1));
        System.out.println("La stringa " + str2 + " ha lunghezza pari? " + stringaPariDispari(str2));

        //anno
        Boolean anno = annoBisestile(2000);
        System.out.println(anno);

        //esercizio 2:
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci un numero tra 0 e 3: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("Hai inserito il numero :" + MySwitch.stampaNumero(num));

        //Esercizio 3:
        MyWhile es3 = new MyWhile();

        String str;
        /*do {
            System.out.println("Inserisci una stringa");
            str = sc.nextLine();
            System.out.println(es3.suddividiStringa(str));
        } while (!str.equals(":q"));*/
        while (true) {
            System.out.println("Inserisci una stringa");
            str = sc.nextLine();
            if (str.equals(":q")) {
                break;
            }
        }
        //Esercizio 4:
        MyFor.contoAllaRovescia();

    }

    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0;

    }
    public static boolean annoBisestile(int anno) {
        if(anno % 400 == 0) {
            return true;
        } else if (anno % 4 == 0 && anno % 100 != 0) {
            return true;
        } else {
            return false;
        }

    }
}
