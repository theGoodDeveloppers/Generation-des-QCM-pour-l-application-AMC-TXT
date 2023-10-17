package qcmapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CreateQuestion extends JFrame implements ActionListener {
    JTextField questionField, answerField;
    JButton ajouterButton, addAnswerButton, afficherButton;
    ArrayList<String> questionsList = new ArrayList<>();
    ArrayList<ArrayList<String>> answersList = new ArrayList<>();
    ArrayList<ButtonGroup> answerGroups = new ArrayList<>();

    int questionCount = 1;

    CreateQuestion() {
        
        
                setLayout(null);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons\\jjj.jpg")); 
     JLabel image =new JLabel(i1);
     image.setBounds(80,10,700,340);
     add(image);
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel questionLabel = new JLabel("Question:");
        questionLabel.setBounds(70, 300, 100, 30);
        add(questionLabel);

        questionField = new JTextField();
        questionField.setBounds(190, 300, 400, 30);
        add(questionField);

        JLabel answerLabel = new JLabel("Answer:");
        answerLabel.setBounds(70, 350, 100, 30);
        add(answerLabel);

        answerField = new JTextField();
        answerField.setBounds(190, 350, 400, 30);
        add(answerField);

        ajouterButton = new JButton("Add");
        ajouterButton.setBounds(190, 430, 100, 30);
           ajouterButton.addActionListener(this);
         ajouterButton.setFont(new Font ("arial",Font.BOLD,12));
     ajouterButton.setBackground(new Color(16, 185, 12));
     ajouterButton.setForeground(Color.WHITE);
     add(ajouterButton);

        addAnswerButton = new JButton("Add Answer");
        addAnswerButton.setBounds(320, 430, 150, 30);
        addAnswerButton.addActionListener(this);
         addAnswerButton.setFont(new Font ("arial",Font.BOLD,12));
     addAnswerButton.setBackground(new Color(16, 185, 12));
     addAnswerButton.setForeground(Color.WHITE);
     add(addAnswerButton);

        afficherButton = new JButton("Display");
        afficherButton.setBounds(490, 430, 100, 30);
       afficherButton.addActionListener(this);
         afficherButton.setFont(new Font ("arial",Font.BOLD,12));
     afficherButton.setBackground(new Color(16, 185, 12));
     afficherButton.setForeground(Color.WHITE);
     add(afficherButton);
       

        setTitle("Create Question");
       setSize(810,590);
       setLocation(200,100);
       setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == ajouterButton) {
        String question = questionField.getText();
        questionsList.add(question);
        answersList.add(new ArrayList<>());
        answerGroups.add(new ButtonGroup());
        answerField.setText("");
        questionField.setText("");
        questionCount++;
        
    } else if (ae.getSource() == addAnswerButton || ae.getSource() == afficherButton) {
        ArrayList<String> currentAnswers;
        if (answersList.isEmpty()) {
            currentAnswers = new ArrayList<>();
            answersList.add(currentAnswers);
            answerGroups.add(new ButtonGroup());
        } else {
            currentAnswers = answersList.get(answersList.size() - 1);
        }
        currentAnswers.add(answerField.getText());
        answerField.setText("");
    }

    if (ae.getSource() == afficherButton) {
         setVisible(false);
        new DisplayQuestions(questionsList, answersList, answerGroups);
    }
}

    public static void main(String[] args) {
        new CreateQuestion();
    }
}