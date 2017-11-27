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
public class Practica1 {
    
    public static int Menu(){
        Scanner leer = new Scanner (System.in);
        int opcion=0;
        
        System.out.println("**************Menú**************");
        System.out.println("Opción 1: Número perfecto.");
        System.out.println("Opción 2: Año bisiesto.");
        System.out.println("Opción 3: Decodificar fecha.");
        System.out.println("Opción 4: Número primo.");
        System.out.println("Opción 5: Conversión a binario.");
        System.out.println("Opción 6: Cifra de mayor valor.");
        System.out.println("Opción 7: Salir.");
        System.out.println("**************Menú**************");
        
        System.out.println("Elige una opción");
        opcion = leer.nextInt();
        
        return opcion;
    }
    
    public static boolean numeroPerfecto (){
        Scanner leer = new Scanner (System.in);
        int numero;
        int resultado = 0;
        System.out.println("Dime un numero entero positivo");
        numero = leer.nextInt();
        
        for (int i = 1; i < numero; i++) {
            if (numero%i == 0){
                resultado += i;
            }
        }
        if (numero == resultado) {
            return true;
        }else{
            return false;
        }
        
    }
    
    public static boolean añoBisiesto(){
        Scanner leer = new Scanner (System.in);
        int anyo;
        System.out.println("Dime un año");
        anyo = leer.nextInt();
        
        if (anyo%4 == 0 && !(anyo%100 == 0 || anyo%400 == 0)) {
            return true;
        }else{
            return false;
        }
    }
    
    public static String decodificarFecha(){
        Scanner leer = new Scanner (System.in);
        String fecha;
        String resultado="";
        String vFecha[] = new String[3];
        System.out.println("Dime una fecha con formato de 8 cifras [aaaammdd]");
        fecha = leer.nextLine().trim();
        
        for (int i = 0; i < vFecha.length; i++) {
            vFecha[i]="";
        }
        
        for (int i = 0; i < 4; i++) {
            vFecha[0] += fecha.substring(i,i+1);
        }
        for (int i = 4; i < 6; i++) {
            vFecha[1] += fecha.substring(i,i+1);
        }
        for (int i = 6; i < 8; i++) {
            vFecha[2] += fecha.substring(i,i+1);
        }
        resultado = vFecha[2] + "/" + vFecha[1] + "/" + vFecha[0];
        return resultado;
    }
    public static boolean numeroPrimo (){
        Scanner leer = new Scanner (System.in);
        int numero;
        int resultado = 0;
        System.out.println("Dime un numero entero");
        numero = leer.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            if (numero%i == 0){
                resultado++;
            }
        }
        if (resultado == 2) {
            return true;
        }else{
            return false;
        }
    }
    
    public static String numeroBinario(){
        
        Scanner leer = new Scanner (System.in);
        int numero;
        String resultado="";
        String resultado2="";
        System.out.println("Dime un numero entero de base decimal");
        numero = leer.nextInt();
        
        while (!(numero==1 || numero==0)){
            resultado += Integer.toString(numero%2);
            numero = numero/2;
        }
        resultado += numero;
        for (int i = resultado.length(); i > 0; i--) {
            resultado2 += resultado.substring(i-1, i);
        }
        return resultado2;
    }
    public static int numeroMayor(){
        
        Scanner leer = new Scanner (System.in);
        String numero;
        int resultado=0;
        System.out.println("Dime un numero entero");
        numero = leer.nextLine();
        String vNumeros[] = numero.split("");
        
        for (String a:vNumeros) {
            if (Integer.valueOf(a)>resultado) {
                resultado = Integer.valueOf(a);
            }
        }
        return resultado;
    }
}
