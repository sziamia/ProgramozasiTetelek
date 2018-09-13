package programozasitetelek;

import java.util.Arrays;


public class ProgramozasiTetelek {

    public static void main(String[] args) {
        int[] tomb = {9, -2, 4, 7, 2, 11, 0, 5, 1, 10, 6, 8, 3, -7};
        
        System.out.println("Programozási Tételek - Az alábbi tömbbel fogunk dolgozni:");
        System.out.println("Tömb elemei: " + Arrays.toString(tomb));
        System.out.println("Tömb elemeinek száma: " + tomb.length +" db" + "\n");
        
        System.out.println("ÖSSZEGZÉS");
        Osszegzes meg = new Osszegzes(tomb); //?? ha a függvény nevét (osszeg) írjuk a tömb név (meg) helyett akkor is lefut
        System.out.println("-----");
        
        System.out.println("MEGSZÁMLÁLÁS");
        Megszamlalas hanydb = new Megszamlalas(tomb);
        System.out.println("-----");
        
        System.out.println("ELDÖNTÉS");
        Eldontes dont = new Eldontes(tomb);
        System.out.println("-----");
        
        System.out.println("KIVÁLASZTÁS");
        Kivalasztas valaszt = new Kivalasztas(tomb);
        System.out.println("-----");
        
        System.out.println("KERESÉS");
        Kereses ker = new Kereses(tomb);
        System.out.println("-----");
        
        System.out.println("KIVÁLOGATÁS");
        KiValogatas valogat = new KiValogatas(tomb);
        System.out.println("-----");
        
        System.out.println("SZÉTVÁLOGATÁS");
        SzetValogatas szet = new SzetValogatas(tomb);
        System.out.println("-----");
        
        System.out.println("MINIMUM-MAXIMUM KERESÉS");
        MinMax keres = new MinMax(tomb);
        System.out.println("-----");
        System.out.println("Házi Feladat Készítette: mia");
    } 
}
