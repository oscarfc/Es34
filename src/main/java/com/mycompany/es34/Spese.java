/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.es34;

/**
 *
 * @author tss
 */
public class Spese {
    private float[] spese; 
    private int next = 0;

    public Spese(int numMaxspese) {
        this.spese = new float[numMaxspese];
    }

    public void inserisciSpesa(float spesa) {
        spese[next++] = spesa;
    }

    float getValoreSpesa(int i) {
        return spese[i];
    }
    
}
