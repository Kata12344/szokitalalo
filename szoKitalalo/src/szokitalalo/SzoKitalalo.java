package szokitalalo;

import java.util.Random;
import java.util.Scanner;

public class SzoKitalalo {

    static String[] szoTomb = new String[]{"ma", "te", "ki"};
    static String kitalalandoSzo = "";
    static String bekertszo = "";
    static int talalatokSzama = 0;
    static boolean ujjatek = true;
    
    public static void main(String[] args) {
        ujrakezd();
        elkoszones();
    }

    static void szoKivalaszt() {
        Random rnd = new Random();
        int melyikSzo = rnd.nextInt(3);
        kitalalandoSzo = szoTomb[melyikSzo];
    }

    private static void feladatKiiras() {
        System.out.println("Üdvözöllek! Ez itt egy - Kata, Kriszti és Dana által készített szókitalálós játék. A gép gondol egy 2 betűs szóra, és Neked ezt kell majd kitalálnod. Írnod kell 2 betűs szavakat, a gép pedig közölni fogja veled, hogy milyen arányban egyezik az, a kitalálandó szóval.");
    }

    private static void beker() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tipp: ");
        do {
            bekertszo = sc.nextLine();
        } while (bekertszo.length() != 2);
        talalatokSzama++;
    }

    static boolean egyJoEsJoHelyen() {
        if (kitalalandoSzo.charAt(0) == bekertszo.charAt(0) || kitalalandoSzo.charAt(1) == bekertszo.charAt(1)) {
            System.out.println("Egy betű jó helyen van.");
            return true;
        }
        return false;
    }

    static boolean talalt() {

        if (kitalalandoSzo.charAt(0) == bekertszo.charAt(0) && kitalalandoSzo.charAt(1) == bekertszo.charAt(1)) {
            System.out.println("Ügyes vagy! Eltaláltad.");
            bekertszo = kitalalandoSzo;
            return true;
        }
        return false;
    }

    static boolean ketJoDeRosszHelyen() {
        if (kitalalandoSzo.charAt(0) == bekertszo.charAt(1) && kitalalandoSzo.charAt(1) == bekertszo.charAt(0)) {
            System.out.println("Mindkét betű helyes, de rossz helyen vannak :(");
            return true;
        }
        return false;
    }

    static boolean egyJoEsRosszHelyen() {
        if (kitalalandoSzo.charAt(0) == bekertszo.charAt(1) || kitalalandoSzo.charAt(1) == bekertszo.charAt(0)) {
            System.out.println("Egy betű helyes, de rossz helyen van..");
            return true;
        }
        return false;
    }

    static boolean egySeJo() {
        if (kitalalandoSzo.charAt(0) != bekertszo.charAt(0) && kitalalandoSzo.charAt(1) != bekertszo.charAt(1) && kitalalandoSzo.charAt(1) != bekertszo.charAt(0) && kitalalandoSzo.charAt(0) != bekertszo.charAt(1)) {
            System.out.println("Egy betű sem jó.");
            return true;
        }
        return false;
    }

    private static void hanyTalalatbol() {
        System.out.printf("%d db találatból találtad ki a szót. \n", talalatokSzama);
    }

    static void tippEllenorzes() {
        do {
            beker();
            if (!talalt()) {
                if (!ketJoDeRosszHelyen()) {
                    if (egyJoEsJoHelyen()==true){
                        
                    }else if (egyJoEsRosszHelyen()==true){
                       
                    }else if (egySeJo() == true){
                       
                    }
                }
            }
        } while (!bekertszo.equals(kitalalandoSzo));
    }
    static void ujrakezd(){
        Scanner sc = new Scanner(System.in);
        while(ujjatek==true){
            feladatKiiras();
            szoKivalaszt();
            System.out.println(kitalalandoSzo);
            tippEllenorzes();
            hanyTalalatbol();
            System.out.println("Szeretnéd újrakezdeni a játékot? Amennyiben igen, kérlek írj be hogy true, ellenkező esetben pedig hogy false.");
            ujjatek = sc.nextBoolean();
        }
    }
    static void elkoszones(){
        System.out.println("Köszönjük szépen hogy velünk játszottál. Reméljük élvezted és hogy még viszont láthatunk téged!");
    }

}
