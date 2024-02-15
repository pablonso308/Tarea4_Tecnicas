package ejercicio2;

import java.util.ArrayList;
import java.util.List;

 class dispositivo {
    String nombre;
    List<dispositivo> conexiones;

    public dispositivo(String nombre) {
        this.nombre = nombre;
        this.conexiones = new ArrayList<>();
    }
}
