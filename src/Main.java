import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main extends JFrame {
    static  JFrame frame = new JFrame();
    static JLayeredPane pane = new JLayeredPane();
    public static void changeCursor(MouseEvent e){

        pane.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    public static void defaultCursor(MouseEvent e){
        pane.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }


    public static void main(String[] args) throws IOException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Простой курсор");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int width = 800, height = 800;
        frame.setBounds(dimension.width/2-width/2,dimension.height/2-height/2,width,height);
        pane.setFocusable(true);
        frame.add(pane);
        pane.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e){
                changeCursor(e);
            }
            public void mouseExited(MouseEvent e){
                defaultCursor(e);
            }
        });
        frame.setVisible(true);

    }
}