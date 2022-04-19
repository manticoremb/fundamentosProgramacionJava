package utils;

import java.util.Scanner;

public class Fors {

    public static void programaCantNumParimpar() {
        //Inicio
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int x = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int y = sc.nextInt();

        int contx = 0;
        int conty = 0;
        for (int i = x; i <= y; i++) {
            //INICIA

            if (i % 2 == 0) {
                System.out.println("Soy par");
                contx++;
                System.out.println("Analizado");

            } else {
                conty++;

            }
            System.out.println("Analizaditoyio");
            //TERMINA
        }


        System.out.println("La cantidad de número pares es: " + contx + " y de los impares es: " + conty);


        //Final
    }

    public static void programaCantMultImpar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer número");
        int x = sc.nextInt();
        System.out.println("Ingrese segundo número");
        int y = sc.nextInt();
        int cont = 1;

        for (int i = x; i <= y; i++) {
            if (i % 2 != 0) {
                cont *= i;

            }

        }
        System.out.println("El resultado es: " + cont);
    }

    public static void programa4Contadores() {
        //INICIO
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int x = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int y = sc.nextInt();
        int contPar = 0;
        int contImpar = 0;
        int contNegativo = 0;
        int contPositivo = 0;

        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            if (i >= 0) {
                contPositivo++;
            } else {
                contNegativo++;
            }
        }
        System.out.println("Los números pares son: \t" + contPar + "\n los impares: " + contImpar + "\n los negativos: " + contNegativo + " los positivos: " + contPositivo);

    }

    public static void programaSerie(){
        int cont = 0;
        for (int i = 1; i <= 100; i++) {
            int serie = i / i + 1;
            cont = cont + serie;
        }
        System.out.println("La suma de esta serie de números es: " + cont);
    }

    public static void programaMensaje() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Ingresa el número de veces que quieres ver tu mensaje");
        int x = sc.nextInt();


        for (int i = 1; i <= x; i++) {
            System.out.println(mensaje + " número: " + i);

        }
    }

    public static void programaNumerosAmiguitos(){
        Scanner sc = new Scanner(System.in);

        //Obteniendo los datos
        //Obteniendo dos numeros
        System.out.println("Ingresa el primer número");
        int x = sc.nextInt();
        System.out.println("Ingresa el segundo número");
        int y = sc.nextInt();

        // sumaX = Acumulado de divisores NUMERO 1
        int sumaX = 0;
        for (int i=1; i<=x-1; i++){
            //Valido que el numero iterado sea divisor de mi numero 1
            if( x%i == 0 ){
                sumaX+=i;
            }
        }
        // sumaY = acumulado de divisores del Numero 2
        int sumaY = 0;
        for (int i=1; i<=y-1; i++){
            // Valido que el numero que esta siendo recorrido sea divisor de mi numero 2
            if( y%i == 0 ){
                // acumulo los numeros divisores
                sumaY+=i;
            }
        }

        // valido que el resultado DE SumaY y SumaX sean iguales para que se cumpla la condicion
        // que sean numeros amiguitos
        if(x==sumaY && y==sumaX){
            System.out.println("Son amiguitos");
        }else{
            System.out.println("no son amiguitos:c");
        }


        //mostrando los valores del numero y el acumulado de su numero amigo y viceversa
        System.out.println("el valor de x " +x + "sumay "+ sumaY);
        System.out.println("el valor de y " +y + "sumaX "+ sumaX);

    }

    public static Boolean programaValidaSisonNumerosAmigos(){

        Scanner sc = new Scanner(System.in);

        Boolean sonAmigos = false;

        //Obteniendo los datos
        //Obteniendo dos numeros
        System.out.println("Ingresa el primer número");
        int x = sc.nextInt();
        System.out.println("Ingresa el segundo número");
        int y = sc.nextInt();

        // sumaX = Acumulado de divisores NUMERO 1
        int sumaX = 0;
        for (int i=1; i<=x-1; i++){
            //Valido que el numero iterado sea divisor de mi numero 1
            if( x%i == 0 ){
                sumaX+=i;
            }
        }
        // sumaY = acumulado de divisores del Numero 2
        int sumaY = 0;
        for (int i=1; i<=y-1; i++){
            // Valido que el numero que esta siendo recorrido sea divisor de mi numero 2
            if( y%i == 0 ){
                // acumulo los numeros divisores
                sumaY+=i;
            }
        }

        // valido que el resultado DE SumaY y SumaX sean iguales para que se cumpla la condicion
        // que sean numeros amiguitos
        if(x==sumaY && y==sumaX){
            sonAmigos = true;
            return sonAmigos;
        }

        return sonAmigos;


    }

    public static void programaSerie2() {
        // serie = 1+N/2+N
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int b = sc.nextInt();
        int cont = 0;

        for (int i = a; i <= b; i++) {
            int serie = 1 + i / 2 + i;
            cont = cont + serie;
        }
        System.out.println("El resultado de la serie es: " + cont);
    }

    public static void programaMultiplo5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer número");
        int a = sc.nextInt();
        System.out.println("Ingresa el segundo número");
        int b = sc.nextInt();
        int cont = 0;


    for (int i=a;  i<=b; i++){
            if (i%5 == 0){
                cont=cont+i;
            }


        }
        System.out.println("El resultado de la suma de los múltiplos es: "+cont);
    }

    public static void programaCualquierMultiplo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer número:");
        int a = sc.nextInt();
        System.out.println("Ingresa el segundo número:");
        int b = sc.nextInt();
        System.out.println("Ingresa el múltiplo:");
        int mult = sc.nextInt();
        int cont = 0;

        for (int i=a; i<=b; i++){
            if (i%mult == 0){
               cont++;
            }
        }
        System.out.println("Los cantidad de múltiplos de "+mult+ " es "+cont);
    }

    public static void programaFactorial(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el número:");
        int x = sc.nextInt();

        int cont = 1;
        for (int i=x; i>=1; i--){
            cont=cont*i;
        }
        System.out.println("El factorial de "+x+" es: "+cont);
    }

    public static Integer calculaFactorial(int x){
        int cont = 1;
        for (int i=x; i>=1; i--){
            cont=cont*i;
        }
        return cont;
    }

    public static void programaCalculaAcumMult(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        int x = sc.nextInt();
        System.out.println("Ingresa el segundo número:");
        int y = sc.nextInt();

        int contSuma = 0;
        int contMult = 0;
        for (int i=x; i<=y; i++){
            contSuma=contSuma+i;
            if (i%5 == 0){
                contMult++;
            }
        }
        System.out.println("La sumatoria del rango que ingresaste es: "+contSuma+ " y los múltiplos de 5 dentro de ese rango son: "+contMult);
    }

    public static void programaTablaMult(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el número:");
        int x = sc.nextInt();

        int cont = 1;
        for (int i=1; i<=9; i++){
            cont=i*x;
            System.out.println(x+ "*" +i+ "="+cont);
        }
        System.out.println(cont);


    }

    public static void conceptoArreglo(){
        //Como declarar un array?
        //1, tipo de datos
        //2. nombre de la variable
        //3. []
        //. = new Tipo de datos[ tamaño del array]
        int locker[] = new int[20]; // esto es una array, este es un array al que solo se le indico su tamaño
        //  y posteriormente se le asignaron sus valores
        locker[1] = 20;
        locker[2] = 22;
        System.out.println("Locker1 en la posicion 1 "+locker[1]);
        System.out.println(locker[6]);


        int[] locker2 = {1,2,3,4,5,6,7,8,9}; // este es un array creado directo, tiene sus valores asignados
        locker2[0] = 0;
        System.out.println("locker 2 "+locker2[0]);

        //declarar un array de 10 numeros
        Scanner sc = new Scanner(System.in);
        System.out.println("Señorito usuario, digame cuantos numeros quiere guardar por favor!!");
        int numero = sc.nextInt();

        int[] arrayNumeros = new int[numero];
        int tamanoArray = arrayNumeros.length; // esto me dice el tamaño de mi array, cuantas ubicaciones tiene

        //llenar mi array
        for(int i=0; i<numero;i++){
            System.out.print(i+" Numero a rellenar: ");
            arrayNumeros[i] = sc.nextInt();
        }

        //imprimir mi array
        for(int i=0; i<arrayNumeros.length; i++){
            System.out.println("El valor de mi array en la posicion"+i);
            System.out.println(arrayNumeros[i]);
        }


    }

    public static void usuarioLlenaArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es el tamaño de tu array?");
        //Ingreso el tamaño de mi array
        int numero = sc.nextInt();

        //Creo mi array
        int[] arrayTH = new int[numero];

        for (int i=0; i<numero; i++) {
            System.out.println("Señor, ingrese por favior, el valor en la posición "+i);
            arrayTH[i] = sc.nextInt();
        }
    }

    /*
    programa que calcula la edad de una persona y patillas
     */
    public static void programaEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese edad, porfavior!");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("¡Bienvenidooo!");
        } else if (edad < 18) {
            System.out.println("Vaya a su casa a ver pocoyo");
            if (edad >= 6 && edad <= 8) {
                System.out.println("Eres menor");
            } else if (edad == 0) {
                //Inicio
                System.out.println(":(");
                //
            }
        }
    }

    public static void programaSuma() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String name = sc.nextLine();
        System.out.println("Ingrese primer número");
        int x = sc.nextInt();
        System.out.println("Ingrese segundo número");
        int y = sc.nextInt();
        int suma = x + y;
        System.out.println("Señor " + name + " la suma es " + suma);
    }

    public static void programaPromedio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la primera calificación");
        double x = sc.nextDouble();
        System.out.println("Ingresa la segunda calificación");
        double y = sc.nextDouble();
        double promedio = (x + y) / 2;
        if (promedio >= 3) {
            System.out.println("¡Eres un ganador!");
        } else {
            System.out.println("perdiste");
        }
        System.out.println("Tu nota es " + promedio);
    }

    public static void programaImprimeAniosCumplidos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la edad");
        int edad = sc.nextInt();

        for (int i = 1; i <= edad; i++) {
            System.out.println("Cumpliste: " + i + " año(s)");
        }

    }

    public static void programaNumerosPares() {
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i <= 100; i += 2) {
            System.out.println("Los números pares del 0 al 100 son: " + i);
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Los números pares del 1 al 100 son: " + i);
            }

        }
    }

    public static void programRangoNumPar() {
        /*
        Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa primer número");
        int x = sc.nextInt();
        System.out.println("Ingresa segundo número");
        int y = sc.nextInt();

        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.println("Los números pares son: " + i);
            }
        }
    }

    public static void programaContMultCinco() {

        // Escribir un programa que imprima la cantidad numeros multiplos de 5, del 0 al 100.
        int cont = 0;
        for (int i = 0; i <= 100; i += 5)
            cont++;

        System.out.println(cont);

    }

    public static void programaMultiplosde5() {
        //Escribir un programa que imprima la cantidad de numeros multiplos de 5, del 1 al 100.
        int cont = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                cont++;
            }
        }
        System.out.println("Los cantidad de números son: " + cont);
    }

    public static void programaParImparPositivoNegativo(){
               /* Ejercicio 9. Diseñar un programa que dado un rango de numeros por el usuario, mostrar en pantalla:
        Si el numero es positivo, "positivo"
        Si el numero es negativo, "negativo",
                Si el numero es par, "par",
                Si el numero es impar, "impar",
                Justo antes de acabar el for mostrar en pantalla "finaliza iteracion".
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String name = sc.nextLine();
        System.out.println("Ingrese el primer número:");
        int x = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        int y = sc.nextInt();

        for (int i = x; i <= y; i++) {
            //inicio
            if (i >= 0) {
                System.out.println("Señor(a) " +name + " el número "+i +" es positivo");
            } else if (i < 0) {
                System.out.println("Señor(a) " +name + " el número "+i +" es negativo");
            }

            if (i % 2 == 0) {
                System.out.println("Señor(a) " +name + " el número "+i +" es par");
            } else if (i % 2 != 0) {
                System.out.println("Señor(a) " +name + " el número "+i +" es impar");
            }

            System.out.println("Señor(a) " +name + " finaliza iteración");


            //final
        }
    }

    public static void programaNumerosAmigos(){
        /*
        Dado dos numeros, diga si son amigos o no. Dos numeros son amigos si la suma de los DIVISORES de uno de ellos es igual al otro y viceversa. (Sin contarse a si mismo como divisor)
        Los numeros son amigos,
        Ejemplo: 220 y 284 son amigos:
        Divisores de 220 = 1 + 2 + 3 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
        Divisores de 284 = 1 + 2 + 4 + 71 + 142 = 220

       La suma de los modulos del numero que su valor sea cero..

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese x");
        int n1 = sc.nextInt();
        System.out.println("Ingrese y");
        int n2 = sc.nextInt();

        int suma1 = 0;
        for(int i = 1; i <= n1-1;  i++){
            if(n1 % i == 0){
                suma1+=i;

            }

        }

        int suma2 = 0;
        for(int i = 1; i <= n2-1;  i++){
            if(n2 % i == 0){
                suma2+=i;
            }

        }

        System.out.println("N1 = "+n1+ "SUMA 2 " + suma2);
        System.out.println("N2 = "+n2+ "SUMA 1 " + suma1);
        if(n1 == suma2 && n2 == suma1){
            System.out.println("son amigos");
        }else {
            System.out.println("no son amiguitos :(");
        }
    }



}
