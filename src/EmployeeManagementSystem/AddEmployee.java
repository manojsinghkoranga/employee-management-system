package EmployeeManagementSystem;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.*;
import java.util.*;

public class AddEmployee extends JFrame implements ActionListener {
    JTextField tfName, tfFatherName, tfDesignation, tfEducation, tfPhone, tfEmail, tfVillage, tfPostOffice, tfCity, tfState, tfPostalCode, tfAadhaar;
    JLabel id;
    JDateChooser dcDateOfBirth;
    JButton btnAddEmployee, btnBack;

    Random r = new Random();
    int employeeId = r.nextInt(999999);
    AddEmployee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Add Employee Details");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        add(heading);

        JLabel lblEmployeeId = new JLabel("Employee Id :");
        lblEmployeeId.setBounds(50, 100, 150, 30);
        lblEmployeeId.setFont(new Font("SAN_SARIF", Font.PLAIN, 20));
        add(lblEmployeeId);

        id = new JLabel(" "+employeeId);
        id.setBounds(200, 100, 150, 30);
        id.setFont(new Font("SAN_SARIF", Font.PLAIN, 20));
        add(id);

        JLabel labelName = new JLabel("Name : ");
        labelName.setBounds(50, 150, 150, 30);
        labelName.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelName);

        tfName = new JTextField();
        tfName.setBounds(200, 150, 150, 30);
        add(tfName);

        JLabel labelFatherName = new JLabel("Father's Name :");
        labelFatherName.setBounds(400, 150, 150, 30);
        labelFatherName.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelFatherName);

        tfFatherName = new JTextField();
        tfFatherName.setBounds(550, 150, 150, 30);
        add(tfFatherName);

        JLabel labelDob = new JLabel("Date of Birth : ");
        labelDob.setBounds(50, 200, 150, 30);
        labelDob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelDob);

        dcDateOfBirth = new JDateChooser();
        dcDateOfBirth.setBounds(200, 200, 150, 30);
        add(dcDateOfBirth);

        JLabel labelDesignation = new JLabel("Designation :");
        labelDesignation.setBounds(400, 200, 150, 30);
        labelDesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelDesignation);

        tfDesignation = new JTextField();
        tfDesignation.setBounds(550, 200, 150, 30);
        add(tfDesignation);

        JLabel labelPhone = new JLabel("Phone.No :");
        labelPhone.setBounds(50, 250, 150, 30);
        labelPhone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelPhone);

        tfPhone = new JTextField();
        tfPhone.setBounds(200, 250, 150, 30);
        add(tfPhone);

        JLabel labelEmail = new JLabel("Email :");
        labelEmail.setBounds(400, 250, 150, 30);
        labelEmail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelEmail);

        tfEmail = new JTextField();
        tfEmail.setBounds(550, 250, 150, 30);
        add(tfEmail);

        JLabel labelEducation = new JLabel("Highest Edu. :");
        labelEducation.setBounds(50, 300, 150, 30);
        labelEducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelEducation);

        tfEducation = new JTextField();
        tfEducation.setBounds(200, 300, 150, 30);
        add(tfEducation);

        JLabel labelAadhaar = new JLabel("Aadhaar No. :");
        labelAadhaar.setBounds(400, 300, 150, 30);
        labelAadhaar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelAadhaar);

        tfAadhaar = new JTextField();
        tfAadhaar.setBounds(550, 300, 150, 30);
        add(tfAadhaar);

        JLabel labelAddress = new JLabel("Address");
        labelAddress.setBounds(50, 350, 150, 30);
        labelAddress.setFont(new Font("serif", Font.PLAIN, 25));
        add(labelAddress);

        JLabel labelVillage = new JLabel("Village :");
        labelVillage.setBounds(50, 400, 150, 30);
        labelVillage.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelVillage);

        tfVillage = new JTextField();
        tfVillage.setBounds(200, 400, 150, 30);
        add(tfVillage);

        JLabel labelPostOffice = new JLabel("P.o :");
        labelPostOffice.setBounds(400, 400, 150, 30);
        labelPostOffice.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelPostOffice);

        tfPostOffice = new JTextField();
        tfPostOffice.setBounds(550, 400, 150, 30);
        add(tfPostOffice);

        JLabel labelCity = new JLabel("City :");
        labelCity.setBounds(50, 450, 150, 30);
        labelCity.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelCity);

        tfCity = new JTextField();
        tfCity.setBounds(200, 450, 150, 30);
        add(tfCity);

        JLabel labelState = new JLabel("State :");
        labelState.setBounds(400, 450, 150, 30);
        labelState.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelState);

        tfState = new JTextField();
        tfState.setBounds(550, 450, 150, 30);
        add(tfState);

        JLabel labelPostalCode = new JLabel("Postal Code :");
        labelPostalCode.setBounds(50, 500, 150, 30);
        labelPostalCode.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelPostalCode);

        tfPostalCode = new JTextField();
        tfPostalCode.setBounds(200, 500, 150, 30);
        add(tfPostalCode);

        btnAddEmployee = new JButton("Add Employee");
        btnAddEmployee.setBounds(250, 570, 150, 40);
        btnAddEmployee.addActionListener(this);
        btnAddEmployee.setBackground(Color.BLACK);
        btnAddEmployee.setForeground(Color.white);
        add(btnAddEmployee);

        btnBack = new JButton("Back");
        btnBack.setBounds(500, 570, 150, 40);
        btnBack.addActionListener(this);
        btnBack.setBackground(Color.BLACK);
        btnBack.setForeground(Color.white);
        add(btnBack);
        
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == btnAddEmployee){
            String name = tfName.getText();
            String fName = tfFatherName.getText();
            String dob = ((JTextField) dcDateOfBirth.getDateEditor().getUiComponent()).getText();
            String designation = tfDesignation.getText();
            String phoneNum = tfPhone.getText();
            String email = tfEmail.getText();
            String higherEdu = tfEducation.getText();
            String aadhaar = tfAadhaar.getText();
            String village = tfVillage.getText();
            String postOff = tfPostOffice.getText();
            String city = tfCity.getText();
            String state = tfState.getText();
            String postalCode = tfPostalCode.getText();
            String employeeId = id.getText();

            try{
                Conn conn = new Conn();
                String query = "insert into employee values('"+employeeId+"','"+name+"', '"+fName+"', '"+dob+"','"+designation+"', '"+phoneNum+"','"+email+"','"+higherEdu+"', '"+aadhaar+"', '"+village+"','"+postOff+"','"+city+"', '"+state+"', '"+postalCode+"' )";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
            new Home();
        }
    }
    public static void main(String[] args) {
        new AddEmployee();
    }
}
