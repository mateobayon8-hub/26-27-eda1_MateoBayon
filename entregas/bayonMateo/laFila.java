package entregas.bayonMateo;

import java.util.ArrayList;

class laFila {
    public static void main(String[] args) {

    }

    public class Fila {
        private ArrayList<Cliente> fila = new ArrayList<>();
        private final int CAPACIDAD_MAXIMA = 15;

        public boolean estaLlena() {
            return fila.size() >= CAPACIDAD_MAXIMA;
        }

        public void llegaCliente(Cliente c) {
            if(!estaLlena()){
                fila.add(c);
            }
        }

        public Cliente atenderCliente() {
            if(estaLlena()){
                return fila.remove(0);
            }
        return null;
        }
    }

    public class Cliente {
        private int llegadaMinuto;

        public Cliente(int llegadaMinuto) {
            this.llegadaMinuto = llegadaMinuto;
        }

        public int getLlegadaMinuto() {
            return llegadaMinuto;
        }
     }
}
