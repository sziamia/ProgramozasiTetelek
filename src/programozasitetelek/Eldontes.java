
package programozasitetelek;
//Van-e a tömben egy adott tulajdonságú elem (nem érdekel, hogy mennyi és hol)
public class Eldontes {
    private int[] dont;

    public Eldontes(int[] dont) {  //konstruktor
        this.dont = dont;
        
        dontes();
        //System.out.println(dontes()); //így kiírja az "eredmény" értékét is, ami 0 vagy 1!
    }
    
    private int dontes(){
        int vanE = 11;
        int eredmeny;
        int i = 0;
        
        while(i<dont.length && dont[i] != vanE){
            i++;
        }
        
        if(i<dont.length){
            eredmeny = 1;
            System.out.println("A tömben szerepel a keresett: " + vanE + " szám!");
        }else {
            eredmeny = 0;
            System.out.println("A tömben NEM szerepel a keresett: " + vanE + " szám!");
        }
        return eredmeny;
    }
}

/* ez egy másik megoldás
    private boolean dontes(){
        int vanE = 22;
        boolean eredmeny = false;
        int i = 0;
        
        while(i<dont.length && eredmeny != true){
            if(dont[i] == vanE){
                eredmeny = true;
            }else{
                eredmeny = false;
            }
            i++;
        }
        return eredmeny;
    }
*/
