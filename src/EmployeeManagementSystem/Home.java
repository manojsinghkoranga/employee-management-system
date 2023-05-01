package EmployeeManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {
    JButton addButton, viewButton, updateButton, removeButton;
    Home(){
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/Marketing-Management.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1200, 650);
        add(image);

        JLabel Heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        Heading.setBounds(620, 25, 450, 25);
        Heading.setFont(new Font("serif", Font.PLAIN, 25));
        Heading.setForeground(Color.BLACK);
        image.add(Heading);

        addButton = new JButton("Add Employee");
        addButton.setBounds(650, 100, 150, 40);
        addButton.addActionListener(this);
        image.add(addButton);

        viewButton = new JButton("View Employee");
        viewButton.setBounds(850, 100, 150, 40);
        viewButton.addActionListener(this);
        image.add(viewButton);

        updateButton = new JButton("Update Employee");
        updateButton.setBounds(650, 150, 150, 40);
        updateButton.addActionListener(this);
        image.add(updateButton);

        removeButton = new JButton("Remove Employee");
        removeButton.setBounds(850, 150, 150, 40);
        removeButton.addActionListener(this);
        image.add(removeButton);

        setSize(1200, 650);
        setLocation(250, 100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addButton){
            setVisible(false);
            new AddEmployee();
        }else{
            setVisible(false);
            new ViewEmployee();
        }
    }
    public static void main(String[] args) {
        new Home();
    }
}
