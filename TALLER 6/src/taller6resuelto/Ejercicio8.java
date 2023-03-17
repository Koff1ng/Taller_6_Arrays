import java.util.Scanner;

public class Ejercicio8 {
    static Scanner sc = new Scanner(System.in);
    static int[] arregloA;
    static int[] arregloB;
    static int[] arregloC;
    static int tamano;

    public static void main(String[] args) {
        char opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("A. Ingresar arreglo A");
            System.out.println("B. Ingresar arreglo B");
            System.out.println("C. Mostrar A + B");
            System.out.println("D. Mostrar A - B");
            System.out.println("E. Mostrar A * B");
            System.out.println("F. Salir");

            opcion = sc.next().charAt(0);

            switch (opcion) {
                case 'A':
                    ingresarArregloA();
                    break;
                case 'B':
                    ingresarArregloB();
                    break;
                case 'C':
                    sumarArreglos();
                    mostrarArreglo(arregloC);
                    break;
                case 'D':
                    restarArreglos();
                    mostrarArreglo(arregloC);
                    break;
                case 'E':
                    multiplicarArreglos();
                    mostrarArreglo(arregloC);
                    break;
                case 'F':
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }

    public static void ingresarArregloA() {
        System.out.println("Ingrese el tamaño del arreglo:");
        tamano = sc.nextInt();
        arregloA = new int[tamano];

        System.out.println("Ingrese los elementos del arreglo A:");
        for (int i = 0; i < tamano; i++) {
            arregloA[i] = sc.nextInt();
        }
    }

    public static void ingresarArregloB() {
        System.out.println("Ingrese el tamaño del arreglo:");
        tamano = sc.nextInt();
        arregloB = new int[tamano];

        System.out.println("Ingrese los elementos del arreglo B:");
        for (int i = 0; i < tamano; i++) {
            arregloB[i] = sc.nextInt();
        }
    }

    public static void sumarArreglos() {
        arregloC = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            arregloC[i] = arregloA[i] + arregloB[i];
        }
    }

    public static void restarArreglos() {
        arregloC = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            arregloC[i] = arregloA[i] - arregloB[i];
        }
    }

    public static void multiplicarArreglos() {
        arregloC = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            arregloC[i] = arregloA[i] * arregloB[i];
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        System.out.println("Arreglo resultante:");
        for (int i = 0; i < tamano; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}

