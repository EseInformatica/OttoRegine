/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ottoregine;

/**
 *
 * @author leand
 */
public class OttoRegine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scacchiera s = new Scacchiera();
        if (s.risolvi(0,1)) {
            System.out.println("Soluzione trovata");
        } else {
            System.out.println("Soluzone non trovata");
        }
        
    }
    
}
