import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GUI extends JFrame{

    public static boolean wedDeal;
    private int stnAmount;
    private int OAPAmount;
    private int studentAmount;
    private int childAmount;

    private final static String STANDARD = "Standard: £8";
    private final static String OAP = "OAP £6";
    private final static String STUDENT = "Student £6";
    private final static String CHILD = "Child £4";

    public GUI(){
        setLayout(new GridLayout(7,1));


        add(getPanelHeader());

        add(getPanelTicket(STANDARD));
        add(getPanelTicket(OAP));
        add(getPanelTicket(STUDENT));
        add(getPanelTicket(CHILD));
        add(getPanelDay());
        add(getResultPanel());

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    private JPanel getPanelHeader(){
        JLabel labelTicketPrice, labelAmount, labelFakePad;

        labelTicketPrice = new JLabel("Ticket Prices");
        labelFakePad = new JLabel("         ");
        labelAmount = new JLabel("Amount to buy");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(labelTicketPrice);
        panel.add(labelFakePad);
        panel.add(labelAmount);
        return panel;
    }

    private JPanel getPanelTicket(final String ticketType) {
        JPanel panel = new JPanel();
        JLabel labelFakePad = new JLabel("          ");
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel(ticketType);
        final JTextField textField = new JTextField(10);
        textField.setText("0");
        textField.addKeyListener(new OnlyNumberListener(textField) {

            @Override
            public void keyReleased(KeyEvent e) {
                try {
                    if (ticketType == STANDARD) {
                        stnAmount = Integer.parseInt(textField.getText());

                    }
                    if (ticketType == OAP) {
                        OAPAmount = Integer.parseInt(textField.getText());
                        System.out.println(OAPAmount);
                    }
                    if (ticketType == STUDENT) {
                        studentAmount = Integer.parseInt(textField.getText());
                        System.out.println(studentAmount);
                    }
                    if (ticketType == CHILD) {
                        childAmount = Integer.parseInt(textField.getText());
                        System.out.println(childAmount);
                    }
                } catch (Exception useless) {
                    //Maybe add pop up to warn user
                    System.out.println("Only text Please");
                }

            }
        });
        panel.add(label);
        panel.add(labelFakePad);
        panel.add(textField);
        return panel;
    }
    private JPanel getPanelDay(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JRadioButton mon, tues, wed, thurs, fri, sat, sun;
        ButtonGroup buttonGroup;
        mon = new JRadioButton("Monday");
        tues = new JRadioButton("Tuesday");
        wed = new JRadioButton("Wednesday");
        thurs = new JRadioButton("Thursday");
        fri = new JRadioButton("Friday");
        sat = new JRadioButton("Saturday");
        sun = new JRadioButton("Sunday");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(mon);
        buttonGroup.add(tues);
        buttonGroup.add(wed);
        buttonGroup.add(thurs);
        buttonGroup.add(fri);
        buttonGroup.add(sat);
        buttonGroup.add(sun);

        ButtonDeal listener = new ButtonDeal(mon,tues,wed,thurs,fri,sat,sun);
        mon.addActionListener(listener);
        tues.addActionListener(listener);
        wed.addActionListener(listener);
        thurs.addActionListener(listener);
        fri.addActionListener(listener);
        sat.addActionListener(listener);
        sun.addActionListener(listener);


        panel.add(mon);
        panel.add(tues);
        panel.add(wed);
        panel.add(thurs);
        panel.add(fri);
        panel.add(sat);
        panel.add(sun);
        return panel;

    }
    private JPanel getResultPanel(){
        JLabel labelFakePad = new JLabel("      ");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton btn = new JButton("Get my price");
        final JLabel answer = new JLabel("Result");
        panel.add(btn);
        panel.add(labelFakePad);
        panel.add(answer);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                answer.setText(getTotalPrice());
            }
        });
        return panel;
    }
    private String getTotalPrice(){
        String total;
        int i = 0;
        if (wedDeal){
            i = -2;
        }
        int stn = 8 * stnAmount;
        int OAP = 6 * OAPAmount;
        int student = 6 * studentAmount;
        int child = 4 * childAmount;
        i = stn + OAP + student + child + i;
        if (stn == 0 && OAP == 0 && student == 0 && child == 0){
            i = 0;
        }
        total = "Total cost: £" +i;
        return total;
    }
}
