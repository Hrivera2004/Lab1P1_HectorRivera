package lab1p1_hectorrivera;

import java.util.Scanner;


public class Lab1P1_HectorRivera {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero=0;
        char character = 'a';
        double doble = 1.25;
        boolean VoF = true;
        System.out.println("Elija ejercicio: ");
        numero = scanner.nextInt();
        
        if (numero == 1){
            int num1= 15;
            int num2 = 30;
            int resultado;
            resultado = 15*30;
            
            System.out.print("resultado");
            System.out.println(resultado);
           
        }else if(numero == 2){
            System.out.println("Ingrese un numero: ");
            int numeroUsario1= scanner.nextInt();
            System.out.println("Ingrese un numero: ");
            int numeroUsario2= scanner.nextInt();
            System.out.println("Ingrese un numero: ");
            int numeroUsario3= scanner.nextInt();

            double promedio = (numeroUsario1 + numeroUsario2 + numeroUsario3)/3;
            System.out.println("Promedio: " + promedio);
        }else{
            System.out.println("Salio del programa.");
        }
    }
    
}
