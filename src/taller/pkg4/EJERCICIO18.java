/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg4;

import java.util.Scanner;

/**
 Realizar un algoritmo que calcule el salario a pagar de un empleado según los siguientes
parámetros:
A. Si gana menos de 700.000, descuento de pensión =-2%, descuento de salud =-4% y
más Aux. de transporte= +11%.
B. Si gana entre 741.000 y 999.999, descuento de pensión =-4%, descuento de salud =-
6% y más Aux. de transporte= +9%.
C. Si gana más 1.000.000 y menos 1.800.00, descuento por pensión es -6%, descuento de
seguro de vida 5%, descuento de salud =-6% y más Aux. de transporte= +9%.
D. Si gana más de 1.800.000 y menos de 2.500.00, descuento por pensión es -6%,
descuento de seguro de vida 5%, descuento de salud =-8% y más Aux. de transporte=
+8%.
E. Si gana más de 2.500.000, descuento por pensión es -8%, descuento de seguro de vida
6%, descuento de salud =-10% y más Aux. de transporte= +9%.
 */
public class EJERCICIO18 {

    /**
    DE= Salario
    DS= Salario a pagar del  empleado segun los parametros 
     */
    public static void main(String[] args) {

double Salario;
double DescuentoPensionA;
double DescuentoSaludA;
double AuxTransporteA;
double DescuentoPensionB;
double DescuentoSaludB;
double AuxTransporteB;
double DescuentoSeguroVidaC;
double DescuentoPensionC;
double DescuentoSaludC;
double AuxTransporteC;
double DescuentoSeguroVidaD;
double DescuentoPensionD;
double DescuentoSaludD;
double AuxTransporteD;
double DescuentoSeguroVidaE;
double DescuentoPensionE;
double DescuentoSaludE;
double AuxTransporteE;

 

        Scanner leer = new Scanner (System.in);
        System.out.println("Digite su salario");
         Salario = leer.nextFloat ();

DescuentoPensionA = Salario*0.02;
DescuentoSaludA = Salario*0.04;
AuxTransporteA = Salario*0.11;

DescuentoPensionB = Salario*0.04;
DescuentoSaludB = Salario*0.06;
AuxTransporteB = Salario*0.09;

DescuentoSeguroVidaC = Salario*0.05;
DescuentoPensionC = Salario*0.06;
DescuentoSaludC = Salario*0.06;
AuxTransporteC = Salario*0.09;

DescuentoSeguroVidaD = Salario*0.05;
DescuentoPensionD = Salario*0.06;
DescuentoSaludD = Salario*0.08;
AuxTransporteD = Salario*0.08;

DescuentoSeguroVidaE = Salario*0.06;
DescuentoPensionE = Salario*0.08;
DescuentoSaludE = Salario*0.10;
AuxTransporteE = Salario*0.09;


if (Salario<700000){
Salario= (Salario - DescuentoPensionA - DescuentoSaludA + AuxTransporteA);
}

if ((Salario>741000)||(Salario<999999)){
Salario= (Salario - DescuentoPensionB - DescuentoSaludB + AuxTransporteB);
}

if ((Salario>1000000)||(Salario<1800000)){
Salario= (Salario - DescuentoPensionC - DescuentoSaludC - DescuentoSeguroVidaC + AuxTransporteC);
}

if ((Salario>1800000)||(Salario<2500000)){
Salario= (Salario - DescuentoPensionD - DescuentoSaludD - DescuentoSeguroVidaD + AuxTransporteD);
}

if (Salario>2500000){
Salario= (Salario - DescuentoPensionE - DescuentoSaludE - DescuentoSeguroVidaE + AuxTransporteE);
}


System.out.println("su salario es:"+ Salario);



    }
    
}
