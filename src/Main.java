public class Main {
    public static void main(String[] args) {
        String str1 = "Mario";
        String str2 = "Pietro";

        System.out.println("La stringa " + str1 + " ha lunghezza pari? " + stringaPariDispari(str1));
        System.out.println("La stringa " + str2 + " ha lunghezza pari? " + stringaPariDispari(str2));


        //anno
        Boolean anno = annoBisestile(2000);
        System.out.println(anno);

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
