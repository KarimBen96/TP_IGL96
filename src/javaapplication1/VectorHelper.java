/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Karim
 */
public class VectorHelper {
    
    
    /**
     * getMinMax recupere le minimum et le maximum d'un tableau
     * 
     * @param tab le tableau qu'on va traiter 
     * @param taille la taille du tableau tab
     * @return un tableau ou le premier element et le minimum et le seconf element est le maximum
     */
    public static int[] getMinMax2(int[] tab, int taille){
        int min, max;
        int[] vect = new int[2];

        min = tab[0];
        max = tab[0];
        for (int i = 1; i < taille; i++) {
            if(tab[i] >= max)
                max = tab[i];
            if(tab[i] <= min)
                min = tab[i];
        }
        vect[0] = min;
        vect[1] = max;
        return vect;
    }

    /**
     * formule multiplie tous les elements d'un tableau fois 2
     * 
     * @param tab le tableau d'entree 
     * @param taille la taille du tableau tab
     * @return un tableau avec les elements de tab fois 2
     */
    public static int[] formule2(int[] tab, int taille){
        int[] tabF = new int[taille];

        for (int i = 0; i < taille; i++) {
            tabF[i] = tab[i]*2;
        }
        return tabF;
    }
    
}
