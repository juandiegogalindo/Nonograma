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
 * @author SG701-19
 */
public class PnlPistasVerticales extends JPanel {
    private JLabel lblMatriz[][];

    public PnlPistasVerticales() {
        setLayout(new GridLayout(3, 10));
        lblMatriz = new JLabel[3][10];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                lblMatriz[i][j] = new JLabel("-");
                lblMatriz[i][j].setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
                lblMatriz[i][j].setHorizontalAlignment(JLabel.CENTER);
                lblMatriz[i][j].setEnabled(true);
                add(lblMatriz[i][j]); 
            }
        }
        
        lblMatriz[1][0].setText("1");
        lblMatriz[2][0].setText("2");
        lblMatriz[0][1].setText("4");
        lblMatriz[1][1].setText("1");
        lblMatriz[2][1].setText("1");
        lblMatriz[1][2].setText("3");
        lblMatriz[2][2].setText("6");
        lblMatriz[2][3].setText("7");
        lblMatriz[1][4].setText("3");
        lblMatriz[2][4].setText("6");
        lblMatriz[1][5].setText("4");
        lblMatriz[2][5].setText("4");
        lblMatriz[1][6].setText("1");
        lblMatriz[2][6].setText("3");
        lblMatriz[2][7].setText("2");
        lblMatriz[1][8].setText("3");
        lblMatriz[2][8].setText("1");
        lblMatriz[1][9].setText("2");
        lblMatriz[2][9].setText("3");
    }
}