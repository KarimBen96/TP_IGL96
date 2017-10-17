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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double tab[]={1,2,78,4};
        double tab1[]={1,2,78,4,45};
        VectorHelper.show(tab, tab.length);
        VectorHelper.tabTrie(tab, tab.length);
        System.out.print("\n*******show after******** \n");
        VectorHelper.show(tab, tab.length);
        VectorHelper.inverse(tab);
        System.out.print("\n*******show after inverse ******** \n");
        VectorHelper.show(tab, tab.length);
       try{
           VectorHelper.somme(tab, tab1);
       } 
       catch (arraysnotmuch e) {System.out.printf(""+e+"123");}
    }
    
}
