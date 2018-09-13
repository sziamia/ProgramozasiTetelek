package programozasitetelek;

//A tömbben van-e az adott elem és hol?
public class Kereses {          
    private int[] ker;

    public Kereses(int[] ker) { //konstruktor
        this.ker = ker;
        
        keres();
    }
    
    private int keres(){
        int vanE = 0;
        int eredmeny;
        int i = 0;
        int n = 0;
        
        
        while(i < ker.length && ker[i] != vanE){
            i++;
        }
        
        if(i < ker.length){
            eredmeny = 1;
            
            for(i = 0; i < ker.length; i++){
                if(ker[i] == vanE){
                    n = i+1;
                }
            }
            
            System.out.println("A tömben szerepel a keresett " + vanE + " szám, a " + n + ". a sorban");
        }else {
            eredmeny = 0;
            System.out.println("A tömben NEM szerepel a keresett szám");
        }
        return eredmeny;
    }    
}
