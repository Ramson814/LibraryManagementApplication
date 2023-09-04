 
package librarymanagementapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Admin extends JFrame implements ActionListener {
    JFrame j;
    Admin(){
      // getContentPane().setBackground(Color.WHITE);
       //setLayout(null);
      setLocationRelativeTo(null);
        
       JPanel pan1=new JPanel();
       pan1.setBounds(0,0,700,60);
       pan1.setBackground(Color.BLUE);
       add(pan1);
       
       JPanel pan2=new JPanel();
       pan1.setBounds(0,60,300,650);
       pan1.setBackground(Color.BLACK);
       add(pan2);
       
        //pack();
        setSize(700,700);
        setLocation(300,20);
        setResizable(false);
        setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent ae){
        
    }
     
    public static void main(String []args){
       new Admin(); 
    }
    
   
    
}
