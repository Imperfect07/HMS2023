 package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

 

 
public class Dashboard extends JFrame implements ActionListener {
    
    Dashboard(){
        setBounds(0,0,1550,1000);
        setLayout(null);
        ImageIcon il=new ImageIcon(ClassLoader.getSystemResource( "icons/third.jpg"));
        Image i2 = il.getImage().getScaledInstance(1550,1000,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1550,1000);
        add(image);
        
        JMenuBar mb=new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb);
        
        
        JMenu hotel=new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.RED);
        mb.add(hotel);
        
        JMenuItem recep=new JMenuItem("RECEPTION");
        recep.addActionListener(this);
        hotel.add(recep);
        
         
        
        JMenu admin=new JMenu("ADMIN^");
        admin.setForeground(Color.BLUE);
        mb.add(admin);
        
         JMenuItem emp=new JMenuItem("ADD EMPLOYEE");
         emp.addActionListener(this);
         admin.add(emp);
         
        JMenuItem room=new JMenuItem("ADD ROOMS");
            room.addActionListener(this);
        admin.add(room);
        
        JMenuItem driv=new JMenuItem("ADD DRIVERS");
        driv.addActionListener(this);
        admin.add(driv);
        
       
      
         
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("ADD EMPLOYEE")){
            new AddEmployee();
            
        }else if(ae.getActionCommand().equals("ADD ROOMS")){
            new AddRooms();
            
        }else if(ae.getActionCommand().equals("ADD DRIVERS")){
            new AddDriver();
        }else if(ae.getActionCommand().equals("RECEPTION")){
            new Reception();
        }
    }
    
    public static void main(String[] args){
        new Dashboard();
    }
}
