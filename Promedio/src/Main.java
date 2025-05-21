import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        float suma;
        float promedio;

            java.lang.String calificacion1 = JOptionPane.showInputDialog("Ingrese la calificación");
            java.lang.String calificacion2 = JOptionPane.showInputDialog("Ingrese la segunda calificacion");
            java.lang.String calificacion3 = JOptionPane.showInputDialog("Ingrese la tercera calificacion");

            float cal1= Float.parseFloat(calificacion1);
            float cal2 = Float.parseFloat(calificacion2);
            float cal3 = Float.parseFloat(calificacion3);

            suma = cal1 + cal2 + cal3;
            promedio = suma/3;

            JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
    }
}