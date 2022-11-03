/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._tarea_clase17_29oct;

import java.util.Scanner;

/**
 *
 * @author joelm
 */
public class App {

    public static void main(String[] args) {
        
        
        //Declaración de variables dentro de el Algoritmo Principal
        int operacion = 0;
        float numeroUno = 0.0f;
        float numeroDos = 0.0f;
        float resultado_ret = 0.0f;
        String respuesta;
        
        respuesta = "s";

        while (respuesta.toLowerCase().equals("s")) {

            Scanner scan = new Scanner(System.in);

            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            System.out.print("Ingrese la operación que desea realizar: ");
            
            operacion = scan.nextInt();
            
            System.out.print("Ingrese el primer número: ");
            numeroUno = scan.nextFloat();

            System.out.print("Ingrese el segundo número: ");
            numeroDos = scan.nextFloat();
            

            switch (operacion) {
                case 1:
                    resultado_ret = suma(numeroUno, numeroDos);
                        break;
                case 2: 
                    resultado_ret = resta(numeroUno, numeroDos);
                        break;
                case 3: //resultado = operandoUno * operandoDos;
                    resultado_ret = multi(numeroUno, numeroDos);
                        break;
                case 4: //resultado = operandoUno / operandoDos;
                    resultado_ret = division(numeroUno, numeroDos);
                        break;
                default:System.out.println("Opción ingresada no es válida."); 
                        break;
            }
            
            System.out.println("El resultado de la operación es: " + resultado_ret);
            
            System.out.print("Desea realizar otra operacion? (s/n) ");
            respuesta = scan.next();
        }
    }
    
    // Agregar nuevos métodos aquí
    //Con "suma(float operandoUno, float operandoDos)" indicamos a Java que nuestros datos vienen desde afuera
    //Java nos solicita indicar que tipo de datos van a ser nuestras entradas o mejor llamadas "parámetros" 
    //se sustituye "void" que significa que el subAlgoritmo no retorna nada, por lo cual al hacer un return se 
    //debe de indicar el tipo de dato de nuestro retornador "float suma(float operandoUno, float operandoDos )"
    public static float suma(float operandoUno, float operandoDos ) {
        float resultado;
        
        resultado = operandoUno + operandoDos;
       //Se realizan las instrucciones que competen al subAlgoritmo y retorma el valor contenido dentro de 
       //la variable "resultado", ahora ya no lo muestra, si no que lo retorna
       //El impacto en el algoritmo principal, es que captura el valor retornado por "resultado"
        return  resultado;
        //return rompe el flujo del método y automáticamente el código escrito después de este jamás se 
        //ejecutará
        
    }
    //Resta
    public static float resta(float operandoUno, float operandoDos ) {
        float resultado;
        
        resultado = operandoUno - operandoDos;
       
        return  resultado; 
    }
    
    
    //Multiplicación
    public static float multi(float operandoUno, float operandoDos ) {
        float resultado;
        
        resultado = operandoUno * operandoDos;
       
        return  resultado; 
    }
    
    //division
    public static float division(float operandoUno, float operandoDos ) {
        float resultado;
        
        resultado = operandoUno / operandoDos;
       
        return  resultado; 
    }
    }

