public class OttoRegine {
    public static void main(String[] args) {
        
        Scacchiera s = new Scacchiera();
        if (s.risolvi(0,1)) {
            System.out.println("Soluzione trovata");
        } else {
            System.out.println("Soluzone non trovata");
        }
        
    }
    
}
