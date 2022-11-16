/**4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda
usar JOptionPane). */

import javax.swing.JOptionPane;
public class SaludoPersonalizadoApp {
public static void main(String[] args) {

String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
System.out.println("Bienvenido "+nombre);
}
}