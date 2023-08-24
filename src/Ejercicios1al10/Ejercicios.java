package Ejercicios1al10;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        //Ejercicio 1
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        int horas = input.nextInt();
        int costoXHora=40;
        int sueldo;
        if(horas<=40){
            sueldo=horas*costoXHora;

        }else if(horas>40 && horas<=48){
            sueldo=40*costoXHora+(horas-40)*2*costoXHora;
        }else {
            sueldo=40*costoXHora+8*2*costoXHora+(horas-48)*3*costoXHora;
        }
        System.out.println("El trabajador recibira: S/. "+sueldo);

        //Ejercicio 2
        /*Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la edad del invitado: ");
        int edad = input.nextInt();
        int regalo;

        if(edad<=15){
            System.out.println("El invitado si puede ingresar a la fiesta");
        }
        while( edad>15 ){
            System.out.println("Inserte 1 si el invitado trajo regalo; caso contrario, inserte 0: ");
            regalo =input.nextInt();
            if(regalo==1){
            System.out.println("El invitado si puede ingresar a la fiesta");
            break;
            } else if(regalo==0){
                System.out.println("El invitado no puede ingresar a la fiesta");
                break;
            } else {
                System.out.println("Solo puede ingresar 1 ó 0");
            }
        }*/

        //Ejercicio 3
        /*Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el consumo en litros de agua potable: ");
        float litros = input.nextFloat();
        float pagoRecibo;
        int pagoFijo=10;
        if(litros>=51 && litros<=200){

            pagoRecibo=pagoFijo+(litros-50)*0.5f;
        }else if(litros>200){
            pagoRecibo=pagoFijo+150*0.5f+(litros-200)*1.5f;
        }else{
            pagoRecibo=pagoFijo;
        }
        System.out.println("Su recibo es de: $"+pagoRecibo);*/

        //Ejercicio 4

        /*Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su numero: ");
        int n = input.nextInt();
        System.out.println("Los numero impares menores a "+n+" son: ");
        for (int i = 0; i < n; i++) {
            if(i%2!=0){
                System.out.println(i);
            }
        }*/

        //Ejercicio 5
        /*Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array: ");
        int n = input.nextInt();
        int[] array = new int[n];
         for (int i = 0; i < n; i++) {
            array[i]=(int)(Math.random()*100);
        }
        for(int i = 0; i < n; i++){
        System.out.println("El elemento "+i+" es: "+array[i]);
        }*/

        //Ejercicio 6
        /*Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor de n: ");
        int n = input.nextInt();
        String[] array = new String[n];
        for(int i=0;i<n;i++){
            array[i]="*";
        }
        for(int i=1; i<=n; i++){
            for(int j=0; j<i;j++){
            System.out.print(array[j]+" ");
            }
            System.out.println();
        }*/

        //Ejercicio7 (clase Factorial)

        //Ejercicio 8
        /*Scanner input =new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array: ");
        int n =input.nextInt();
        int[] array= new int[n];

        for (int i = 0; i < n; i++) {
            array[i]=(int)(Math.random()*100);
        }
        for(int i=0; i<n ; i++){
            System.out.print(array[i]+" ");
        } System.out.println();
        int mayorvalor=array[0];
        for (int i = 0; i < n; i++) {
            if(array[i]>mayorvalor){
                mayorvalor=array[i];
            }
        }
        System.out.println("El mayor valor del array es: "+mayorvalor);*/

        //Ejercicio 9
        /*Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=(int)(Math.random()*100);
        }
        System.out.println("El array es el siguiente: ");
        for(int i=0; i<n ; i++){
            System.out.print(array[i]+" ");
        } System.out.println();

        int[] array2 = new int[n];
        for (int j = 0; j < n; j++) {
            array2[n-j-1]=array[j];
        }
        System.out.println("El array invertido sera: ");
        for(int k=0; k<n ; k++){
            System.out.print(array2[k]+" ");
        }*/

        //Ejercicio10
        /*Scanner input = new Scanner(System.in);
        int m=(int)(Math.random()*100);
        System.out.println("Se ha generado un numero entre 1 y 100");
        System.out.println("Adivine y pruebe su suerte: ");
        int n= input.nextInt();
        int count=1;
        while(n!=m){
            if (n>m) {
                System.out.println("El numero es demasiado alto");
            }  else{
                System.out.println("El numero es demasiado bajo");
            }
            count++;
            System.out.println("Pruebe con otro numero: ");
            n = input.nextInt();
        }

            System.out.println("ADIVINASTE!!!");
            System.out.println("El numero es: "+m);
            System.out.println("Has realizado "+count+" intentos");*/





    }
}