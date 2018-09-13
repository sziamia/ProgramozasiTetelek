package programozasitetelek;

import java.util.Arrays;
//Hány db adott tulajdonságú elem van a tömben? (pl. páros)
public class Megszamlalas {
    private int[] hanydb;

    public Megszamlalas(int[] hanydb) {  //konstruktor
        this.hanydb = hanydb;
        
        System.out.println("Hány darab páros szám van a tömbben? " + szamol() + "db");
    }
    
    private int szamol(){        
        int szamlalo = 0;
        
        for(int i=0; i<hanydb.length; i++){
            if (hanydb[i] %2 == 0){
                szamlalo++;
            }
        }
        
        return szamlalo;
    }  
}
