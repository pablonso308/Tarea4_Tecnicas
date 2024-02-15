package ejercicio8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ejercicio8{

    private static Map<String, List<String>> citasPorContexto = new HashMap<>();
    private static Random random = new Random();

    public static void main(String[] args) {
        inicializarBaseDeDatos();

        String contexto = obtenerContextoUsuario();
        generarCitaConContexto(contexto);
    }

    private static void inicializarBaseDeDatos() {
        // Agregar citas y clasificarlas por contexto (puedes expandir esta lista según tus necesidades)
        List<String> citasMotivacionales = new ArrayList<>();
        citasMotivacionales.add("La perseverancia es la clave del éxito.");
        citasMotivacionales.add("El único modo de hacer un gran trabajo es amar lo que haces.");

        List<String> citasFelicidad = new ArrayList<>();
        citasFelicidad.add("La felicidad no es algo que pospones para el futuro; es algo que diseñas para el presente.");
        citasFelicidad.add("La verdadera felicidad es disfrutar el presente sin dependencia ansiosa del futuro.");

        citasPorContexto.put("motivacional", citasMotivacionales);
        citasPorContexto.put("felicidad", citasFelicidad);
    }

    private static String obtenerContextoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu estado de ánimo o contexto (motivacional, felicidad, etc.): ");
        return scanner.nextLine().toLowerCase();
    }

    private static void generarCitaConContexto(String contexto) {
        if (citasPorContexto.containsKey(contexto)) {
            List<String> citas = citasPorContexto.get(contexto);
            if (citas != null && !citas.isEmpty()) {
                int indiceCitaAleatoria = random.nextInt(citas.size());
                String cita = citas.get(indiceCitaAleatoria);
                System.out.println("Cita Inspiradora: \"" + cita + "\"");
            } else {
                System.out.println("No hay citas disponibles para el contexto proporcionado.");
            }
        } else {
            System.out.println("Contexto no reconocido. No hay citas disponibles.");
        }
    }
}

