import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String  calificacion1;
        String calificacion2;
        String  calificacion3;
        float promedio;

            calificacion1 = JOptionPane.showInputDialog("Ingrese la calificación");
            calificacion2 = JOptionPane.showInputDialog("Ingrese la segunda calificacion");
            calificacion3 = JOptionPane.showInputDialog("Ingrese la tercera calificacion");

            calificacion1 = Integer.parseInt(calificacion1);
            calificacion2 = Integer.parseInt(calificacion2);
            calificacion3 = Integer.parseInt(calificacion3);

            promedio = (calificacion1 + calificacion2 + calificacion3)/3;

            JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
    }
}