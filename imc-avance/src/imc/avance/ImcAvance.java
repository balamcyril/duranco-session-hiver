/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc.avance;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author user
 */
public class ImcAvance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int poids;
       double taille;
       double imc;
       int rep = 1;
       
       do
       {
        System.out.println("Bienvenue sur le programme de calsul de l'IMC\n");
        System.out.println("\nVeuillez entrer votre poids (en KG)");
       
        Scanner affiche = new Scanner(System.in);
        poids = affiche.nextInt();

        System.out.println("\nVeuillez entrer votre taille (en cm)");
        taille = affiche.nextDouble();
        taille = taille/100;

        imc= poids/(Math.pow(taille,2));

        System.out.println("\n Votre imc est de :" + imc);

        if(imc<16.5)
        {
            System.out.println("Vous êtes trop maigre, consultez un medecin");
        }
        if(imc >= 16.5 && imc<18.5)
        {
            System.out.println("Vous êtes maigre, cherchez à prendre un peu de poids");
        }
        if(imc >= 18.5 && imc<25)
        {
            System.out.println("Vous avez une corpulence normale");
        }
        if(imc >= 25 && imc<30)
        {
            System.out.println("Vous êtes en surpoids");
        }
        if(imc >=30 && imc<35)
        {
            System.out.println("Vous avez une obésité modéré");
        }
        if(imc >35)
        {
            System.out.println("Vous avez êtes obèse");
        }
        System.out.println("\nVoulez-vous continuez (1: oui / 0: non)");
        rep = affiche.nextInt();
        
        }while(rep ==1);
              
    }
    
}
