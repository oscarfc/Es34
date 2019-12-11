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

    private final float[] spese;
    private float anticipo;
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

    public float getAnticipo() {
        return anticipo;
    }

    public float getTotale() {
        float totale = 0;
        for (int i = 0; i < next; i++) {
            totale += getValoreSpesa(i);
        }
        return totale;
    }

    public void setAnticipo(float anticipo) {
        this.anticipo = anticipo;
    }

    @Override
    public String toString() {
        return spese.toString();
    }
}
