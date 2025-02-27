import javax.swing.*;

public class Ejercicio6Empresa {
    public static void main(String[] args) {

        double capital =0.0;
        double equipoComputo = 5000;
        double mobiliario = 2000;
        double insumos =0.0;
        double incentivos =0.0;
        double prestamo =0.0;
        double saldoFinal=0.0;
        double resPresu=0.0;

        capital = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el capital de la empresa"));

        if (capital<0) {
            prestamo = 10000 - capital;
            saldoFinal = 10000;
        } else if (capital<=20000) {
            prestamo = 20000 - capital;
            saldoFinal = 20000;
        }else {
            prestamo=0;
            saldoFinal= capital;
        }
        resPresu= saldoFinal - equipoComputo - mobiliario;
        insumos= resPresu /2;
        incentivos = resPresu/2;

        JOptionPane.showMessageDialog(null,"Prestamo solicitado: " + prestamo
        + "\n Saldo final de la empresa: " + saldoFinal + "\nDistribucion d presupuesto, -5000 para equipo de copputo, -2000 para mobiliario, - " + insumos +
                " Para la compra de insumos y " + incentivos + " para incentivos al personal");
    }

    }
