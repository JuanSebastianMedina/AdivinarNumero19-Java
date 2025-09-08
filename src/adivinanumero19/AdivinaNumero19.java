/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinanumero19;
/**
 * @author juanse
 * Fecha de creación: domingo 07 de septiembre de 2025
 * Requerimientos: Genera un número aleatorio entre 1 y 100. 
 * El usuario debe adivinarlo con pistas de “más alto” o “más bajo”. 
 * Usa while hasta que lo adivine y muestra el número de intentos.
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class AdivinaNumero19 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(101);
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número de 0 a 100"));
        int intento = 0;
        while (numero != numeroAleatorio) {
            intento++;
            if (numero>numeroAleatorio) {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número más bajo."));
            } else if (numero<numeroAleatorio) {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número más alto."));
            }
        }
        JOptionPane.showMessageDialog(null, "Felicitaciones, el número es: " + numeroAleatorio + "\n Número de intentos: " + intento);
    }
}
