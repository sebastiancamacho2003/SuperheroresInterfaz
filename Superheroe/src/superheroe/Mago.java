package superheroe;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Mago implements volador, Magico {

    String x = "";

    public void despegar() {
        x = "El Mago despega";
    }

    public void avanzar() {
        x = "El Mago avanza";

    }

    public void acelerar() {
        x = "El Mago acelera";

    }

    public void aterrizar() {
        x = "El Mago aterriza";

    }

    public void manejarElementos() {
        x = "El mago tiene magia elemental";
    }

    public void abstracta() {
        x = "El mago tiene magia abstracta";

    }

    public void sanar() {
        x = "El mago puede usar magia curativa";

    }

    public void invocar() {
        x = "El mago puede invocar cosas";

    }

    public void imprimir() {
        int a = 1;

        String mensaje = "";
        for (int i = 0; i < 8; i++) {
            if (a == 1) {
                despegar();
                a++;
            } else if (a == 2) {
                avanzar();
                a++;
            } else if (a == 3) {
                acelerar();
                a++;
            } else if (a == 4) {
                aterrizar();
                a++;
            } else if (a == 5) {
                manejarElementos();
                a++;
            } else if (a == 6) {
                abstracta();
                a++;
            } else if (a == 7) {
                sanar();
                a++;
            } else if (a == 8) {
                invocar();
                a++;
            }

            mensaje += x + "\n";

        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public Mago() {

    }
}
