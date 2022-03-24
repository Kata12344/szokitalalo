package szokitalalo;

import java.util.Random;
import java.util.Scanner;

public class SzoKitalalo {

    static String[] szoTomb;
    static String kitalalandoSzo = "";
    static String bekertszo = "";
    static int talalatokSzama = 0;

    public static void main(String[] args) {

    }

    static void tombFeltotlt() {
        szoTomb[0] = "tű";
        szoTomb[1] = "ló";
        szoTomb[2] = "és";
    }
    static void szoKivalaszt(){
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
    }

    private static void egyJoEsJoHelyen() {
        if (kitalalandoSzo.charAt(0) == bekertszo.charAt(0) || kitalalandoSzo.charAt(1) == bekertszo.charAt(1)) {
            System.out.println("Egy betű jó helyen van.");
        }
    }
    private static void hanyTalalatbol() {
        System.out.printf("%d db találatból találtad ki a szót. \n", talalatokSzama);
    }
    static void egyJoEsRosszHelyen() {
        if (kitalalandoSzo.charAt(0) == bekertszo.charAt(1) || kitalalandoSzo.charAt(1) == bekertszo.charAt(0)) {
            System.out.println("Egy betű helyes, de rossz helyen van..");
        }
    }
    static void talalt() {
        if (kitalalandoSzo.charAt(0) == bekertszo.charAt(0) && kitalalandoSzo.charAt(1) == bekertszo.charAt(1)) {
            System.out.println("Ügyes vagy! Eltaláltad.");
        }
    }
    static void ketJoDeRosszHelyen(){
        if ( kitalalandoSzo.charAt(0) == bekertszo.charAt(1) && kitalalandoSzo.charAt(1) == bekertszo.charAt(0) ){
            System.out.println("Minkét betű helyes, de rossz helyen vannak:(");
        }
    }
    
}
