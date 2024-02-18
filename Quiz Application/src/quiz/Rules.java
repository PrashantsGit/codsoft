package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to CodeQuizPro");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>" +
                        "<head>" +
                        "<style>" +
                        "body { font-family: Arial, sans-serif; }" +
                        "</style>" +
                        "</head>" +
                        "<body>" +
                        "<header>" +
                        "<h1>Quiz Application</h1>" +
                        "</header>" +
                        "<section id=\"rules\">" +
                        "<h2>Quiz Rules</h2>" +
                        "<p>Welcome to the quiz! Before you start answering questions, please read and follow these rules:</p>"
                        +
                        "<ol>" +
                        "<li>Each question has a specified time limit. Make sure to answer within the given time.</li>"
                        +
                        "<li>Once you submit an answer, you cannot go back to change it. Think carefully before submitting.</li>"
                        +
                        "<li>Choose the most appropriate answer for each question. Only one answer is correct.</li>" +
                        "<li>Do not refresh the page during the quiz. It may result in data loss or disqualification.</li>"
                        +
                        "<li>Respect the time and fairness of the quiz. Avoid using external resources or assistance.</li>"
                        +
                        "<li>Complete the quiz in one sitting. If you leave the page, your progress may be lost.</li>" +
                        "</ol>" +
                        "</section>" +
                        "<section id=\"quiz\">" +
                        "<!-- Your quiz questions and options will go here -->" +
                        "</section>" +
                        "<footer>" +
                        "<p>&copy; 2024 Quiz Application. All rights reserved.</p>" +
                        "</footer>" +
                        "</body>" +
                        "</html>");
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
