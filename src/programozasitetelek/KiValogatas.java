package programozasitetelek;

import java.util.ArrayList;

//A tömbből a páratlan számok kiválogatása egy ArrayList-be
public class KiValogatas {
    private int[] valogat;

    public KiValogatas(int[] valogat) {  //konstruktor
        this.valogat = valogat;
        
        System.out.println("Kiválogatott páratlan számok a következők: " + valogatas() );
    }
    
    private ArrayList valogatas(){
        ArrayList lista = new ArrayList();
        
        for(int i = 0; i < valogat.length; i++){
            if(valogat[i] %2 != 0){
                lista.add(this.valogat[i]);
            }
        }
        return lista;
    }
}
