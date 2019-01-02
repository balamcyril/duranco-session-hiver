/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorielle.simple;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class FactorielleSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int nbr, resultat = 1;
       int i;
       
       System.out.println("Bienvenue sur le programme de calcul du factorielle\n");
       System.out.println("\nVeuillez entrer le nombre");
       
       Scanner affiche = new Scanner(System.in);
       nbr = affiche.nextInt();
       
       for(i=1; i<=nbr; i++)
       {
           System.out.println(i);
           resultat *= i;
       }
       System.out.println("Le factorielle de " + nbr + " est :" + resultat);
    }
    
}
