package EmployeeManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    Main() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel Heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        Heading.setBounds(250, 25, 800, 40);
        Heading.setFont(new Font("serif", Font.PLAIN, 40));
        Heading.setForeground(Color.BLACK);
        add(Heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/Marketing-Management.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1200, 650);
        add(image);

        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setFont(new Font("serif", Font.BOLD, 20));
        clickhere.addActionListener(this);
        image.add(clickhere);

        setSize(1200, 650);
        setLocation(400, 200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Main();
    }
}
