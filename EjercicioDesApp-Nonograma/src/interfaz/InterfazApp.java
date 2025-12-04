/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz;

import controlador.Controlador;
import javax.swing.JFrame;
import mundo.Nonograma;

/**
 *
 * @author SG701-19
 */
public class InterfazApp extends JFrame {
    private PanelVidas pnlVidas;
    private PnlPistasVerticales pnlPistVerticales;
    private PnlPistasHorizontales pnlPistHorizontales;
    private PanelGrilla pnlGrilla;
    private PnlImagen pnlImagen;

    public InterfazApp() {
        getContentPane().setLayout(null);
        Nonograma nonograma = new Nonograma();
        Controlador ctrl = new Controlador(nonograma);
        
        pnlVidas = new PanelVidas();
        pnlVidas.setBounds(200, 0, 400, 75);
        add(pnlVidas);

        pnlGrilla = new PanelGrilla(ctrl, pnlVidas);
        pnlGrilla.setBounds(200, 175, 400, 400);
        getContentPane().add(pnlGrilla);
        
        pnlPistHorizontales = new PnlPistasHorizontales();
        pnlPistHorizontales.setBounds(85, 175, 100, 400);
        getContentPane().add(pnlPistHorizontales);

        pnlPistVerticales = new PnlPistasVerticales();
        pnlPistVerticales.setBounds(200, 90, 400, 70);
        getContentPane().add(pnlPistVerticales);
        
        pnlImagen = new PnlImagen();
        pnlImagen.setBounds(85, 26, 100, 130);
        getContentPane().add(pnlImagen);

        this.setTitle("NONOGRAMA");
        this.setSize(700, 700);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nonograma nono = new Nonograma();
        nono.imprimir();
        InterfazApp frmMain = new InterfazApp();
        frmMain.setVisible(true);
    }
}
