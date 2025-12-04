/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author SG701-19
 */
public class Nonograma {

    private int[][] matriz = {
        {0, 0, 1, 0, 1, 0, 0, 0, 0, 0},
        {0, 1, 1, 0, 1, 1, 0, 0, 0, 0},
        {0, 1, 1, 1, 1, 1, 0, 0, 0, 0},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 1},
        {0, 1, 1, 1, 1, 1, 0, 0, 1, 1},
        {0, 0, 1, 1, 1, 0, 0, 0, 1, 0},
        {1, 1, 1, 1, 1, 1, 0, 0, 1, 1},
        {1, 0, 1, 1, 1, 1, 1, 0, 0, 1},
        {0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 1, 1, 0, 1, 1, 1, 1, 0, 0},};

    public Nonograma() {
    }

    public int[][] getMatriz(int fila,int columna) {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getValor(int fila, int columna) {
        return matriz[fila][columna];
    }

    public void imprimir() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

    }
}
