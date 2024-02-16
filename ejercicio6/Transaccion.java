package ejercicio6;

import java.util.ArrayList;
import java.util.List;
public class Transaccion {
    private boolean esFraudulenta;
    private int idtransacaccion;
    private double importe;
    private String concepto;
    private int idordenante;
    private int idbeneficiario;

    public Transaccion(boolean esFraudulenta,int idtransacaccion, double importe, String concepto, int idordenante, int idbeneficiario) {
        this.esFraudulenta = esFraudulenta;
        this.idtransacaccion = idtransacaccion;
        this.importe = importe;
        this.concepto = concepto;
        this.idordenante = idordenante;
        this.idbeneficiario = idbeneficiario;
    }
    public void marcarComoFraudulenta(){
        this.setEsFraudulenta();
    }

    private void setEsFraudulenta() {
        this.esFraudulenta = true;
    }




    public int getidbeneficiario() {
        return idbeneficiario;
    }


    public static List<Transaccion> obtenerTransacciones() {

        List<Transaccion> transacciones = new ArrayList<>();


        transacciones.add(new Transaccion(false, 1, 100.0, "Pago", 1, 2));
        transacciones.add(new Transaccion(false, 2, 200.0, "Depósito", 2, 1));
        transacciones.add(new Transaccion(true, -1, 300.0, "Retiro", 1, 2));


        return transacciones;
    }
}

