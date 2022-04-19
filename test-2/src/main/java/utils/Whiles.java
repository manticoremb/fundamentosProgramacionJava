package utils;

import java.util.Scanner;

public class Whiles {
    public static void programaWhileBasic(){

        Scanner sc = new Scanner(System.in);

        int i=0;
        while (i<=100){

            // LO QUE QUIERO QUE HAGA EL PROGRAMA
            System.out.println("TE AMO PACACON");

            i++;
        }










    }

    public static void programaWhileMult5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int numA = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        int numB = sc.nextInt();

        int i=numA;
        int cont = 0;
        while (i<=numB){
            if (i%5 == 0){
                cont++;
            }
            i++;
        }
        System.out.println("Los múltiplos de 5 son: "+cont);
    }

    public static void programaWhileAcumdadounrangodenum(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa primer número:");
        int numX =sc.nextInt();
        System.out.println("Ingresa segundo número:");
        int numY =sc.nextInt();
        int mult;

        do{
            System.out.println("Ingresa el múltiplo: ");
            mult = sc.nextInt();
        }while(mult == 0);


        int i=numX;
        int cont = 0;
        int contM = 0;
        while (i<=numY){
            cont=cont+i;
            if (i%mult == 0){
                contM++;
            }

            i++;
        }

        System.out.println("El acumulado del rango es: "+cont+" y la cantidad de múltiplos del número "+mult+" es: "+contM);
    }

    public static void programaMuestraMensaje1000veces(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el mensaje: ");
        String mensaje = sc.nextLine();

        int i=0;
        do{
            System.out.println(mensaje);
            i++;
        }while(i<100);

    }

    public static void programaDigitosNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número: ");
        int num = sc.nextInt();

        int numeroAdividir=num;
        int cont = 0;
        while(numeroAdividir>0){
            numeroAdividir = numeroAdividir / 10;
            cont++;
        }
        System.out.println("patacones contados: "+ num +" tiene "+ cont+ " digitos");

    }

    public static void programaDigitosParesNum(){
    Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar número: ");
        double num = sc.nextInt();
        double numCopy = num;
        int cont = 0;

    while (numCopy>0){
        double digito = numCopy % 10;
        if (digito%2 == 0){
            cont++;
        }
        numCopy = numCopy / 10;

    }
        System.out.println("El número "+num+" tiene "+cont+" dígitos pares");




    }

    public static void programaParCaremonda(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número, carita de verga: ");
        int num = sc.nextInt();

        while(num%2==0){
            System.out.println("Caremondá, es par");
            break;
        }


        do{
            System.out.println("Caremondá, es par");
            break;
        }while(num%2==0);
    }

}
