import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/18.
 */
public class FontFrameMain {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame frame = new FontFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Font Frame Main");
            frame.setVisible(true);
        });
    }
}
