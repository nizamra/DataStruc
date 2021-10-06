import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {

    // public void paintComponent(Graphics g) {
    //     g.setColor(Color.orange);
    //     g.fillRect(20, 50, 100, 100);
    // }



// Display a JPEG
// public void paintComponent(Graphics g) {
//     Image image = new ImageIcon("catzilla.jpg").getImage();
//     Image image = new ImageIcon(getClass().getResource("catzilla.jpg")).getImage();
//     g.drawImage(image,3,4,this);
//     3 pixels from the left edge of the panel and 4 pixels from the top edge of the panel”. These numbers are always relative to the widget 
//}


// Paint a randomly-colored circle on a black background
// public void paintComponent(Graphics g) {
//     g.fillRect(0,0,this.getWidth(), this.getHeight());
//     int red = (int) (Math.random() * 256);
//     int green = (int) (Math.random() * 256);
//     int blue = (int) (Math.random() * 256);
//     Color randomColor = new Color(red, green, blue);
//     g.setColor(randomColor);
//     g.fillOval(70,70,100,100);
//     start 70 pixels from the left, 70 from the top, make it 100 pixels wide, and 100 pixels tall.
// }


// gradient blend color
// public void paintComponent(Graphics g) {
//     Graphics2D g2d = (Graphics2D) g;
//     GradientPaint gradient = new GradientPaint(70,70,Color.blue, 150,150, Color.orange);
//     g2d.setPaint(gradient);
//     g2d.fillOval(70,70,100,100);
//}

// Same Same random colors
public void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    int red = (int) (Math.random() * 256);
    int green = (int) (Math.random() * 256);
    int blue = (int) (Math.random() * 256);
    Color startColor = new Color(red, green, blue);
    red = (int) (Math.random() * 256);
    green = (int) (Math.random() * 256);
    blue = (int) (Math.random() * 256);
    Color endColor = new Color(red, green, blue);
    GradientPaint gradient = new GradientPaint(70,70,startColor, 150,150, endColor);
    g2d.setPaint(gradient);
    g2d.fillOval(70,70,100,100);
   }
}