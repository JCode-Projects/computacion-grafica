package develop;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;


public class DibujoLineas extends JFrame {
    public DibujoLineas() {
        super("Dibujo Lineas");
        setSize(360, 460);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        /* >>>>> DIBUJANDO LA LUNA <<<<< */
        // Coordenadas para dibujar la bruja
        int[][][] points = {
            // Coordenadas Luna [0]
            {
                {250, 50}, {280, 50}, {300, 60},
                {310, 80}, {310, 110}, {300, 130},
                {280, 140}, {250, 140}, {270, 130},
                {280, 110}, {280, 70}, {270, 60},
                {250, 50}
            },
            // Coordenadas parte sombrero superior [1]
            {
                {130, 50}, {170, 80}, {150, 80},
                {190, 160}, {70, 160}, {130, 50}
            },
            // Coordenadas parte sombrero inferior [2]
            {
                {30, 160}, {230, 160}, {230, 170}, 
                {30, 170}, {30, 160}
            },
            // Cordenadas cinta negra sombrero [3]
            {
                {92, 120}, {170 ,120}, {180, 140},
                {81, 140}, {92, 120}
            },
            // Coordenadas hebilla en la cinta negra [4]
            {
                {110, 110}, {150, 110}, {150, 150},
                {110, 150}, {110, 110}
            },
            // Coordenadas parte interna de la hebilla [5]
            {
                {120, 120}, {140, 120}, {140, 140},
                {120, 140}, {120, 120}
            },
            // Coodenadas del cabello en lado izquierdo [6]
            {
                {70,170}, {10, 230}, {20, 240},
                {60, 200}, {30, 240}, {40, 250},
                {66, 210}, {50, 260}, {60, 270},
                {92, 170}, {65,170}
            },
            // Coordenadas del cabello en el lado derecho [7]
            {
                {190, 170}, {250, 230}, {240, 240},
                {200, 200}, {230, 240}, {220, 250},
                {195, 210}, {220, 260}, {210, 270},
                {168 ,170}, {195, 170}
            },
            // Coordenadas de la cara [8]
            {
                {92, 170}, {168 ,170}, {193, 230},
                {193, 250}, {163, 280}, {103, 280},
                {73, 250}, {73, 230}, {92, 170}
            },
            // Coordenadas de la esclerótica del ojo izquierdo [9]
            {
                {93, 180}, {123, 180}, {123, 210},
                {93, 210}, {93, 180}
            },
            // Coordenadas del iris del ojo izquierdo [10]
            {
                {103, 190}, {123, 190}, {123, 210}, 
                {103, 210}, {103, 190}
            },
            // Coordenadas de la esclerótica del ojo derecho [11]
            {
                {140, 180}, {170, 180}, {170, 210},
                {140, 210}, {140, 180}
            },
            // Coordenadas del iris del ojo derecho [12]
            {
                {140, 190}, {160, 190}, {160, 210},
                {140, 210}, {140, 190}
            },
            // Coordenada de la nariz [13]
            {
                {160, 210}, {83, 210}, {83, 230},
                {143, 230}
            },
            // Coordenadas de la boca [14]
            {
                {103, 240}, {103, 250}, {113, 260},
                {153, 260}, {163, 250}, {163, 240}
            },
            // Coordenadas palo escoba [15]
            {
                {23, 370}, {243, 370}, {243, 380},
                {23, 380}, {23, 370}
            },
            // Coordenadas escoba [16]
            {
                {243, 370}, {253, 340}, {343, 340},
                {343, 410}, {253, 410}, {243, 380},
                {243, 370}
            },
            // Coordenadas vestido [17]
            {
                {103, 280}, {163, 280}, {193, 370},
                {193, 380}, {73, 380}, {73, 370},
                {103, 280}
            },
            // Coordenadas brazo izquierdo [18]
            {
                {103, 280}, {43, 350}, {53, 360},
                {92, 315}
            },
            // Coordenadas mano izquierda [19]
            {
                {43, 350}, {33, 360}, {33, 370}, 
                {53, 370}, {53, 360}, {43, 350}
            },
            // Coordenadas brazo derecho [20]
            {
                {163, 280}, {233, 275}, {243, 285},
                {173, 310}, {163, 280}
            },
            // Coordenadas mano derecha [21]
            {
                {233, 275}, {233, 255}, {243, 255},
                {243, 265}, {253, 255}, {263, 275},
                {243, 285}, {233, 275}
            },
            // Coordenadas pierna izquierda [22]
            {
                {93, 380}, {123, 420}, {163, 420},
                {173, 440}, {173, 410}, {133, 410},
                {117, 380}, {93, 380}
            },
            // Coordenadas media pie izquierdo [23]
            {
                {143, 420}, {153, 420}, {153, 410},
                {143, 410}, {143, 420}
            },
            // Coordenadas bota pie izquierdo [24]
            {
                {153, 420}, {163, 420}, {173, 440}, 
                {173, 410}, {153, 410}, {153, 420}
            },
            // Coordenadas pierna derecha [25]
            {
                {137, 380}, {157, 410}, {197, 410}, 
                {207, 430}, {207, 400}, {167, 400},
                {157, 380}, {137, 380}
            }, 
            // Coordenadas media pie derecho [26]
            {
                {177, 410}, {187, 410}, {187, 400},
                {177, 400}, {177, 410}
            }, 
            // Coordenadas bota pie derecho [27]
            {
                {187, 410}, {197, 410}, {207, 430},
                {207, 400}, {187, 400}, {187, 410}
            }
        };

        // Ciclo para colorear las diferentes partes
        for(int i = 0; i < points.length; i++) {
            if(i != 13 && i != 14) {
                Polygon figura = new Polygon();

                for(int j = 0; j < points[i].length; j++) {
                    figura.addPoint(points[i][j][0], points[i][j][1]);
                }

                if(i == 0 || i == 4 || i == 23 || i == 26) {
                    g.setColor(Color.YELLOW);
                } else if(i == 1 || i == 2 || i == 17 || i == 18 || i == 20) {
                    g.setColor(Color.getHSBColor(2.80f, 0.92f, 0.76f));
                } else if(i == 8 || i == 19 || i == 21 || i == 22 || i == 25) {
                    g.setColor(Color.getHSBColor(1.29f, 0.45f, 0.80f));
                } else if(i == 9 || i == 11) {
                    g.setColor(Color.WHITE);
                } else if(i == 15) {
                    g.setColor(Color.getHSBColor(0.10f, 0.58f, 0.75f));
                } else if(i == 16) {
                    g.setColor(Color.getHSBColor(0.15f, 0.98f, 0.85f));
                } else {
                    g.setColor(Color.BLACK);
                }

                g.fillPolygon(figura);
            }
        }

        // Ciclo para dibujar a lineas todo el contorno de la figura
        g.setColor(Color.BLACK);
        for(int i = 0; i < points.length; i++) {
            for(int j = 0; j < points[i].length; j++) {
                g.drawLine(
                    points[i][j][0], 
                    points[i][j][1], 
                    points[i][(j < points[i].length - 1) ? j + 1 : j][0],
                    points[i][(j < points[i].length - 1) ? j + 1 : j][1]
                );
            }
        }
    }
    
    public static void main(String[] args) {
        DibujoLineas appLines = new DibujoLineas();
        appLines.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
