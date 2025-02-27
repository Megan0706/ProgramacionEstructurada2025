import javax.swing.*;

public class CicloLibreEjercicio5 {
    public static void main(String[] args) {
        double  suma = 0;
        int n =0;
        String su=" ";


        n= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor de n: "));

        for (int i = 100; i >=n; i-=5) {
            suma +=i;
            su+= i+ " ";
        }
        JOptionPane.showMessageDialog(null, "La suseción es: " + su +
                "\nY su suma es: " + suma);

    }
}
