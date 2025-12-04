/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import controlador.Controlador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author SG701-19
 */
public class PanelGrilla extends JPanel {

    private PanelVidas pnlVidas;
    private Controlador ctrl;
    private JLabel lblMundo[][];

    public PanelGrilla(Controlador ctrl, PanelVidas pnlVidas) {
        this.pnlVidas = pnlVidas;
        this.ctrl = ctrl;

        setLayout(new GridLayout(10, 10));
        lblMundo = new JLabel[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                lblMundo[i][j] = new JLabel(" ", SwingConstants.CENTER);
                lblMundo[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                lblMundo[i][j].setPreferredSize(new Dimension(100, 100));

                final int fila = i;
                final int columna = j;

                lblMundo[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        JLabel source = (JLabel) e.getSource();
                        if (e.getButton() == MouseEvent.BUTTON1) {
                            manejarClicIzquierdo(source, fila, columna);
                        } else if (e.getButton() == MouseEvent.BUTTON3) {
                            manejarClicDerecho(source, fila, columna);
                        }
                    }
                });
                add(lblMundo[i][j]);
            }
        }
    }

    private void manejarClicIzquierdo(JLabel source, int fila, int columna) {
        if (ctrl.validarMovimientoCorrecto(fila, columna) == true) {
            String imagenPath = "C:\\Users\\jdgal\\OneDrive\\Documentos\\NetBeansProjects\\EjercicioNonograma\\data\\equis.png";
            ImageIcon imageIcon = new ImageIcon(imagenPath);
            source.setIcon(imageIcon);
            
        } else {
            pnlVidas.cambiarImagen();
            String imagenPath = "C:\\Users\\jdgal\\OneDrive\\Documentos\\NetBeansProjects\\EjercicioNonograma\\data\\images.png";
            ImageIcon imageIcon = new ImageIcon(imagenPath);
            Image imagenEscalada = imageIcon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
            source.setIcon(iconoEscalado);
        }
        System.out.println("Clic izquierdo en: [" + fila + "][" + columna + "]");
        ctrl.contador();
    }

    private void manejarClicDerecho(JLabel source, int fila, int columna) {
        if (ctrl.validarMovimientoIncorrecto(fila, columna) == true) {
            String imagenPath = "C:\\Users\\jdgal\\OneDrive\\Documentos\\NetBeansProjects\\EjercicioNonograma\\data\\images.png";
            ImageIcon imageIcon = new ImageIcon(imagenPath);
            Image imagenEscalada = imageIcon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
            source.setIcon(iconoEscalado);
        } else {
            pnlVidas.cambiarImagen();
            String imagenPath = "C:\\Users\\jdgal\\OneDrive\\Documentos\\NetBeansProjects\\EjercicioNonograma\\data\\equis.png";
            ImageIcon imageIcon = new ImageIcon(imagenPath);
            source.setIcon(imageIcon);
        }
        System.out.println("Clic derecho en: [" + fila + "][" + columna + "]");
        ctrl.contador();
    }
}
