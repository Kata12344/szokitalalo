package szokitalalo;

import java.util.Scanner;

public class SzoKitalalo {

    static String[] szoTomb;
    static String kitalalandoSzo = "";
    static String bekertszo = "";
    static int talalatokSzama = 0;

    public static void main(String[] args) {

    }
<<<<<<< HEAD
    
    static void tombFeltotlt(){
      szoTomb[0] = "tű";
      szoTomb[1] = "ló";
      szoTomb[2] = "és";
    }
=======

    private static void feladatKiiras() {
        System.out.println("Üdvözöllek! Ez itt egy - Kata, Kriszti és Dana által készített szókitalálós játék. A gép gondol egy 2 betűs szóra, és Neked ezt kell majd kitalálnod. Írnod kell 2 betűs szavakat, a gép pedig közölni fogja veled, hogy milyen arányban egyezik az, a kitalálandő szóval.");
    }   
    private static void beker() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tipp: ");
        do {
            bekertszo = sc.nextLine();
        } while (bekertszo.length() != 2);
    }

>>>>>>> b84c4876a2d8a8b3feabf3e6333ff54472f74ca6
}
