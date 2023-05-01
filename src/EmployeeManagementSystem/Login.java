package EmployeeManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField tfusername, tfpassword;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 30);
        add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 30);
        add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 30);
        add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(150, 70, 150, 30);
        add(tfpassword);

        JButton Login = new JButton("LOGIN");
        Login.setBounds(150, 120, 150, 30);
        Login.setForeground(Color.white);
        Login.setBackground(Color.BLACK);
        Login.addActionListener(this);
        add(Login);

        setSize(600, 350);
        setLocation(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        try{
            String username = tfusername.getText();
            String password = tfpassword.getText();

            Conn c = new Conn();
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";

            ResultSet rs = c.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Home();
            }else{
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);
                new Login();
            }
        }catch(Exception e){

        }
    }
    public static void main(String[] args) {

        new Login();
    }
}
