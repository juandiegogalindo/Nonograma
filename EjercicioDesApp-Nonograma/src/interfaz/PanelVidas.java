/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelVidas extends JPanel {
    private String rutaImagen;
    private Image imagenEscalada;
    private JLabel[] arreglo;
    private int vidasRestantes = 3;

    public PanelVidas() {
        setLayout(new GridLayout(0, 3)); 
        arreglo = new JLabel[3];

        for (int i = 0; i < 3; i++) {
            arreglo[i] = new JLabel("");
            arreglo[i].setBorder(new CompoundBorder(new EmptyBorder(10, 40, 10, 40), new TitledBorder("")));
            arreglo[i].setHorizontalAlignment(JLabel.CENTER);
            arreglo[i].setEnabled(true);
            add(arreglo[i]);
        }
        
        rutaImagen = "C:\\Users\\jdgal\\OneDrive\\Documentos\\NetBeansProjects\\EjercicioNonograma\\data\\live.png";
        ImageIcon iconoOriginal = new ImageIcon(rutaImagen);
        
        imagenEscalada = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);

        arreglo[0].setIcon(iconoEscalado);
        arreglo[1].setIcon(iconoEscalado);
        arreglo[2].setIcon(iconoEscalado);
    }
    
    public void cambiarImagen() {
        if (vidasRestantes > 0) {
            vidasRestantes--;
            
            rutaImagen = "C:\\Users\\jdgal\\OneDrive\\Documentos\\NetBeansProjects\\EjercicioNonograma\\data\\die.png";
            ImageIcon iconoOriginal = new ImageIcon(rutaImagen);
            imagenEscalada = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
            arreglo[vidasRestantes].setIcon(iconoEscalado);
            
            if (vidasRestantes == 0) {
                ImageIcon icono = new ImageIcon("C:\\Users\\jdgal\\OneDrive\\Documentos\\NetBeansProjects\\EjercicioNonograma\\data\\die.png");
                JOptionPane.showMessageDialog(null, "PERDISTE! NO QUEDAN VIDAS", "Juego Terminado", JOptionPane.PLAIN_MESSAGE, icono);
                System.exit(0);
            } 
        } 
    }
}