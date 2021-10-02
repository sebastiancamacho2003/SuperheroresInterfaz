package superheroe;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Hada implements volador, Magico, Animalia {

    String x = "";

    public void despegar() {

        x = "El Hada despega";

    }

    public void avanzar() {
        x = "El Hada avanza";

    }

    public void acelerar() {
        x = "El Hada acelera";

    }

    public void aterrizar() {
        x = "El Hada aterriza";

    }

    public void manejarElementos() {
        x = "El Hada tiene magia elemental";
    }

    public void abstracta() {
        x = "El Hada tiene magia abstracta";

    }

    public void sanar() {
        x = "El Hada puede usar magia curativa";

    }

    public void invocar() {
        x = "El Hada puede invocar cosas";

    }

    public void comunicacionAnimal() {
        x = "El Hada puede hablar con los animales";

    }

    public void metamorfosis() {
        x = "El Hada puede cambiar de forma";

    }

    public void controlNatural() {
        x = "El Hada puede controlar la naturaleza";

    }

    public void imprimir() {
        int a = 1;

        String mensaje = "";
        for (int i = 0; i < 11; i++) {
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
            } else if (a == 9) {
                comunicacionAnimal();
                a++;
            } else if (a == 10) {
                metamorfosis();
                a++;
            } else if (a == 11) {
                controlNatural();
                a++;
            }

            mensaje += x + "\n";

        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public Hada() {

    }
}
