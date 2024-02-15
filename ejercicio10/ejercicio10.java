package ejercicio10;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        File imagen = obtenerImagenUsuario();
        int resolucion = obtenerResolucion();
        String caracteres = obtenerCaracteres();

        crearArteASCII(imagen, resolucion, caracteres);
    }

    private static File obtenerImagenUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la ruta de la imagen: ");
        String rutaImagen = scanner.nextLine();
        return new File(rutaImagen);
    }

    private static int obtenerResolucion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la resolución (número de caracteres por ancho): ");
        return scanner.nextInt();
    }

    private static String obtenerCaracteres() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los caracteres a utilizar en el arte ASCII: ");
        return scanner.nextLine();
    }

    private static void crearArteASCII(File imagen, int resolucion, String caracteres) {
        try {
            BufferedImage bufferedImage = ImageIO.read(imagen);

            int ancho = bufferedImage.getWidth();
            int alto = bufferedImage.getHeight();

            double proporcionAspecto = (double) alto / ancho;

            int nuevoAncho = resolucion;
            int nuevoAlto = (int) (resolucion * proporcionAspecto);

            BufferedImage imagenRedimensionada = new BufferedImage(nuevoAncho, nuevoAlto, BufferedImage.TYPE_INT_RGB);
            imagenRedimensionada.getGraphics().drawImage(bufferedImage, 0, 0, nuevoAncho, nuevoAlto, null);

            for (int y = 0; y < nuevoAlto; y++) {
                for (int x = 0; x < nuevoAncho; x++) {
                    int rgb = imagenRedimensionada.getRGB(x, y);
                    int escalaGris = obtenerEscalaGris(rgb);

                    // Normalizar el valor de escala de grises a la longitud de la cadena de caracteres
                    int indiceCaracter = (escalaGris * (caracteres.length() - 1)) / 255;

                    System.out.print(caracteres.charAt(indiceCaracter));
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int obtenerEscalaGris(int rgb) {
        int r = (rgb >> 16) & 0xFF;
        int g = (rgb >> 8) & 0xFF;
        int b = rgb & 0xFF;

        return (int) (0.299 * r + 0.587 * g + 0.114 * b);
    }
}
