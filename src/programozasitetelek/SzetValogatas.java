package programozasitetelek;

//A negativ és a pozítiv számok szétválogatása a tömbből

import java.util.ArrayList;

public class SzetValogatas {
    private int[] szet;

    public SzetValogatas(int[] szet) { //konstruktor
        this.szet = szet;
       
        System.out.println(valogat());
    }
    
    private String valogat(){
        ArrayList negativ = new ArrayList();
        ArrayList pozitiv = new ArrayList();
        
        for(int i = 0; i < szet.length; i++){
            if(szet[i] < 0){
                negativ.add(szet[i]);
            }else{
                pozitiv.add(szet[i]);
            }
        }
        return "Negatív számok:" + negativ.toString() + "  Pozitív számok:" + pozitiv.toString();
        
    }
    
    
    
}
