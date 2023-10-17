package qcmapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class quiz  extends JFrame  implements ActionListener{
    String name;
    JButton create,inswer;
    quiz( String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading= new JLabel ("welcome "+ name + " to Generate Q & A");
     heading.setBounds(200, 60, 600, 30);
     heading.setFont(new Font ("arial",Font.BOLD,28));
     heading.setForeground(new Color(16, 185, 16));
     add(heading);
     
      
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons\\jjj.jpg")); 
     JLabel image =new JLabel(i1);
     image.setBounds(70,40,700,340);
     add(image);
    
     
     create= new JButton("create Q & A");
     create.setBounds(320,370,200,35);
     create.setFont(new Font ("arial",Font.BOLD,14));
     create.setBackground(new Color(16, 185, 16));
     create.setForeground(Color.WHITE);
     create.addActionListener(this);
     add(create);
     
     
     
       setTitle("Generation des QCM");
setIconImage(Toolkit.getDefaultToolkit().getImage("icons\\jjj.jpg"));
       setSize(810,590);
       setLocation(200,100);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==create){
            setVisible(false);
           new CreateQuestion();
            
        }
    }
    public static void main(String[] args){
      new quiz("User");  
        
    }
}