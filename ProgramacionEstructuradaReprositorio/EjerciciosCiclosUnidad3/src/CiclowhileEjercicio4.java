import javax.swing.*;

public class CiclowhileEjercicio4 {
    public static void main(String[] args) {
        int n =0, i=0;    int digito =0;
        int amarilla = 0;
        int rosa = 0;
        int roja = 0;
        int verde = 0;
        int azul = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de autos:"));

        while (i < n) {
             digito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el último dígito de la placa del auto " + (i + 1) ));
            if (digito == 1 || digito == 2) {
                amarilla++;
            } else if (digito == 3 || digito == 4) {
                rosa++;
            } else if (digito == 5 || digito == 6) {
                roja++;
            } else if (digito == 7 || digito == 8) {
                verde++;
            } else if (digito == 9 || digito == 0) {
                azul++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Calcomanías: Amarilla: " + amarilla + ", Rosa: " + rosa + ", Roja: " + roja + ", Verde: " + verde + ", Azul: " + azul);
    }

}

