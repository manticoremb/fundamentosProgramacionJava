package utils;

import java.util.Scanner;

public class Arrays {
    public static void programaCreandoArrays(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el tamaño de tu array ");
        int sizeArray = sc.nextInt();
        //así creo un array dado un tamaño
        double calificaciones[] = new double[sizeArray];
        //
    }

    public static void programaRellenarArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el tamaño de tu array ");
        int sizeArray = sc.nextInt();
        //así creo un array dado un tamaño
        double calificaciones[] = new double[sizeArray];


        for (int i=0; i<sizeArray; i++){
            System.out.print("Ingresa en el contenedor: "+i+" la calificación: ");
            double calificacion = sc.nextDouble();
            calificaciones[i] = calificacion;
        }

    }

    public static void programaMostrarArrayEnPantalla(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el tamaño de tu arraay ");
        // crear array
        int sizeArray = sc.nextInt();
        //así creo un array dado un tamaño
        double calificaciones[] = new double[sizeArray];


        for (int i=0; i<sizeArray; i++){
            System.out.print("Ingresa en el contenedor: "+i+" la calificación: ");
            double calificacion = sc.nextDouble();
            calificaciones[i] = calificacion;
        }
        for (int i=0; i<sizeArray; i++){
            System.out.println("En la posición "+i+ " la calificación es: "+calificaciones[i]);
        }

    }





}
