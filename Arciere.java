/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arciere;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author bertoli.cristian
 */
public class Arciere {
    private String nome;
    private int[] punteggi = new int[5];
    private int index = 0;

    public Arciere(String nome) {
        this.nome = nome;
    }
    
    public void tiro(){
        Random r = new Random();
        int punteggio = r.nextInt(11);
        punteggi[index] = punteggio;
        index++;
    }
    
    public int calcolaPunteggioTotale() {
        Arrays.sort(punteggi);
        int somma = punteggi[2] + punteggi[3] + punteggi[4];
        return somma;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void stampaPunteggi(){
        for (int i = 0; i < punteggi.length; i++){
            System.out.print("[" + punteggi[i] + "] ");
        }
    }
}
