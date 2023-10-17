package qcmapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class login extends JFrame implements ActionListener{
    JButton log;
    JTextField tfname,temail;
   login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons\\qN.gif")); 
     JLabel image =new JLabel(i1);
     image.setBounds(250,-30,300,300);
     add(image);
    
     
     JLabel name= new JLabel ("Enter your name");
     name.setBounds(250, 290, 300, 20);
     name.setFont(new Font ("arial",Font.BOLD,14));
    
     add(name );
     
      tfname= new JTextField();
     tfname.setBounds(250,320,300,30);
     tfname.setFont(new Font ("arial",Font.BOLD,14));
     add(tfname);
     
     JLabel email= new JLabel ("Enter your email");
     email.setBounds(250, 370, 300, 20);
     email.setFont(new Font ("arial",Font.BOLD,14));
   
     add(email );
     
      temail= new JTextField();
     temail.setBounds(250,400,300,30);
     temail.setFont(new Font ("arial",Font.BOLD,14));
     add(temail);

     
      log= new JButton("Login");
     log.setBounds(330,470,140,30);
     log.setFont(new Font ("arial",Font.BOLD,14));
     log.setBackground(new Color(16, 185, 16));
     log.setForeground(Color.WHITE);
     log.addActionListener(this);
     add(log);
     
     setTitle("Generation des QCM");
setIconImage(Toolkit.getDefaultToolkit().getImage("icons\\icons8-question-mark-100.png"));
       setSize(810,590);
       setLocation(200,100);
       setVisible(true);
      
   }   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==log){
            String name=tfname.getText();
            setVisible(false);
            new quiz(name);
        }
        
    }
    public static void main(String[] args) {
        new login();
        
        
   

    }
    
}