package MyExercise;

public class MyWhile {

    public String suddividiStringa(String str) {
    String[] arrStr = str.split("");
    return String.join(",", arrStr);

    }
}


// mia soluzione:
//        String str = "";
//
//       do{
//           System.out.println("Inserisci una stringa");
//           str = sc.nextLine();
//           String[] testo = str.split("");
//            System.out.println(String.join(",", testo));
//       } while (!str.equals(":q"));
//
//        System.out.println("programma chiuso");
