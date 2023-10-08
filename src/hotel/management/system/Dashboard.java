 package hotel.management.system;

 import  javax.swing.*;
 import java.awt.*;
 
public class Dashboard extends JFrame {
    
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
        hotel.add(recep);
        
         
        
        JMenu admin=new JMenu("ADMIN");
        admin.setForeground(Color.BLUE);
        mb.add(admin);
        
        JMenuItem room=new JMenuItem("ADD ROOMS");
        admin.add(room);
        
        JMenuItem driv=new JMenuItem("ADD DRIVERS");
        admin.add(driv);
        
        JMenuItem emp=new JMenuItem("ADD EMPLOYEE");
        admin.add(emp);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Dashboard();
    }
}
