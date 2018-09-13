package programozasitetelek;

//A tömb legkisebb és legnagyobb elemének meghatározása
public class MinMax {
    private int[] keres;

    public MinMax(int[] keres) {          //konstruktor
        this.keres = keres;
        
        System.out.println("A tömben a legkisebb szám a " + minimum() + ", a legnagyobb a " + maximum());
    }
    
    private int minimum(){
        int mm = keres[0];
        
        for(int i = 0; i < keres.length; i++){
            if(mm > keres[i]){
                mm = keres[i];
            }
        }
        return mm;
    }
    
    private int maximum(){
        int mm = keres[0];
        
        for(int i = 0; i < keres.length; i++){
            if(mm < keres[i]){
                mm = keres[i];
            }
        }
        return mm;
    }
    
    
}
