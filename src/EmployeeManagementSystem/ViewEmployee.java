package EmployeeManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class ViewEmployee extends JFrame implements ActionListener {
    JTable table;
    JButton btnSearch, btnBack;
    JTextField tfSearch;
    ViewEmployee(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        btnBack = new JButton("Back");
        btnBack.setBounds(50, 25, 75, 30);
        btnBack.setForeground(Color.white);
        btnBack.setBackground(Color.BLACK);
        btnBack.addActionListener(this);
        add(btnBack);

        JLabel lblSearch = new JLabel("Search By Employee Id :-");
        lblSearch.setBounds(50, 50, 150, 30);
        add(lblSearch);

        tfSearch = new JTextField();
        tfSearch.setBounds(200, 50, 150, 30);
        add(tfSearch);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(400, 50, 150, 30);
        btnSearch.setForeground(Color.white);
        btnSearch.setBackground(Color.BLACK);
        btnSearch.addActionListener(this);
        add(btnSearch);

        table = new JTable();

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 1000,600);
        add(jsp);

        setLocation(300, 100);
        setSize(1015, 700);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == btnSearch){
            setVisible(false);
            new UpdateEmployee(tfSearch.getText());
        }else{
            setVisible(false);
            new Home();
        }
    }


    public static void main(String[] args) {
        new ViewEmployee();
    }
}
