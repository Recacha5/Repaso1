/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso1;

import java.util.Scanner;

/**
 *
 * @author Alex Recacha
 */
public class Repaso1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean bandera = true;
        while (bandera){
            switch(Practica1.Menu()){
                
                case 1: if (Practica1.numeroPerfecto()) {
                            System.out.println("El numero es perfecto");
                        }else{
                            System.out.println("El número no es perfecto");
                        }
                        System.out.println("Pulsa enter para continuar...");
                        sc.nextLine();
                        break;
                case 2: if (Practica1.añoBisiesto()) {
                            System.out.println("El año es bisiesto");
                        }else{
                            System.out.println("El año no es bisiesto");
                        }
                    
                        System.out.println("Pulsa enter para continuar...");
                        sc.nextLine();
                        break;
                case 3: System.out.println("La fecha escrita es: " + Practica1.decodificarFecha());
                        System.out.println("Pulsa enter para continuar...");
                        sc.nextLine();
                        break;
                case 4: if (Practica1.numeroPrimo()) {
                            System.out.println("El numero es primo");
                        }else{
                            System.out.println("El numero no es primo");
                        }
                        System.out.println("Pulsa enter para continuar...");
                        sc.nextLine();
                        break;
                case 5: System.out.println(Practica1.numeroBinario());
                        System.out.println("Pulsa enter para continuar...");
                        sc.nextLine();
                        break;
                case 6: System.out.println("El numero mayor es: " + Practica1.numeroMayor());
                        System.out.println("Pulsa enter para continuar...");
                        sc.nextLine();
                        break;        
                case 7: bandera=false;
                        break;        
                default: break; 
            }
        }
    }    
}
