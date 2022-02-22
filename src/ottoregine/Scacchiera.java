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
class Scacchiera {
    
    private int RIGHE = 8;
    private int COLONNE = RIGHE;
    private int[][] scacchiera;

    public Scacchiera() {
        
        scacchiera = new int[RIGHE][COLONNE];
        
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                scacchiera[i][j] = 0;
            }
        }
        
    }
    
    private void stampa() {
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                System.out.print(scacchiera[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    
    private boolean isValida(int r, int c) {
        
        int i,j;
        
        // stessa riga
        for (j = 0; j < c; j++) {
            if (scacchiera[r][j] != 0)
                return false;
        }
        
        // diagonale superiore sinistra
        for (i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (scacchiera[i][j] != 0)
                return false;
        }
        
        // diagonale inferiore sinistra
        for (i = r + 1, j = c - 1; i < RIGHE && j >= 0; i++, j--) {
            if (scacchiera[i][j] != 0)
                return false;
        }
        
        return true;
    }
    
    public boolean risolvi(int col, int numReg) {
        
        if (col == COLONNE)
            return true;
        
        // provo tutti i possibili tentativi
        for (int i = 0; i < RIGHE; i++) {
            if (isValida(i, col)) {
                scacchiera[i][col] = numReg;
                stampa();
                if (risolvi(col + 1, numReg + 1)) {
                    return true;
                }
                // BACKTRACKING
                scacchiera[i][col] = 0;
                stampa();
            }
        }
        
        // non ce l'ho fatta
        return false;
    }
    
    
}
