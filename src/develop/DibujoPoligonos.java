package develop;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

public class DibujoPoligonos extends JFrame {
    public DibujoPoligonos() {
        super("Dibujo Poligonos");
        setSize(250, 280);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(2.0f));

        int[][][] points = {
            // Oreja izquierda [0]
            {
                {35, 55}, {70, 75}, {35, 135},
                {10, 90}, {35, 55}
            }, 
            // Lado izquierdo [1]
            {
                {70, 75}, {100, 115}, {40, 200},
                {20, 160}, {70, 75}
            },
            // Ojo izquierdo [2]
            {
                {100, 115}, {95, 170}, {80, 190},
                {60, 173}, {100, 115}
            },
            // Parte inferior al ojo [3]
            {
                {80, 190}, {90, 220}, {40, 200},
                {60, 174}, {80, 190}
            },
            // Parte central de la cara [4]
            {
                {70, 75}, {120, 50}, {175, 75},
                {140, 115}, {150, 170}, {165, 190},
                {155, 220}, {145, 225}, {120, 220},
                {100, 225}, {90, 220}, {80, 190}, 
                {95, 170}, {100, 115}, {70, 75} 
            },
            // Nariz y boca [5]
            {
                {119, 221}, {119, 216}, {104, 210},
                {95, 200}, {120, 205}, {150, 200},
                {140, 210}, {122, 216}, {122, 221},
                {135, 223}, {120, 228}, {105, 224},
                {119, 221}
            },
            // Mandibula inferior [6]
            {
                {155, 220}, {145, 235}, {120, 240},
                {100, 235}, {90, 220}, {100, 225},
                {120, 220}, {145, 225},  {155, 220}
                
            },
            // Oreja derecha [7]
            {
                {175, 75}, {210, 55}, {235, 90},
                {210, 135}, {175, 75}
            }, 
            // Parte derecha de la cara [8]
            {
                {175, 75}, {222, 155}, {200, 195},
                {140, 115}, {175, 75}
            },
            // Ojo derecho [9]
            {
                {140, 115}, {185, 175}, {165, 190},
                {150, 170}, {140, 115}
            },
            // Parte inferior de la cara lado derecho [10]
            {
                {185, 175}, {200, 196}, {155, 220},
                {165, 190}
            }
        };

        for(int i = 0; i < points.length; i++) {
            Polygon figura = new Polygon();
            for(int j = 0; j < points[i].length; j++) {
                figura.addPoint(points[i][j][0], points[i][j][1]);                
            }
            if(i == 0 || i == 2 || i == 5 || i == 7 || i == 9) {
                g2.fillPolygon(figura);
            }

            g2.drawPolygon(figura);
        }
    }

    public static void main(String[] args) {
        DibujoPoligonos appPolygon = new DibujoPoligonos();
        appPolygon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}