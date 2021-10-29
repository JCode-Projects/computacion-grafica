package develop;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

public class DibujoImagenesAcopladas extends JFrame {
    public DibujoImagenesAcopladas() {
        super("Dibujo Imagenes Acopladas");
        setSize(430, 380);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(1.0f));

        // -- Dibujo del sol --
        g2.drawOval(35, 60, 40, 40);

        Polygon triangleOne = new Polygon();
        triangleOne.addPoint(55, 40);
        triangleOne.addPoint(63, 55);
        triangleOne.addPoint(47, 55);
        g2.drawPolygon(triangleOne);

        Polygon triangleTwo = new Polygon();
        triangleTwo.addPoint(55, 120);
        triangleTwo.addPoint(63, 105);
        triangleTwo.addPoint(47, 105);
        g2.drawPolygon(triangleTwo);

        Polygon triangleThree = new Polygon();
        triangleThree.addPoint(15, 80);
        triangleThree.addPoint(30, 72);
        triangleThree.addPoint(30, 88);
        g2.drawPolygon(triangleThree);

        Polygon triangleFour = new Polygon();
        triangleFour.addPoint(95, 80);
        triangleFour.addPoint(80, 72);
        triangleFour.addPoint(80, 88);
        g2.drawPolygon(triangleFour);

        Polygon triangleFive = new Polygon();
        triangleFive.addPoint(25, 50);
        triangleFive.addPoint(44, 54);
        triangleFive.addPoint(32, 68);
        g2.drawPolygon(triangleFive);

        Polygon triangleSix = new Polygon();
        triangleSix.addPoint(82, 53);
        triangleSix.addPoint(67, 56);
        triangleSix.addPoint(78, 68);
        g2.drawPolygon(triangleSix);

        Polygon triangleSeven = new Polygon();
        triangleSeven.addPoint(32, 93);
        triangleSeven.addPoint(44, 105);
        triangleSeven.addPoint(28, 108);
        g2.drawPolygon(triangleSeven);

        Polygon triangleEight = new Polygon();
        triangleEight.addPoint(79, 92);
        triangleEight.addPoint(83, 106);
        triangleEight.addPoint(67, 105);
        g2.drawPolygon(triangleEight);

        // -- Dibujo de linea que pasa toda la pantalla horizontalmente debajo del sol --
        g2.drawLine(20, 140, 395, 140);

        // -- Dibujo del primer árbol --
        g2.drawRect(40, 209, 20, 25);
        g2.drawOval(20, 150, 60, 60);

        // -- Dibujo del segundo árbol --
        g2.drawOval(40, 250, 30, 30);
        Polygon troncoSegundoArbol = new Polygon();
        troncoSegundoArbol.addPoint(55, 278);
        troncoSegundoArbol.addPoint(63, 303);
        troncoSegundoArbol.addPoint(47, 303);
        g2.drawPolygon(troncoSegundoArbol);

        // -- Dibujo del tercer árbol --
        g2.drawOval(90, 270, 30, 30);
        Polygon troncoTercerArbol = new Polygon();
        troncoTercerArbol.addPoint(105, 300);
        troncoTercerArbol.addPoint(98, 320);
        troncoTercerArbol.addPoint(115, 320);
        g2.drawPolygon(troncoTercerArbol);

        // -- Dibujo del cuarto árbol --
        Polygon ramasCuartoArbol = new Polygon();
        ramasCuartoArbol.addPoint(130, 170);
        ramasCuartoArbol.addPoint(170, 230);
        ramasCuartoArbol.addPoint(90, 230);
        g2.drawPolygon(ramasCuartoArbol);
        g2.drawRect(115, 230, 30, 25);

        // -- Dibujo de la primer casa --
        g2.drawRect(180, 110, 100, 100);

        // - Dibujo de las tres ventanas de la primer casa --
        g2.drawRect(190, 130, 20, 20);
        g2.drawRect(220, 130, 20, 20);
        g2.drawRect(250, 130, 20, 20);

        // -- Dibujo de la puerta de la primer casa --
        g2.drawRect(200, 180, 30, 30);

        // Dibujo de la chimenea de la primer casa --
        g2.drawRect(240, 85, 25, 25);
        g2.drawOval(245, 90, 15, 15);

        // -- Dibujo de la segunda casa --
        g2.drawRect(265, 175, 70, 70);

        // -- Dibujo de la ventana de la segunda casa --
        g2.drawOval(305, 185, 20, 20);

        // -- Dibujo de la puerta de la segunda casa --
        g2.drawRect(280, 220, 25, 25);

        // -- Dibujo del techo de la segunda casa --
        Polygon techoSegundaCasa = new Polygon();
        techoSegundaCasa.addPoint(300, 120);
        techoSegundaCasa.addPoint(360, 175);
        techoSegundaCasa.addPoint(240, 175);
        g2.drawPolygon(techoSegundaCasa);

        // -- Dibujo de la tercer casa --
        g2.drawRect(270, 75, 80, 90);

        // -- Dibujo de la ventana de la tercer casa --
        g2.drawRect(285, 85, 20, 20);

        // -- Dibujo de las otras dos ventanas en vertical de la tercer casa --
        g2.drawRect(330, 85, 10, 10);
        g2.drawRect(330, 105, 10, 10);

        // Dibujo del techo de la tercer casa --
        Polygon techoTercerCasa = new Polygon();
        techoTercerCasa.addPoint(310, 50);
        techoTercerCasa.addPoint(370, 75);
        techoTercerCasa.addPoint(250, 75);
        g2.drawPolygon(techoTercerCasa);

        // Dibujo del tren en la parte inferior de las casas --
        // -- Dibujo de la cara del tren --
        Polygon caraTren = new Polygon();
        caraTren.addPoint(185, 300);
        caraTren.addPoint(202, 300);
        caraTren.addPoint(202, 288);
        g2.drawPolygon(caraTren);

        // -- Dibujo de la cabeza del tren --
        g2.drawRect(202, 277, 23, 23);

        // -- Dibujo de la parte de la cabeza grande del tren --
        g2.drawRect(225, 270, 30, 30);

        // -- Dibujo de la chimenea del tren --
        g2.drawRect(230, 250, 20, 20);
        g2.drawRect(235, 255, 10, 10);

        // -- Dibujo de las dos ruedas de la cabeza y cara del tren --
        g2.drawOval(204, 290, 20, 20);
        g2.drawOval(230, 290, 20, 20);

        // Dibujo del separador de vagones del tren --
        g2.drawRect(255, 280, 5, 5);

        // -- Dibujo del segundo vagon del tren --
        g2.drawRect(260, 270, 30, 30);
        g2.drawRect(290, 270, 30, 30);

        // -- Dibujo de las ruedas del segundo vagon del tren --
        g2.drawOval(265, 290, 20, 20);
        g2.drawOval(295, 290, 20, 20);

        // Dibujo del separador de vagones del tren --
        g2.drawRect(320, 280, 5, 5);

        // -- Dibujo del tercer vagon del tren --
        g2.drawRect(325, 270, 30, 30);
        g2.drawRect(355, 270, 30, 30);

        // -- Dibujo de las ruedas del tercer vagon del tren --
        g2.drawOval(330, 290, 20, 20);
        g2.drawOval(360, 290, 20, 20);


    }

    public static void main(String[] args) {
        DibujoImagenesAcopladas appImage = new DibujoImagenesAcopladas();
        appImage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}