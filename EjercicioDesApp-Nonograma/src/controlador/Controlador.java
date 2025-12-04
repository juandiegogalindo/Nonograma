/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import interfaz.PanelGrilla;
import java.awt.Image;
import javax.swing.ImageIcon;
import mundo.Nonograma;
import javax.swing.JOptionPane;

/**
 *
 * @author SG701-19
 */
public class Controlador {

    private Nonograma nonograma;
    private PanelGrilla panelGrilla;
    private int contador = 0;
    private Image imagenEscalada;
    public Controlador(Nonograma nonograma) {
        this.nonograma = nonograma;
    }

    public boolean validarMovimientoCorrecto(int fila, int columna) {
        if (nonograma.getValor(fila, columna) == 1) {
            contador++;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Movimiento incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public boolean validarMovimientoIncorrecto(int fila, int columna) {
        if (nonograma.getValor(fila, columna) == 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Movimiento incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
            contador++;
            return false;
        }
    }

    public void contador() {
        if (contador == 57) {
            ImageIcon icono = new ImageIcon("C:\\Users\\jdgal\\OneDrive\\Documentos\\NetBeansProjects\\EjercicioNonograma\\data\\chu.jpg");
            imagenEscalada = icono.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
            JOptionPane.showMessageDialog(null, "HAS GANADO EL JUEGO", "¡Felicitaciones Terminaste",JOptionPane.PLAIN_MESSAGE, iconoEscalado);
            System.exit(0);

        }
        System.out.println(contador);
    }

}
