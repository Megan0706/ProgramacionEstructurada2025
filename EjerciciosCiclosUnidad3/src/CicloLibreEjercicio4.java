import javax.swing.*;

public class CicloLibreEjercicio4 {
    public static void main(String[] args) {
        int n =0;
        double calificacion = 0.0;
        double porcentajeAprobados = 0.0;
        double porcentajeReprobados = 0.0;
        int aprobados =0;   //contadores
        int reprobados =0;   //contadores



       n= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de calificaciones: "));

        for (int i = 1; i <=n ; i++) {
            calificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la calificacion del alumno " + i));

        if (calificacion>=70){
            aprobados++;
        } else {
            reprobados++;

            porcentajeAprobados = (aprobados * 100) / n;
            porcentajeReprobados = (reprobados * 100) / n;
        }}

        JOptionPane.showMessageDialog(null, "El porcentaje de los aprobados es igual a: " + porcentajeAprobados  +
                "\nEl porcentaje de reprobados es igual a: " +  porcentajeReprobados  +
                "\nla cantidad de alumnos aprobados es: " + aprobados +
               "\nla cantidad de alumnos reprobados es: " + reprobados) ;

        }

    }

