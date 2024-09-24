public class Main {
    public static void main(String[] args) {
        String str1 = "Mario";
        String str2 = "Pietro";

        System.out.println("La stringa " + str1 + " ha lunghezza pari? " + stringaPariDispari(str1));
        System.out.println("La stringa " + str2 + " ha lunghezza pari? " + stringaPariDispari(str2));

    }

    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0;

    }
}
