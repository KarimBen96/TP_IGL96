/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author cosmos 2011
 */
public class VectorHelper{
 
   /**
     * trier le tableau tab
     * @param tab 
     * tableau de double a trier 
     * @param taille la taille du tableau tab
     */
    public static void tabTrie(double tab[],int taille){ // ordoner les ele,ent d un tqble

        int indice_max;

        for(int i=taille;i>1;i--){

            indice_max=max(tab,i);

            echanger(tab,i-1,indice_max);

        }

    }

    /**
     * trouver le max dans le tableau 1D tab
     * @param tab un tableau 1D
     * @param taille la taille du tableau tab
     * @return le max dans tab
     */
    public static int max(double tab[],int taille){

        int i=0,indice_max=0;

        while(i<taille){

            if(tab[i]>tab[indice_max])

                indice_max=i;

            i++;

        }

        return indice_max; 

    }

    /**
     *permuter deux case du tableau tab
     * @param tab un tableau a 1d
     * @param i indice de la i eme case dans tab
     * @param j indice de la j eme cas dans tab
     */
    public static void echanger(double tab[],int i,int j){

        double tmp;

        tmp=tab[i];

        tab[i]=tab[j];

        tab[j]=tmp;

    }

    /**
     *
     * @param tab le tableau a inverser .
     * @param taille la taille du tableau tab
     */
    public static void show(double tab[],int taille)
  {
      for(int i=0;i<taille;i++)
          System.out.println("tab["+i+"]="+tab[i]+"\n");
  }
/** 
 * 
 *  inverser les element du tableau tab
 * @param tab 
 * le tableau a inverser
 * 
 * 
 */
   public static void inverse(double tab[])
  {
     double a;
     for(int i=0,j=tab.length-1;i<tab.length/2;i++,j--)
     {
         a=tab[i];
         tab[i]=tab[j];
         tab[j]=a;
     }
  }

    /**
     *
     * @param tab1 tableau a 1D 
     * @param tab2 Tableau a 1D
     * @return un Tableau de 1D des Double de la memetaille que tab1 et tab2 contenant la somme des element de tab1 et tab2
     * @throws arraysnotmuch si le nembre des slement de 
     */
    public static double[] somme(double tab1[],double tab2[]) throws arraysnotmuch
   {
       double tabres[]= new double[tab1.length];
       if(!(tab1.length==tab2.length) ) throw new arraysnotmuch("les deux tableaux n'ont pas la meme taille");
       else
       {
         for(int i=0;i<tab1.length;i++)   
         {
           tabres[i]=tab1[i]+tab2[i];  
         }
       }
      
       
       show(tabres,tabres.length);
       return tabres;
   }
   
}
