/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto.money.converter.function;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class CryptoMoneyConverterFunction {

    
    public static float getMontant(String money){
     float montant;
     String entrer;
     boolean test;
     Scanner affiche = new Scanner(System.in);
                  do
                  {
                        System.out.println("Veuillez entrer le montant en "+ money +"\n");
                        entrer = affiche.nextLine();
                        try
                          {
                              montant= Integer.valueOf(entrer).floatValue();
                          }
                          catch(NumberFormatException e)
                          {
                              montant= -1;
                          }
                        if(montant >= 0)
                        {
                            test=false;
                            
                        }
                        else
                        {
                            System.out.println("\nLe montant est incorrest, veuillez réessayer!");
                            test=true;
                        }
                  }while(test);
        return montant;   
    }
    public static void main(String[] args) {
        int rep = 0;
        boolean test = true;
        String entrer;
        float montant;
        do{
          System.out.println("Bienvenue sur le programme de convertion\n");
          
          Scanner affiche = new Scanner(System.in);
              
          do
          {
              System.out.println("1: Conversion EUR Bitcoin");
              System.out.println("2: Conversion Bitcoin EUR"); 
              System.out.println("3: Conversion EUR Euthéurium");
              System.out.println("4: Conversion Euthéurium EUR "); 
              System.out.println("5: Conversion EUR Litecoin"); 
              System.out.println("6: Conversion Litecoin EUR"); 
              System.out.println("0: Pour quitter\n");
              System.out.println("Veuillez choisir la convertion a effectuer");
              entrer = affiche.nextLine();
              try
              {
                  rep= Integer.valueOf(entrer).intValue();
              }
              catch(NumberFormatException e)
              {
                  rep= -1;
              }
              
              if(rep >= 0 && rep <=6)
                  {
                      rep= Integer.valueOf(entrer).intValue();
                      test=false;
                      if(rep == 0)
                      {
                          System.out.println("Merci d'avoir utiliser notre application");
                          System.exit(1);
                      }
                  }
               else
                  {
                      System.out.println("Nous n'avons pas compris votre choix, veuillez reessayer!\n");
                      test=true;
                      
                      
                  }
          }while(test);
          switch(rep)
          {
              case 0:
                  System.out.println("Merci d'avoir utiliser notre application");
                  break;
              case 1:
                  System.out.println("Vous avez choisi la conversion EUR Bitcoin\n");
                  
                  montant= getMontant("EUR");
                  System.out.println(montant + " EUR = " + montant / 3784 +" Bitcoins\n");
                  break;
               case 2:
                  System.out.println("Vous avez choisi la conversion Bitcoin EUR");
                  montant= getMontant("Bitcoin");
                  System.out.println(montant + " Bitcoin = " + montant * 3784 +" EUR\n");
                  break;
               case 3:
                  System.out.println("Vous avez choisi la conversion EUR Euthéurium");
                  montant= getMontant("EUR");
                  System.out.println(montant + " EUR = " + montant / 234 +" Euthéurium\n");
                  break;
               case 4:
                  System.out.println("Vous avez choisi la conversion Euthéurium EUR");
                  montant= getMontant("Euthérium");
                  System.out.println(montant + " Euthéurium = " + montant * 234 +" EUR\n");
                  break;
               case 5:
                  System.out.println("Vous avez choisi la Conversion EUR Litecoin");
                  montant= getMontant("EUR");
                  System.out.println(montant + " EUR = " + montant / 134 +" Litecoin\n");
                  break;
               case 6:
                  System.out.println("Vous avez choisi la conversion Litecoin EUR");
                  montant= getMontant("Litecoin");
                  System.out.println(montant + " Litecoin = " + montant * 134 +" EUR\n");
                  break;
                   
          }
          
                  test=true;
                  do
                  {
                      System.out.println("Souhaitez-vous effectuer une autre conversion ? O(Oui)/N(Non)");
                      entrer = affiche.nextLine();
                      if(entrer.charAt(0)== 'O')
                        {
                            System.out.println("on continu");
                            rep=3;
                            test=false;
                        }
                      else if(entrer.charAt(0)== 'N')
                        {
                            System.out.println("Merci d'avoir utiliser notre application");
                            rep=0;
                            test=false;
                        }
                      else
                      {
                          System.out.println("\n Nous n'avons pas compris votre choix, veuillez reessayer!");
                           test=true; 
                      }
                      
                  }while(test);
                  
                  
                  
                       
        }while(rep > 1);
    }
    
}
