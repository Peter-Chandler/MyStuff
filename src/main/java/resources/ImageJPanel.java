package resources;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageJPanel extends javax.swing.JPanel {
    private BufferedImage image;
    private int offsetX;
    private int offsetY;

    public ImageJPanel() {
        setBackground(new java.awt.Color(255, 255, 255));
    }
    
    public void displayImage(BufferedImage image, int offsetX, int offsetY) {
        this.image = image;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, offsetX, offsetY, null);
    }

}
