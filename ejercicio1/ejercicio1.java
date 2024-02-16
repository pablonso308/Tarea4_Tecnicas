package ejercicio1;
import java.util.Arrays;
import java.util.List;

public class ejercicio1 {

    public static void main(String[] args) {
        List<String> comentarios = Arrays.asList(
                "Es un buen producto",
                "No me gustó el producto",
                "Producto estándar",
                "Increíble",
                "Decepcionado"
        );

        analizarComentarios(comentarios);
    }

    public static void analizarComentarios(List<String> comentarios) {
        for (String comentario : comentarios) {
            String sentimiento = determinarSentimiento(comentario);
            System.out.println("Comentario: \"" + comentario + "\" - Sentimiento: " + sentimiento);
        }
    }


    public static String determinarSentimiento(String comentario) {

        if (contienePalabraClave(comentario, "bueno", "increíble", "impresionante", "flipante")) {
            return "Positivo";
        } else if (contienePalabraClave(comentario, "no", "peor", "decepcionado")) {
            return "Negativo";
        } else {
            return "Neutral";
        }
    }


    private static boolean contienePalabraClave(String comentario, String... palabrasClave) {
        for (String palabraClave : palabrasClave) {
            if (comentario.toLowerCase().contains(palabraClave.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
