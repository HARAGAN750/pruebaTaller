/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg4;

import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class TALLER4 {

    /**
    EJERCICIO 15 
    Realizar un programaque calcule el valor a pagar por 
    algunos galones de gasolina si sabemos que cada litro de gasolina vale 
    9.500.Imprimir la cantidad de galones, precio por galón, cantidad de litros 
    y precio a pagar.

 DS= cantidad de galones, precio por galón, cantidad de litros y precio a pagar
 DE= cantidad de galones
     */
    public static void main(String[] args) {
        
int CantGalones;
double PrecioxGalones;
double CantLitros;
double precioxPagar;

        Scanner leer = new Scanner (System.in);
        System.out.println("Digite la cantidad de galones");
         CantGalones = leer.nextInt ();

PrecioxGalones = 3.7 * 9500;
CantLitros = CantGalones * 3.7;
 precioxPagar =  CantGalones*35150;



System.out.println("La cantidad de galones es: "+ CantGalones);        
System.out.println("El precio por galón es: "+ PrecioxGalones);
System.out.println("La cantidad de litros es: "+ CantLitros);
System.out.println("El precio a pagar es: "+ precioxPagar);
        System.out.println("");








    }
    
}
