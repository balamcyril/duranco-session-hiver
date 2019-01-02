/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto.money.converter.simple;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class CryptoMoneyConverterSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rep = 0;
        boolean test = true;
        String entrer;
        float montant;
        
          System.out.println("Bienvenue sur le programme de convertion\n");
          
          Scanner affiche = new Scanner(System.in);
          
              System.out.println("1: Conversion EUR Bitcoin");
              System.out.println("2: Conversion Bitcoin EUR"); 
              System.out.println("3: Conversion EUR Euthéurium");
              System.out.println("4: Conversion Euthéurium EUR "); 
              System.out.println("5: Conversion EUR Litecoin"); 
              System.out.println("6: Conversion Litecoin EUR"); 
              
              System.out.println("Veuillez choisir la convertion a effectuer");
              entrer = affiche.nextLine();
              
              rep= Integer.valueOf(entrer).intValue();
              
              
          switch(rep)
          {
              case 1:
                  System.out.println("Vous avez choisi la conversion EUR Bitcoin\n");
                  
                        System.out.println("Veuillez entrer le montant en EUR\n");
                        entrer = affiche.nextLine();
                        montant= Integer.valueOf(entrer).floatValue();
                  System.out.println(montant + " EUR = " + montant / 3784 +" Bitcoins\n");
                  break;
               case 2:
                  System.out.println("Vous avez choisi la conversion Bitcoin EUR");
                        System.out.println("Veuillez entrer le montant en Bitcoin\n");
                        entrer = affiche.nextLine();
                              montant= Integer.valueOf(entrer).floatValue();
                  System.out.println(montant + " Bitcoin = " + montant * 3784 +" EUR\n");
                  break;
               case 3:
                  System.out.println("Vous avez choisi la conversion EUR Euthéurium");
                        System.out.println("Veuillez entrer le montant en EUR\n");
                        entrer = affiche.nextLine();
                              montant= Integer.valueOf(entrer).floatValue();
                  System.out.println(montant + " EUR = " + montant / 234 +" Euthéurium\n");
                  break;
               case 4:
                  System.out.println("Vous avez choisi la conversion Euthéurium EUR");
                  test=true;
                        System.out.println("Veuillez entrer le montant en Euthéurium\n");
                        entrer = affiche.nextLine();
                              montant= Integer.valueOf(entrer).floatValue();
                  System.out.println(montant + " Euthéurium = " + montant * 234 +" EUR\n");
                  break;
               case 5:
                  System.out.println("Vous avez choisi la Conversion EUR Litecoin");
                        System.out.println("Veuillez entrer le montant en EUR\n");
                        entrer = affiche.nextLine();
                              montant= Integer.valueOf(entrer).floatValue();
                  System.out.println(montant + " EUR = " + montant / 134 +" Litecoin\n");
                  break;
               case 6:
                  System.out.println("Vous avez choisi la conversion Litecoin EUR");
                        System.out.println("Veuillez entrer le montant en Litecoin\n");
                        entrer = affiche.nextLine();
                              montant= Integer.valueOf(entrer).floatValue();
                  System.out.println(montant + " Litecoin = " + montant * 134 +" EUR\n");
                  break;
                   
          }
          
                  
        
    }
    
}
