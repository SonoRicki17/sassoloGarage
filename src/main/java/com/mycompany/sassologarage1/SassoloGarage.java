package com.mycompany.sassologarage1;

import java.util.Scanner;

public class SassoloGarage {

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("            ********************");
        System.out.println("            ***SASSOLO GARAGE***");
        System.out.println("            ********************");
        
        Scanner input = new Scanner(System.in);
        int scelta;
        
        System.out.println("Opzioni");
        System.out.println("\n0 - Uscita");
        System.out.println("1 - Immissione del veicolo");
        System.out.println("2 - Emissione del veicolo");
        System.out.println("3 - Visualizzazione dei posti nel garage");
        System.out.println("4 - Visualizza le entrate e le uscite medie");
        System.out.println("5 - ");
        
        System.out.print("\nScegli l'opzione: ");
        scelta = Integer.parseInt(input.nextLine());
        
        switch (scelta) {
            
            case 0 -> {
                System.out.println("Sto uscendo...");
                Thread.sleep(5000);
                System.exit(0);
            }
            
            case 1 -> {
                
            }
            
        }
        
        input.close();
    }
    
}