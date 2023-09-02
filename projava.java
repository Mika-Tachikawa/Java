package projava;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTexField;

public class SampleForm {
  
  public static void main(String[] args) {
  
   var frame = new JFrame("test");
   frame.setSize(600,400);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
   var test1 = new JTextField();
   frame.add("North",text1);
   
   var text2 = new JTextField();
   frame.add("South",text2);
   
   var button = new JButton("大文字");
   frame.add(button);
   
   button.addActionListener(se ->
    text2.setText(text1.getText().toUpperCase()));
    
   frame.setVisible(true);
  }
  
}