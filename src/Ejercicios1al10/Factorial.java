package Ejercicios1al10;

import java.util.Scanner;

public class Factorial {
    public  static void main(String[] args) {
        resolverFactorial();

        
    }
    static void resolverFactorial(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor del factorial que desea calcular: ");
        int n = input.nextInt();
        int m=1;
        for(int i=0;i<n;i++){
            m=m*(n-i);
        }
        System.out.println("El resultado es: "+m);

    }

}
