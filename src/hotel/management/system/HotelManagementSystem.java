package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

         
public class HotelManagementSystem extends JFrame implements ActionListener {
 
 
    HotelManagementSystem(){
        setSize(1366,700);
        setVisible(true);
        ImageIcon il=new ImageIcon(ClassLoader.getSystemResource( "icons/firstpg.jpg"));
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
