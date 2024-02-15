package ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ejercicio7 {

    private static List<String> citas = new ArrayList<>();
    private static List<String> autores = new ArrayList<>();
    private static Random random = new Random();

    public static void main(String[] args) {
        inicializarBaseDeDatos();

        while (true) {
            generarCita();
            esperarSolicitudNuevaCita();
        }
    }

    private static void inicializarBaseDeDatos() {
        // Agregar citas y autores a la base de datos (puedes expandir esta lista según tus necesidades)
        citas.add("La perseverancia es el secreto del éxito.");
        autores.add("Autor Desconocido");

        citas.add("Haz hoy lo que otros no quieren, haz mañana lo que otros no pueden.");
        autores.add("Jerry Rice");

        citas.add("La vida es lo que pasa mientras estás ocupado haciendo otros planes.");
        autores.add("Allen Sanders");
    }

    private static void generarCita() {
        int indiceCitaAleatoria = random.nextInt(citas.size());
        String cita = citas.get(indiceCitaAleatoria);
        String autor = autores.get(indiceCitaAleatoria);

        System.out.println("Cita Inspiradora: \"" + cita + "\" - " + autor);
    }

    private static void esperarSolicitudNuevaCita() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Deseas obtener otra cita? (Sí/No): ");
        String respuesta = scanner.nextLine().toLowerCase();

        if (!respuesta.equals("si")) {
            System.out.println("¡Hasta luego!");
            System.exit(0);
        }
    }
}

