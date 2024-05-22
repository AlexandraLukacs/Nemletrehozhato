package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Haromszog;

public class HaromszogProgram {

    
    
    public static void main(String[] args) throws Exception {
        new HaromszogProgram().bemutatok();
    }
    
    private void bemutatok() throws Exception{
        //nemKezeltKivetel();
        KezeltKivetel();
    }

    private void nemKezeltKivetel() throws Exception {
        Haromszog h = new Haromszog(0, 0, 0);
        int k = h.kerulet();
        System.out.println("Ide már nem jut el a program kivétel esetén!");
    }

    private void KezeltKivetel() {
        try {
            Haromszog h = new Haromszog(0, 0, 0);
        } catch (Exception ex) {
            //Logger.getLogger(HaromszogProgram.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("HIBA");
            System.out.println("Oka: " + ex.getMessage());
        }
        
    }
}
