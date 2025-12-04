/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author jdgal
 */
public class PnlPistasHorizontales extends JPanel{
    private JLabel lblMatriz[][];

    public PnlPistasHorizontales() {
        setLayout(new GridLayout(10, 4));
        lblMatriz = new JLabel[10][4];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                lblMatriz[i][j] = new JLabel("-");
                lblMatriz[i][j].setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
                lblMatriz[i][j].setHorizontalAlignment(JLabel.CENTER);
                lblMatriz[i][j].setEnabled(true);
                add(lblMatriz[i][j]); 
            }
        }
        
        lblMatriz[0][2].setText("1");
        lblMatriz[0][3].setText("1");
        lblMatriz[1][2].setText("2");
        lblMatriz[1][3].setText("2");
        lblMatriz[2][3].setText("5");
        lblMatriz[3][0].setText("2");
        lblMatriz[3][1].setText("1");
        lblMatriz[3][2].setText("2");
        lblMatriz[3][3].setText("1");
        lblMatriz[4][2].setText("5");
        lblMatriz[4][3].setText("2");
        lblMatriz[5][2].setText("3");
        lblMatriz[5][3].setText("1");
        lblMatriz[6][2].setText("6");
        lblMatriz[6][3].setText("2");
        lblMatriz[7][1].setText("1");
        lblMatriz[7][2].setText("5");
        lblMatriz[7][3].setText("1");
        lblMatriz[8][3].setText("8");
        lblMatriz[9][2].setText("2");
        lblMatriz[9][3].setText("4");
    }
}