package programozasitetelek;
//tömben szereplő számok összege
public class Osszegzes {  
    private int[] meg;  

    public Osszegzes(int[] meg) {  //konstruktor
        this.meg = meg;
        
        System.out.println("A tömben található számok összege: " + osszeg());
        System.out.println("A tömben található páros számok összege: " + paros());
    }
    
    private int osszeg(){   
        int eredmeny = 0;
        
        for(int i=0; i<meg.length; i++){
            eredmeny  = eredmeny + this.meg[i];
        }
        
        double atlag = (double)eredmeny/meg.length;
        //A tömben szereplő számok átlaga
        System.out.println("Tömben található számok átlaga: " + atlag +"," + " Kerekítve: " + eredmeny/meg.length);
        return eredmeny;
    }
    //tömben szereplő páros számok összege
    private int paros(){   
        int eredmeny = 0;
        
        for(int i=0; i<meg.length; i++){
            if(i %2 == 0){
                eredmeny += meg[i];  //this. nélkül is lefut!???
            }
        }
        return eredmeny;
    } 
}
    
    

        