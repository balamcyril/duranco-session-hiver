/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorielle.avance;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class FactorielleAvance {

    public static int facto(int f){
        if(f==0 || f==1)
        {
            return 1;
        }
        else
        {
          return f * facto(f-1);   
        }
    }
    public static void main(String[] args) {
       int nbr, resultat;
       
       System.out.println("Bienvenue sur le programme de calcul du factorielle\n");
       System.out.println("\nVeuillez entrer le nombre");
       
       Scanner affiche = new Scanner(System.in);
       nbr = affiche.nextInt();
       resultat= facto(nbr);
       System.out.println("Le factorielle de " + nbr + " est :" + resultat);
    }
    
}
