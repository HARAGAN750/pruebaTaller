/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg4;

import java.util.Scanner;

/**
Dada las horas trabajadas por un empleado determinar cuánto gana semanalmente y
mensualmente, si el trabajador debe trabajar mínimo 38h semanales y un máximo de 56h.
Se debe pedir la cantidad de horas trabajadas y verificar que esté dentro del rango
permitido, también se debe pedir el precio de la hora. Imprimir la cantidad de horas
trabajadas y el pago

DS= Cantidad de horas trabajadas y el pago´por hora
DE= Cantidad de horas trabajadas
 */
public class EJERCICIO16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int HorasTrabajadas;
int PagoXhora;
int PagoMensual;
int Pagosemanal;

        Scanner leer = new Scanner (System.in);
        System.out.println("Digite la cantidad de horas trabajadas semanalmente");
         HorasTrabajadas = leer.nextInt ();
        System.out.println("Digite su pago por hora trabajada");
         PagoXhora = leer.nextInt ();

    

if (HorasTrabajadas<38){
System.out.println(" no esta dentro del rango de horas ");
}
if (HorasTrabajadas>56){
System.out.println("no esta dentro del rango de horas ");
}

Pagosemanal = HorasTrabajadas*PagoXhora;
PagoMensual = Pagosemanal*4;

System.out.println("su pago mensual es de: "+ Pagosemanal);
System.out.println("su pago mensual es de: "+ PagoMensual);

    }
    
}