
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalTest extends UnicastRemoteObject implements Cal {

    int a, b;
    JPanel p, p1, p2;
    JLabel x, y, add, Subtract, multiply, divide, addvalue, Subtractvalue, multiplyvalue, dividevalue;
    JTextField xvalue, yvalue;
    JButton send, reset;
    JFrame frame;

    public CalTest() throws RemoteException {
    }

    @Override
    public void GUI() throws RemoteException {

        frame = new JFrame("Calculator");

        p = new JPanel();
        p.setBorder(BorderFactory.createEmptyBorder(30, 30, 15, 30));
        p.setLayout(new GridLayout(0, 1));

        x = new JLabel("Enter X Value");
        xvalue = new JTextField();
        y = new JLabel("Enter Y Value");
        yvalue = new JTextField();
        p.add(x);
        p.add(xvalue);
        p.add(y);
        p.add(yvalue);

        p1 = new JPanel();
        p1.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 30));
        p1.setLayout(new GridLayout(1, 1));

        send = new JButton("Send");
        send.addActionListener((ActionEvent e) -> {
            a = Integer.parseInt(xvalue.getText());
            b = Integer.parseInt(yvalue.getText());

            addvalue.setText(String.valueOf(a + b));
            Subtractvalue.setText(String.valueOf(a - b));
            multiplyvalue.setText(String.valueOf(a * b));
            dividevalue.setText(String.valueOf(a / b));
        });

        reset = new JButton("Reset");
        reset.addActionListener((ActionEvent e) -> {
            xvalue.setText("");
            yvalue.setText("");
            addvalue.setText(String.valueOf(""));
            Subtractvalue.setText(String.valueOf(""));
            multiplyvalue.setText(String.valueOf(""));
            dividevalue.setText(String.valueOf(""));
        });

        p1.add(send);
        p1.add(reset);

        p2 = new JPanel();
        p2.setBorder(BorderFactory.createEmptyBorder(20, 30, 30, 30));
        p2.setLayout(new GridLayout(4, 1));

        add = new JLabel("Add");
        addvalue = new JLabel(" ");
        p2.add(add);
        p2.add(addvalue);

        Subtract = new JLabel("Subtract");
        Subtractvalue = new JLabel(" ");
        p2.add(Subtract);
        p2.add(Subtractvalue);

        multiply = new JLabel("Multiply");
        multiplyvalue = new JLabel(" ");
        p2.add(multiply);
        p2.add(multiplyvalue);

        divide = new JLabel("Divide");
        dividevalue = new JLabel(" ");
        p2.add(divide);
        p2.add(dividevalue);

        frame.add(p, BorderLayout.NORTH);
        frame.add(p1, BorderLayout.CENTER);
        frame.add(p2, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 310);
        //frame.pack();
        frame.setVisible(true);

    }
}
