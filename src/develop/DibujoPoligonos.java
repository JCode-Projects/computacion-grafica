package develop;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;

public class DibujoPoligonos {
    public DibujoPoligonos() {
        super("Dibujo Poligonos");
        setSize(300, 300);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);

        int[][][] points = {
            // Oreja izquierda
            {
                {45, 55}, {75, 75}, {40, 135},
                {15, 190}, {45, 55}
            }, 
            // Lado izquierdo
            {
                {75, 75}, {105, 115}, {45, 195},
                {25, 155}, {75, 75}
            },
            // Ojo izquierdo
            {
                {105, 115}, {100, 165}, {85, 185},
                {65, 170}, {105, 115}
            },
            // Parte inferior al ojo
            {
                {85, 185}, {95, 215}, {45, 200},
                {65, 180}, {85, 185}
            },
            // Parte central de la cara
            {
                {75, 75}, {125, 50}, {175, 75},
                {145, 115}, {155, 165}, {170, 185},
                {160, 215}, {145, 120}, {120, 110},
                {100, 120}, {90, 115}, {80, 185}, 
                {95, 165}, {100, 115}, {75, 75} 
            }
        }

        for(int i = 0; i < points.length; i++) {
            Polygon figura = new Polygon();
            for(int j = 0; j < points[i].length; j++) {
                figura.addPoint(points[i][j][0], points[i][j][1]);                
            }
            g.drawPolygon(figura);
        }
    }
}