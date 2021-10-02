package superheroe;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Gigante implements Fuerte, ControlMineral {

    String x = "";

    public Gigante() {
    }

    public void musculos() {
        x = "El Gigante tiene musculos especiales";
    }

    public void fisico() {
        x = "El Gigante tiene buen fisico";
    }

    public void resistencia() {
        x = "El Gigante tiene mucha resistencia";
    }

    public void minerales() {
        x = "El Gigante puede controlar minerales";
    }

    public void corporeo() {
        x = "El Gigante puede imbuir su cuerpo en minerales";
    }

    public void habitad() {
        x = "El Gigante vive en zonas con muchos minerales";

    }

    public void imprimir() {
        int a = 1;

        String mensaje = "";
        for (int i = 0; i < 6; i++) {
            if (a == 1) {
                musculos();
                a++;
            } else if (a == 2) {
                fisico();
                a++;
            } else if (a == 3) {
                resistencia();
                a++;
            } else if (a == 4) {
                 minerales();
                a++;
            } else if (a == 5) {
                corporeo();
                a++;
            } else if (a == 6) {
                habitad();
                a++;
            }

            mensaje += x + "\n";

        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
