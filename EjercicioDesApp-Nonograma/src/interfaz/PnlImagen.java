/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author SOFIA
 */
public class PnlImagen extends JPanel {
////    private Image imagenEscalada;

    private JLabel etiqueta;
    private String rutaImagen;

    public PnlImagen() {
        setLayout(new GridLayout(1, 1));
        etiqueta = new JLabel("");
        etiqueta.setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        etiqueta.setEnabled(true);
        add(etiqueta);

        rutaImagen = "C:\\Users\\jdgal\\OneDrive\\Documentos\\NetBeansProjects\\EjercicioNonograma\\data\\ima.jpg";
        ImageIcon iconoOriginal = new ImageIcon(rutaImagen);

        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(100, 130, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
        etiqueta.setIcon(iconoEscalado);
    }

}
