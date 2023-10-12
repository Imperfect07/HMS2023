package hotel.management.system;


import java.awt.EventQueue;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AddEmployee extends JFrame implements ActionListener { 
    JTextField tfage,tfname,tfsalary,textField_4,textField_5,textField_6;
        JComboBox cbjob;JRadioButton rbmale,rbFemale;
        JButton s;
        AddEmployee(){
           setLayout(null);
          
            setTitle("ADD EMPLOYEE DETAILS"); 
		 
           setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
           setSize(778,486);
           getContentPane().setLayout(null);
           setLayout(null);
			
            JLabel lblname = new JLabel("NAME");
            lblname.setFont(new Font("Tahoma", Font.PLAIN, 17));
            lblname.setBounds(60, 30, 150, 27);
            add(lblname);
           
         tfname = new JTextField();
            tfname.setBounds(200, 30, 150, 27);
            add(tfname);
			
          //   JButton Next = new JButton("SAVE");
            //Next.setBounds(200, 420, 150, 30);
            //Next.setBackground(Color.BLACK);
           // Next.setForeground(Color.WHITE);
            //add(Next);
			
            JLabel lblage = new JLabel("AGE");
            lblage.setFont(new Font("Tahoma", Font.PLAIN, 17));
            lblage.setBounds(60, 80, 150, 27);
            add(lblage);
			
         tfage = new JTextField();
            tfage.setBounds(200, 70, 150, 27);
            add(tfage);
            
            JLabel lblGender = new JLabel("GENDER");
           lblGender.setFont(new Font("Tahoma", Font.PLAIN, 17));
           lblGender.setBounds(60, 120, 150, 27);
            add(lblGender);
		
            rbmale = new JRadioButton("MALE");
            rbmale.setBackground(Color.WHITE);
            rbmale.setBounds(200, 120, 70, 27);
            add(rbmale);
	
            rbFemale = new JRadioButton("FEMALE");
            rbFemale.setBackground(Color.WHITE);
            rbFemale.setBounds(280, 120, 70, 27);
            add(rbFemale);
            
            ButtonGroup bg = new ButtonGroup();
            bg.add(rbmale);
            bg.add(rbmale);
            
            JLabel lbljob = new JLabel("JOB");
            lbljob.setFont(new Font("Tahoma", Font.PLAIN, 17));
            lbljob.setBounds(60, 170, 150, 27);
            add(lbljob);
			
            String str[] = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
            cbjob = new JComboBox(str);
            cbjob.setBackground(Color.WHITE);
            cbjob.setBounds(200,170,150,30);
            add(cbjob);
            		
            JLabel lblsalary = new JLabel("SALARY");
            lblsalary.setFont(new Font("Tahoma", Font.PLAIN, 17));
            lblsalary.setBounds(60, 220, 150, 27);
            add(lblsalary);
            
	 tfsalary = new JTextField();
            tfsalary.setBounds(200, 230, 150, 27);
            add(tfsalary);
            
	
            JLabel lblphone = new JLabel("PHONE");
            lblphone.setFont(new Font("Tahoma", Font.PLAIN, 17));
       lblphone.setBounds(60, 270, 150, 27);
            add(lblphone);
	
            textField_4 = new JTextField();
            textField_4.setBounds(200, 270, 150, 27);
            add(textField_4);
	
            JLabel Phno = new JLabel("AADHAR");
            Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Phno.setBounds(60, 320, 150, 27);
            add(Phno);
			
            textField_5 = new JTextField();
            textField_5.setBounds(200, 320, 150, 27);
            add(textField_5);
	
            
            JLabel email = new JLabel("EMAIL");
            email.setFont(new Font("Tahoma", Font.PLAIN, 17));
            email.setBounds(60, 370, 150, 27);
            add(email);
			
            textField_6 = new JTextField();
            textField_6.setBounds(200, 370, 150, 27);
            add(textField_6);
            
            s = new JButton ("SUBMIT");
             s.addActionListener(this);
            s.setBounds(200, 420, 150, 30);
            s.setBackground(Color.BLACK);
            s.setForeground(Color.WHITE);
           
            add(s);
            
            
	
            JLabel AddPassengers = new JLabel("ADD EMPLOYEE DETAILS");
            AddPassengers.setForeground(Color.BLUE);
            AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
           AddPassengers.setBounds(450, 24, 442, 35);
            add(AddPassengers);
			
     
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
            Image i2 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(410,80,480,410);
            add(image);
            
             getContentPane().setForeground(Color.BLUE);
             getContentPane().setBackground(Color.WHITE);
            setBounds(350, 200, 850, 540);
            
	
          
            setVisible(true);
        }
        
            
       

        
        //Next.addActionListener(new ActionListener(){

 


                public void actionPerformed(ActionEvent ae){
                    String name =  tfname.getText();
            String age =  tfage.getText();
            String salary =  tfsalary.getText();
                    String phone = textField_4.getText();
                    String adhar = textField_5.getText();
                    String email = textField_6.getText();
                   
                    String gender = null;
                    if(name.equals("")){
                        JOptionPane.showMessageDialog(null, "Name should not be empty");
                        return;
                        
                                }
                    if(rbmale.isSelected()){
                        gender = "male";
                    
                    }else if(rbFemale.isSelected()){
                        gender = "female";
                    }

                            
                    String job = (String)cbjob.getSelectedItem();
                    
                    try {
                        Conn c = new Conn();
                        String query  = "INSERT INTO employee values( '"+name+"', '"+age+"', '"+gender+"','"+job+"', '"+salary+"', '"+phone+"','"+adhar+"', '"+email+"')";
                        
                        c.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(null,"Employee Added");
                        setVisible(false);
                    
                    } catch (Exception e) {
                        e.printStackTrace();
                        
        	    }
		}
             

	


    public static void main(String[] args){
    new AddEmployee();
    }   
}
