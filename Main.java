/*
INGRESAR 2 NUMEROS POR CONSOLA Y MOSTRAR LAS OPERACIONES BASICAS(SUMA,RESTA..)
*/
package com.utp.Ejercicio01;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
      //Llamado a la clase Scanner, permite trabajar con el teclado
      Scanner teclado = new Scanner(System.in);
      //Solicitar al usuario que ingrese dos numeros
      System.out.println("Ingrese el primer numero");
      int num1 = teclado.nextInt();
      System.out.println("Ingrese el segundo numero");
      int num2 = teclado.nextInt();  
      //Mostrar al usuario el reasultado de las operaciones basicas
      System.out.println("La suma es: "+(num1+num2));
      System.out.println("La resta es: "+(num1-num2));
      System.out.println("La multiplicacion es: "+(num1*num2));
      System.out.println("La division        es: "+(num1/num2));
     
      
    }
    
}
