package test55;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.function.Consumer;

public class Diff {
  public static void main(String[] args){
    var f = new JFrame("差分プログラミング");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    var img = new BufferedImage(600,400,BufferedImage.TYPE_INT_RGB);
    var g = img.createGraphics();
    g.clearRect(0,0,600,400);
    g.drewImage(lineImage(),10,10,f);
    g.drewImage(rectImage(),300,80,f);
    var label = new JLabel(new ImageIcon(img));
    f.add(label);
    f.pack();
    f.setVisible(true);
  }
  
  static BufferedImage lineImage(){
    var image = new BufferedImage(250,200,BufferedImage.TYPE_INT_RGB);
    var graphics = image.createGraphics();
    graphics.drawRect(10,10,220,180);
    return image;
  }
}