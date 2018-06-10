package com.company;
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Preguntamos al usuario el tamaño del array

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingresar tamaño de arreglo: ");
        int n = lector.nextInt();
        int array[] = new int[n];

        for (int i=0; i<n; i++){
            array[i]=(int)(Math.random()*20+1);

        //Compruebo con un System.out los valores que se introducen en cada posición aleatoriamente

            System.out.println("Posición de arreglo "+i+" > " +array[i]);
        }
//Generamos un contador de tiempo (iniciando) para ver la eficiencia del código bubble sort

        long startTime = System.nanoTime();

        //Creamos un bubble sort para arreglar el array

        int aux = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }

//Generamos un contador de tiempo (finalizando) para ver la eficiencia del código bubble sort

        long endTime = System.nanoTime();

        long deltaTime = endTime - startTime;

        System.out.println("");
        System.out.println("Array listo: ");
        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");

        }
        System.out.println("");
        System.out.println("Tiempo en nano segundos de bubble sort para " +n+ " elementos: " +deltaTime);
    }
}


















