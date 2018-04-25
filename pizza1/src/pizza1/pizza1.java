
package pizza1;
import javax.swing.*;
import java.awt.*;
import static java.awt.BorderLayout.SOUTH;
import java.awt.event.*;

public class pizza1 extends JFrame implements ActionListener{
    
    JButton submit =new JButton ("submit");
JButton reset =new JButton ("reset");

JRadioButton water = new JRadioButton ("water", false);
JRadioButton sugar = new JRadioButton ("sugar", false);
JRadioButton flour = new JRadioButton ("flour", false);
JRadioButton egg = new JRadioButton ("egg", false);
JRadioButton oil = new JRadioButton ("oil", false);

JRadioButton chicken = new JRadioButton ("chicken", false);
JRadioButton meat = new JRadioButton ("meat", false);
JRadioButton vegetable = new JRadioButton ("vegetables", false);
ButtonGroup Group = new ButtonGroup();
    

      
      
      JCheckBox item1 = new JCheckBox("tomatoes");
      JCheckBox item2 = new JCheckBox("onion");
       JCheckBox item3 = new JCheckBox("corn");
       JCheckBox item4 = new JCheckBox("cheese");
      JCheckBox item5 = new JCheckBox("pepper");
       JCheckBox item6 = new JCheckBox("salts");
       
      JPanel pl = new JPanel();JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();JPanel p4 = new JPanel(); 
         Panel p = new Panel(); Panel p5 = new Panel();
         Panel p6 = new Panel(); Panel p7 = new Panel();
      
      pizza1(){
           setLayout(new FlowLayout());
        setTitle("Form1");
        setSize(650,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p.setLayout(new GridLayout(1,1));
p2.setLayout(new GridLayout (1,1));
    p3.setLayout(new GridLayout (1,3));
   p4.setLayout(new GridLayout (1,1));
    p5.setLayout(new GridLayout (0,1));
  p6.setLayout(new GridLayout (2,2));
  p7.setLayout(new GridLayout (1,0));
  add(p); 
  add(p2); 
  add(p3);add(p4);add(p5);add(p6);add(p7);
          
          
 p2.add(new JLabel(" Major ingredients:    "));         
p3.add(water);
p3.add(flour);
p3.add(sugar);
p3.add(egg);
p3.add(oil);
p4.add(new JLabel(" type of pizza: "));
p4.add(chicken);
p4.add(meat);
p4.add(vegetable);
Group.add(chicken);
Group.add(meat);
Group.add(vegetable);
p6.add(new JLabel(" select pizza ingredients:    "));
p6.add(item1); p6.add(item2);p6.add(item3); p6.add(item4); p6.add(item5);
p6.add(item6);
p7.add(submit);
p7.add(reset);
          submit.addActionListener(this);
reset.addActionListener(this);
setVisible(true);
      }
    public static void main(String[] args) {
       pizza1 form =new pizza1();
    }

    
    public void actionPerformed(ActionEvent e) {
        String pizzaa = " " ;
       String items= "water, egg, flour, oil, sugar, ";
        String typez= "" ;
        if(e.getSource()== submit){
           
            
            if (!(this.chicken.isSelected() || 
                this.meat.isSelected() ||  
                    this.vegetable.isSelected())){ JOptionPane.showMessageDialog(null,
        "select pizza type"); return; }
                     if (!(this.sugar.isSelected() && 
                this.flour.isSelected() &&  
                     
                this.water.isSelected())){
JOptionPane.showMessageDialog(null,
        "select all major ingredients"); return; }
          
   //Group.getSelection();
                if (chicken.isSelected())  typez += "chicken,  \n"; 
                if (vegetable.isSelected())  typez += "vegetable,  \n"; 
                if (meat.isSelected())  typez += "meat,  \n"; 
             
            
              if (item1.isSelected())  items += "tomatoes,  \n"; 
               if (item2.isSelected()) items += "onion,  \n";
                if (item3.isSelected()) items += "corn,  \n";
               if (item4.isSelected()) items += "cheese,  \n";
                if (item5.isSelected()) items += "pepper,  \n";
               if (item6.isSelected()) items += "salts,  \n";
                
                
            Process f2 = new Process();
             f2.setlist(items);
              f2.setlist2(typez); 
              dispose();
        }
        
        if (e.getSource()== reset){
            this.Group.clearSelection();
        
          water.setSelected(false);
           sugar.setSelected(false);
            flour.setSelected(false);
            Group.clearSelection();
            
 item2.setSelected(false); item1.setSelected(false); item3.setSelected(false);
  item4.setSelected(false); item5.setSelected(false); 
  item6.setSelected(false);
  
        
    
    }
   
}
}
