import javax.swing.*;

public class Ejercicio8SueldoUnidad1 {
    public static void main(String[] args) {
        String nombre = " ";
        double hora =0;
        double cuota =0.0;
        double sueldo =0.0;

        nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre: ");

        hora=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la cantidad de horas trabajadas: "));

        cuota = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu cuota por hora: "));

        sueldo= hora * cuota;

        JOptionPane.showMessageDialog(null, "El nombre del trabajador es: " +  nombre
                +  " su cuota por hora es: " + cuota +
                 " Y su sueldo total es: " + sueldo);




    }
}
