
package pizza1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 



public class Process extends JFrame implements ActionListener {
    JLabel list = new JLabel("selected ingredients: ");
    JLabel list2 = new JLabel();
JButton Continue =new JButton ("Submit");
JButton Return =new JButton ("Return"); 
JPanel p2 = new JPanel();JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    ImageIcon img1 = new ImageIcon("C:\\chick.png");
JLabel pic1 = new JLabel();
ImageIcon img2 = new ImageIcon("C:\\Mveg.png");
JLabel pic2 = new JLabel();
ImageIcon img3 = new ImageIcon("C:\\meat.png");
JLabel pic3 = new JLabel();
    
    Process(){
         setLayout(new FlowLayout(1));
        setTitle("Form2");
        setSize(400,350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
        pic1.setIcon(img1);
        pic2.setIcon(img2);
        pic3.setIcon(img3);
        //pic1.setIcon(image1);
        //add(pic1);  
   add(p2); 
   add(p3);
   add(p4);
   p2.add(list);
  p2.add(list2); 
   
add(Continue);
add(Return);

Continue.addActionListener(this);
Return.addActionListener(this);
setVisible(true); }
    
     public void actionPerformed(ActionEvent e) {
     }
         
         void setlist(String items) { 
             p2.add(list);
        this.list.setText(items);}
         
         void setlist2(String typez){
        
    
        
             if   (typez== "chicken,  \n" )
        {
            JLabel ck = new JLabel("You seem to have ordered a Chicken pizza: ");
            p3.add(ck);
        p4.add(pic1);
        }
             
             else if ( typez== "vegetable,  \n" )
        {
            JLabel veg = new JLabel("You seem to have ordered a vegetarian pizza: ");
            p3.add(veg);
        p4.add(pic2);
        }
             
             else if   (typez== "meat,  \n" )
        {
            JLabel meat = new JLabel("You seem to have ordered a Meat pizza: ");
            p3.add(meat);
        p4.add(pic3);
        }
    }
     

   
}
