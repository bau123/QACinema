import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDeal implements ActionListener{

    JRadioButton mon, tues, wed, thurs, fri, sat, sun;


    public ButtonDeal(JRadioButton btn1,JRadioButton btn2,JRadioButton btn3,JRadioButton btn4,JRadioButton btn5,JRadioButton btn6,JRadioButton btn7) {
        mon =  btn1;
        tues = btn2;
        wed = btn3;
        thurs = btn4;
        fri = btn5;
        sat = btn6;
        sun = btn7;
    }


    public void actionPerformed(ActionEvent e) {
        JRadioButton btn = (JRadioButton) e.getSource();
        if (btn.getText() == "Monday"){
            GUI.wedDeal = false;
        }
        if (btn.getText() == "Tuesday"){
            GUI.wedDeal = false;
        }
        if (btn.getText() == "Wednesday"){
            GUI.wedDeal = true;
        }
        if (btn.getText() == "Thursday"){
            GUI.wedDeal = false;
        }
        if (btn.getText() == "Friday"){
            GUI.wedDeal = false;
        }
        if (btn.getText() == "Saturday"){
            GUI.wedDeal = false;
        }
        if (btn.getText() == "Sunday"){
            GUI.wedDeal = false;
        }

    }
}

