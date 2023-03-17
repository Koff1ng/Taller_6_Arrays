import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] pruebas = new int[5];
        int total = 0;
        double promedio = 0;

        Scanner sc = new Scanner(System.in);
 
        System.out.println("Ingrese los resultados de las 5 pruebas (de 0 a 100):");
        for (int i = 0; i < pruebas.length; i++) {
            System.out.print("Prueba " + (i+1) + ": ");
            pruebas[i] = sc.nextInt();
        }

    
        for (int i = 0; i < pruebas.length; i++) {
            total += pruebas[i];
        }
       
        promedio = (double) total / pruebas.length;
        
        System.out.println("El promedio de las pruebas es: " + promedio);
    }
}
