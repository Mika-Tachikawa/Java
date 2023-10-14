package test55;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.function.Consumer;

public class Diff {
    public static void main(String[] args) {
        JFrame f = new JFrame("差分プログラミング");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BufferedImage img = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = img.createGraphics();
        g.clearRect(0, 0, 600, 400);
        drawImage(g, lineImage(), 10, 10, f);
        drawImage(g, rectImage(), 300, 80, f);  // 正しいメソッド名 "rectImage()" を使用
        JLabel label = new JLabel(new ImageIcon(img));
        f.add(label);
        f.pack();
        f.setVisible(true);
    }

    static BufferedImage lineImage() {
        BufferedImage image = new BufferedImage(250, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        graphics.drawRect(10, 10, 220, 180);
        return image;
    }

    static BufferedImage rectImage() {  // メソッド名を "rectImage()" に修正
        BufferedImage image = new BufferedImage(250, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        graphics.drawRect(10, 10, 220, 180);
        return image;
    }

    static void drawImage(Graphics2D g, BufferedImage image, int x, int y, JFrame f) {
        g.drawImage(image, x, y, f);
    }
}