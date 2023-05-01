package EmployeeManagementSystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.util.Random;
import java.awt.event.*;
import java.util.*;

public class UpdateEmployee extends JFrame implements ActionListener{
    JTextField tfDesignation, tfPhone, tfEmail, tfVillage, tfPostOffice, tfCity, tfState, tfPostalCode, tfEducation;
    JComboBox cbEducation;
    JLabel id, lblName, lblFatherName, lblDateOfBirth, lblAadhaar;
    JButton btnUpdateEmployee, btnBack, btnDelete;
    String employeeId;
    UpdateEmployee(String employeeId){
        this.employeeId = employeeId;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Update Employee Details");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        add(heading);

        JLabel lblEmployeeId = new JLabel("Employee Id :");
        lblEmployeeId.setBounds(50, 100, 150, 30);
        lblEmployeeId.setFont(new Font("SAN_SARIF", Font.PLAIN, 20));
        add(lblEmployeeId);

        id = new JLabel(employeeId);
        id.setBounds(200, 100, 150, 30);
        id.setFont(new Font("SAN_SARIF", Font.PLAIN, 20));
        add(id);

        JLabel labelName = new JLabel("Name : ");
        labelName.setBounds(50, 150, 150, 30);
        labelName.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelName);

        lblName = new JLabel();
        lblName.setBounds(200, 150, 150, 30);
        lblName.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblName);

        JLabel labelFatherName = new JLabel("Father's Name :");
        labelFatherName.setBounds(400, 150, 150, 30);
        labelFatherName.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelFatherName);

        lblFatherName = new JLabel();
        lblFatherName.setBounds(550, 150, 150, 30);
        lblFatherName.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblFatherName);

        JLabel labelDob = new JLabel("Date of Birth : ");
        labelDob.setBounds(50, 200, 150, 30);
        labelDob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelDob);

        lblDateOfBirth = new JLabel();
        lblDateOfBirth.setBounds(200, 200, 150, 30);
        lblDateOfBirth.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblDateOfBirth);

        JLabel labelDesignation = new JLabel("Designation :");
        labelDesignation.setBounds(400, 200, 150, 30);
        labelDesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelDesignation);

        tfDesignation = new JTextField();
        tfDesignation.setBounds(550, 200, 150, 30);
        tfDesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfDesignation);

        JLabel labelPhone = new JLabel("Phone.No :");
        labelPhone.setBounds(50, 250, 150, 30);
        labelPhone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelPhone);

        tfPhone = new JTextField();
        tfPhone.setBounds(200, 250, 150, 30);
        tfPhone.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfPhone);

        JLabel labelEmail = new JLabel("Email :");
        labelEmail.setBounds(400, 250, 150, 30);
        labelEmail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelEmail);

        tfEmail = new JTextField();
        tfEmail.setBounds(550, 250, 150, 30);
        tfEmail.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfEmail);

        JLabel labelEducation = new JLabel("Highest Edu. :");
        labelEducation.setBounds(50, 300, 150, 30);
        labelEducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelEducation);

        tfEducation = new JTextField();
        tfEducation.setBounds(200, 300, 150, 30);
        tfEducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfEducation);

        JLabel labelAadhaar = new JLabel("Aadhaar No. :");
        labelAadhaar.setBounds(400, 300, 150, 30);
        labelAadhaar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelAadhaar);

        lblAadhaar = new JLabel();
        lblAadhaar.setBounds(550, 300, 150, 30);
        lblAadhaar.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblAadhaar);

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
        tfVillage.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfVillage);

        JLabel labelPostOffice = new JLabel("P.o :");
        labelPostOffice.setBounds(400, 400, 150, 30);
        labelPostOffice.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelPostOffice);

        tfPostOffice = new JTextField();
        tfPostOffice.setBounds(550, 400, 150, 30);
        tfPostOffice.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfPostOffice);

        JLabel labelCity = new JLabel("City :");
        labelCity.setBounds(50, 450, 150, 30);
        labelCity.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelCity);

        tfCity = new JTextField();
        tfCity.setBounds(200, 450, 150, 30);
        tfCity.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfCity);

        JLabel labelState = new JLabel("State :");
        labelState.setBounds(400, 450, 150, 30);
        labelState.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelState);

        tfState = new JTextField();
        tfState.setBounds(550, 450, 150, 30);
        tfState.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfState);

        JLabel labelPostalCode = new JLabel("Postal Code :");
        labelPostalCode.setBounds(50, 500, 150, 30);
        labelPostalCode.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelPostalCode);

        tfPostalCode = new JTextField();
        tfPostalCode.setBounds(200, 500, 150, 30);
        tfPostalCode.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfPostalCode);

        btnBack = new JButton("Back");
        btnBack.setBounds(100, 570, 150, 40);
        btnBack.setBackground(Color.BLACK);
        btnBack.setForeground(Color.white);
        btnBack.addActionListener(this);
        add(btnBack);

        btnUpdateEmployee = new JButton("Update Employee");
        btnUpdateEmployee.setBounds(375, 570, 150, 40);
        btnUpdateEmployee.addActionListener(this);
        btnUpdateEmployee.setBackground(Color.BLACK);
        btnUpdateEmployee.setForeground(Color.white);
        add(btnUpdateEmployee);

        btnDelete = new JButton("Delete Employee");
        btnDelete.setBounds(650, 570, 150, 40);
        btnDelete.addActionListener(this);
        btnDelete.setBackground(Color.BLACK);
        btnDelete.setForeground(Color.white);
        add(btnDelete);

        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);

        try{
            String query = "Select * from employee where employee_id = "+ this.employeeId;
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                lblName.setText(rs.getString("name"));
                lblFatherName.setText(rs.getString("fathers_name"));
                lblDateOfBirth.setText(rs.getString("dob"));
                lblAadhaar.setText(rs.getString("aadhaar_no"));
                tfDesignation.setText(rs.getString("designation"));
                tfEducation.setText(rs.getString("highest_education"));
                tfEmail.setText(rs.getString("email"));
                tfPhone.setText(rs.getString("Phone_no"));
                tfVillage.setText(rs.getString("vill"));
                tfPostOffice.setText(rs.getString("post_office"));
                tfCity.setText(rs.getString("city"));
                tfState.setText(rs.getString("state"));
                tfPostalCode.setText(rs.getString("postal_code"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == btnBack){
            setVisible(false);
            new ViewEmployee();
        }else if(ae.getSource() == btnUpdateEmployee){
            String query = "Update employee set designation='"+tfDesignation.getText()+"', Phone_no='"+tfPhone.getText()+"', email='"+tfEmail.getText()+"', highest_education='"+tfEducation.getText()+"', vill='"+tfVillage.getText()+"', post_office='" +tfPostOffice.getText()+"', city='"+tfCity.getText()+"', state='"+tfState.getText()+"', postal_code='"+tfPostalCode.getText()+"' where employee_id = "+this.employeeId;
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
            }catch (Exception e) {
                e.printStackTrace();
            }
            setVisible(false);
            new ViewEmployee();
        }else{
            String query = "delete from employee where employee_id=" + employeeId;

            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
            }catch (Exception e){
                e.printStackTrace();
            }

            setVisible(false);
            new ViewEmployee();
        }
    }

    public static void main(String[] args) {

    }
}
