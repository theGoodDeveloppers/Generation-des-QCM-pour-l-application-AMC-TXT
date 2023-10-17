
package qcmapp;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DisplayQuestions extends JFrame {
    DisplayQuestions(ArrayList<String> questions, ArrayList<ArrayList<String>> answers, ArrayList<ButtonGroup> answerGroups) {
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        for (int i = 0; i < questions.size(); i++) {
            JLabel questionLabel = new JLabel("Question " + (i + 1) + ": " + questions.get(i));
            contentPanel.add(questionLabel);

            ArrayList<String> answerList = answers.get(i);
            ButtonGroup group = answerGroups.get(i);

            for (int j = 0; j < answerList.size(); j++) {
                JPanel answerPanel = new JPanel();
                JCheckBox checkBox = new JCheckBox();
                answerPanel.add(checkBox);
                answerPanel.add(new JLabel(answerList.get(j)));
                group.add(checkBox);
                contentPanel.add(answerPanel);
            }

            contentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        }

        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setContentPane(scrollPane);

        setTitle("Display Questions and Answers");
       setSize(810,590);
       setLocation(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}