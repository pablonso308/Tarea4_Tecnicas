package ejercicio6;
import java.util.ArrayList;
import java.util.Collection;

public class transacciones {
    private ArrayList<Transaccion>transacciones;

    public transacciones(){
        this.transacciones = new ArrayList<>();
    }
    public void agregarTransaccion(Transaccion transaccion){
        this.transacciones.add(transaccion);
    }
    public void agregarTransaccion(boolean esFraudulenta, int idTransaccion, double importe, String concepto, int idOrdenante, int idBeneficiario){
        Transaccion transaccion = new Transaccion(esFraudulenta, idTransaccion, importe, concepto, idOrdenante, idBeneficiario);
        this.transacciones.add(transaccion);
    }
    public Collection<Transaccion> getTransacciones(){
        return transacciones;
    }
}