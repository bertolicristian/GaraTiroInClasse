/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arciere;

/**
 *
 * @author bertoli.cristian
 */
public class GaraTiro {

    public static void main(String[] args) {
        Arciere a1 = new Arciere("cristian");
        Arciere a2 = new Arciere("luca");
        
        System.out.println(a1.getNome());
        gareggia(a1);
        a1.stampaPunteggi();
        System.out.println();
        System.out.println(a1.calcolaPunteggioTotale());
        
        System.out.println();
        System.out.println();
        
        System.out.println(a2.getNome());
        gareggia(a2);
        a2.stampaPunteggi();
        System.out.println();
        System.out.println(a2.calcolaPunteggioTotale());
        
        if (a1.calcolaPunteggioTotale() > a2.calcolaPunteggioTotale()) {
            System.out.println();
            System.out.println();
            
            System.out.println("===ha vinto " + a1.getNome() + "===");
        }
        
        else if (a1.calcolaPunteggioTotale() < a2.calcolaPunteggioTotale()){
            System.out.println();
            System.out.println();
            
            System.out.println("===ha vinto " + a2.getNome() + "===");
        }
        
        else {
            System.out.println();
            System.out.println();
            
            System.out.println("===la gara tra " + a1.getNome() + " e " + a2.getNome() + " e finita in pareggio===");
        }
    }
    
    static void gareggia(Arciere a){
        
        for (int i = 0; i < 5; i++){
            a.tiro();
        }
    }
}
