/*package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

         
public class HotelManagementSystem extends JFrame  {
 
 
    HotelManagementSystem(){
      //  setSize(1366,700);
      //  setLocation(100,100);
      setBounds(100,100,1044,693);
        setLayout(null);
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource( "icons/first.jpeg"));
         JLabel image = new JLabel(il);
         image.setBounds(00,00,1044,693);
         add(image);
         
         JLabel text = new JLabel( "Hotel Management System");
        text.setBounds(20,450,800,300);
        text.setForeground( Color.white);
          text.setFont(new Font("serif",Font.PLAIN,55));
       image.add(text);
       
        
        JButton next=new JButton("NEXT");
        next.setBounds(850,450,150,50);
        next.setBackground(Color.WHITE);
        next.setForeground( Color.RED);
       // next.addActionListener(this);
        next.setFont(new Font("serif",Font.PLAIN,24));
        image.add(next);
        
        setVisible(true);
        
     }
    
   // public void actionPerformed(ActionEvent ae){
    //    setVisible(false);
    //    new Login();
   // }
     
    public static void main(String[] args) {
         new HotelManagementSystem();
    }
    
}*/
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

         
public class HotelManagementSystem extends JFrame implements ActionListener {
 
 
    HotelManagementSystem(){
        setSize(1366,700);
        setVisible(true);
        ImageIcon il=new ImageIcon(ClassLoader.getSystemResource( "icons/first.jpeg"));
        JLabel image=new JLabel(il);
        add(image);
        
        JButton next=new JButton("NEXT");
        next.setBounds(1150,550,150,50);
        next.setBackground(Color.WHITE);
        next.setForeground( Color.RED);
        next.addActionListener(this);
        next.setFont(new Font("serif",Font.PLAIN,24));
        image.add(next);
        
        setVisible(true);
     }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
     
    public static void main(String[] args) {
         new HotelManagementSystem();
    }
    
}
