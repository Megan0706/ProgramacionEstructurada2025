import javax.swing.*;

public class ejercico10PromedioUnidad1 {
    public static void main(String[] args) {
        double cal1=0.0, cal2=0.0, cal3 =0.0, cal4=0.0;
        double suma=0.0;
        double promedio =0.0;

       cal1= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la primera calificacion"));
        cal2= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la segunda calificacion"));
        cal3= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la tercera calificacion"));
        cal4= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la cuarta calificacion"));

        suma = cal1 + cal2 +  cal3 + cal4;
        promedio = suma / 4;

        JOptionPane.showMessageDialog(null, "El promedio total de las calificaciones es: " +  promedio);





    }
}
