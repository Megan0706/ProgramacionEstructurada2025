import javax.swing.*;

public class Ejercicio2Llantera {
    public static void main(String[] args) {
        int llanta =0;
        double precioLlanta =0.0;
        double totalCompra =0.0;


        llanta = Integer.parseInt(JOptionPane.showInputDialog("Cuantas llantas adquiriste:  "));

        if (llanta<5) {
            precioLlanta = 300;
        } else if (llanta>=5 && llanta<=10) {
            precioLlanta = 250;
        }else {
            precioLlanta=200;
        }
        totalCompra = llanta * precioLlanta;

        JOptionPane.showMessageDialog(null, "Precio por llanta: " + precioLlanta);
        JOptionPane.showMessageDialog(null,"Total a pagar por la compra es: " + totalCompra );


    }
    }

