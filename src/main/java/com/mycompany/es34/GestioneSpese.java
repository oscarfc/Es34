/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.es34;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class GestioneSpese {
    private Spese archivioSpese;

    public static void main(String[] args) {
        GestioneSpese gSpese = new GestioneSpese();

        int numMaxSpese = gSpese.AskInt("Inserisci numero spese che vuoi gestire", 1, 100);
        gSpese.gestisciInsertSpese(numMaxSpese);
        
        JOptionPane.showMessageDialog(null, gSpese.stampaSpese(numMaxSpese));
        JOptionPane.showMessageDialog(null, gSpese.stampaSpeseConTotale(numMaxSpese));
    }

    public void gestisciInsertSpese(int numeroSpese) {
        archivioSpese = new Spese(numeroSpese);
        for (int i = 0; i < numeroSpese; i++) {
            archivioSpese.inserisciSpesa(AskSpesa("Inserisci " + (i + 1) + " spesa", -1, 1000f));
        }
    }
    
    public String stampaSpese(int numeroSpese) {
        String stampa = "Elenco Spese:\n";
        for (int i = 0; i < numeroSpese; i++) {
            stampa += (i + 1) + " -  " + archivioSpese.getValoreSpesa(i) + "\n";
        }
        
        return stampa;
    }
    
   public String stampaSpeseConTotale(int numeroSpese) {
        String stampa = "Elenco Spese:\n";
        float totale = 0;
        
        for (int i = 0; i < numeroSpese; i++) {
            totale += archivioSpese.getValoreSpesa(i);
            stampa += (i + 1) + " -  " + archivioSpese.getValoreSpesa(i) + "\n";
        }
        stampa += "Totale Spesa: " + totale + "\n";
        stampa += "Spesa media: " + totale / numeroSpese + "\n";
        return stampa;
    }

    public int AskInt(String testo, int min, int max) {
        String strInt;
        int ret = 0;
        boolean controllo = false;

        while (!controllo) {
            strInt = JOptionPane.showInputDialog(testo + " - minimo" + min + "e massimo" + max);
            try {
                ret = Integer.parseInt(strInt);
                if (ret > min && ret <= max) {
                    controllo = true;
                } else {
                    JOptionPane.showMessageDialog(null, "numero non corretto");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "numero non corretto");
            }
        }
        return ret;
    }

    public float AskSpesa(String testo, float min, float max) {
        String strFloat;
        float ret = 0;
        boolean controllo = false;

        while (!controllo) {
            strFloat = JOptionPane.showInputDialog(testo + " - minimo" + min + "e massimo" + max);
            try {
                ret = Float.parseFloat(strFloat);
                if (ret > min && ret <= max) {
                    controllo = true;
                } else {
                    JOptionPane.showMessageDialog(null, "numero non corretto");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "numero non corretto");
            }
        }
        return ret;
    }

}
