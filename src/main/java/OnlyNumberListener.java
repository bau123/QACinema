import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class OnlyNumberListener implements KeyListener{

    private JTextField textField;

    public OnlyNumberListener(JTextField textField){
        this.textField = textField;
    }
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == '0' || e.getKeyChar() == '1' || e.getKeyChar() == '2' || e.getKeyChar() == '3' || e.getKeyChar() == '4' || e.getKeyChar() == '5' |e.getKeyChar() == '6'
                ||e.getKeyChar() == '7' ||e.getKeyChar() == '8' || e.getKeyChar() == '9')
        {

        } else {
            e.consume();
        }
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
}
