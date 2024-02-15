package ejercicio9;
import java.util.Stack;
import java.util.Scanner;

public class ejercicio9{

    public static boolean validarExpresion(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : expresion.toCharArray()) {
            if (caracter == '(' || caracter == '[' || caracter == '{') {
                pila.push(caracter);
            } else if (caracter == ')' || caracter == ']' || caracter == '}') {
                if (pila.isEmpty() || !esParBalanceado(pila.pop(), caracter)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    private static boolean esParBalanceado(char parIzquierdo, char parDerecho) {
        return (parIzquierdo == '(' && parDerecho == ')') ||
                (parIzquierdo == '[' && parDerecho == ']') ||
                (parIzquierdo == '{' && parDerecho == '}');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la expresión matemática: ");
        String expresion = scanner.nextLine();

        if (validarExpresion(expresion)) {
            System.out.println("La expresión es válida.");
        } else {
            System.out.println("La expresión no es válida.");
        }
    }
}
