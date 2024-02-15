package ejercicio11;
import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        String tipo = obtenerTipoPatron();
        int tamaño = obtenerTamaño();
        char caracter = obtenerCaracter();

        generarPatronASCII(tipo, tamaño, caracter);
    }

    private static String obtenerTipoPatron() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de patrón (rectángulo, triángulo, rombo): ");
        return scanner.nextLine().toLowerCase();
    }

    private static int obtenerTamaño() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del patrón: ");
        return scanner.nextInt();
    }

    private static char obtenerCaracter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el carácter para el patrón: ");
        return scanner.next().charAt(0);
    }

    private static void generarPatronASCII(String tipo, int tamaño, char caracter) {
        switch (tipo) {
            case "rectangulo":
                dibujarRectangulo(tamaño, tamaño, caracter);
                break;
            case "triangulo":
                dibujarTriangulo(tamaño, caracter);
                break;
            case "rombo":
                dibujarRombo(tamaño, caracter);
                break;
            default:
                System.out.println("Tipo de patrón no reconocido.");
        }
    }

    private static void dibujarRectangulo(int filas, int columnas, char caracter) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    private static void dibujarTriangulo(int altura, char caracter) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    private static void dibujarRombo(int tamaño, char caracter) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = tamaño - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(caracter);
                if (k < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = tamaño - 2; i >= 0; i--) {
            for (int j = 0; j <= tamaño - i - 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(caracter);
                if (k < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
