import javax.swing.*;

public class Ejercicio4CicloFor {
    public static void main(String[] args) {
        int n =0, edad=0;
        double sumaN = 0.0;
        double sumaJ = 0.0;
        double sumaA = 0.0;
       double  sumaV = 0.0;
       double peso = 0.0;
        int conta1 = 0, conta2 = 0, conta3 = 0, conta4 = 0;
        double promedio1 =0.0, promedio2=0.0, promedio3= 0.0, promedio4 =0.0;



         n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas:"));


        for (int i = 0; i < n; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona " + (i + 1) ));
          peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona " + (i + 1) ));

            if (edad <= 12) {
                sumaN += peso;
                conta1++;
            } else if (edad <= 29) {
                sumaJ += peso;
                conta2++;
            } else if (edad <= 59) {
                sumaA += peso;
                conta3++;
            } else {
                sumaV += peso;
                conta4++;
            }
        }

         promedio1 = conta1 == 0 ? 0 : sumaN / conta1;
         promedio2 = conta2 == 0 ? 0 : sumaJ / conta2;
        promedio3 = conta3 == 0 ? 0 : sumaA / conta3;
         promedio4 = conta4 == 0 ? 0 : sumaV /conta4;

        JOptionPane.showMessageDialog(null, "Promedio de peso:\nNiños: " + promedio1 + "\nJóvenes: "
                + promedio2 + "\nAdultos: " + promedio3 + "\nViejos: " + promedio4);
    }



}

