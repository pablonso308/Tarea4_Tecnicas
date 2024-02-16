package ejercicio6;

import java.util.List;


    public class detector {


        private boolean esFraudulenta(Transaccion transaccion) {

            return transaccion.getidbeneficiario() < 0;
        }

            private void marcarComoFraudulenta (Transaccion transaccion){
                // Marcar la transacción como fraudulenta
                transaccion.marcarComoFraudulenta();

                // Imprimir un mensaje en la consola
                System.out.println("Transacción marcada como fraudulenta: " + transaccion.getidbeneficiario());

            }


            public void detectarFraudes (List < Transaccion > transacciones) {
                for (Transaccion transaccion : transacciones) {
                    if (esFraudulenta(transaccion)) {
                        marcarComoFraudulenta(transaccion);
                    }
                }
            }

    }

