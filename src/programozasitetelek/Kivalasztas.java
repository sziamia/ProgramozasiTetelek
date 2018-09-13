package programozasitetelek;
//adott elem pontosan hol szerepel a tömben
public class Kivalasztas {
    private int[] valaszt;

    public Kivalasztas(int[] valaszt) { //konstruktor
        this.valaszt = valaszt;
  
        System.out.println("A keresett szám a " + valasztas() + ". helyen van!");
    }
    
    private int valasztas(){
        int holVan = 5;
        int n = 0;
        
        for(int i = 0; i < valaszt.length; i++){
            if(valaszt[i] == holVan){
                n = i+1;
            }
        }
        return n;
    } 
}
