package superheroe;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Kriptoniano implements volador, Fuerte {

    String x = "";

    public void despegar() {
        x = "El kriptoniano despega";
    }

    public void avanzar() {
        x = "El kriptoniano avanza";

    }

    public void acelerar() {
        x = "El kriptoniano acelera";

    }

    public void aterrizar() {
        x = "El kriptoniano aterriza";

    }

    public void musculos() {
        x = "El Kriptoniano tiene musculos especiales";
    }

    public void fisico() {
        x = "El kriptoniano tiene buen fisico";
    }

    public void resistencia() {
        x = "El kriptoniano tiene mucha resistencia";
    }

    public Kriptoniano() {
    }

    public void imprimir() {
        int a = 1;

        String mensaje = "";
        for (int i = 0; i < 7; i++) {
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
                musculos();
                a++;
            } else if (a == 6) {
                fisico();
                a++;
            } else if (a == 7) {
                resistencia();
                a++;
            }

            mensaje += x + "\n";

        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
