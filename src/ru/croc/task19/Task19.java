package ru.croc.task19;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

class Task19 implements ActionListener {
    JWindow w;

    Task19() {
        w = new JWindow();

        w.setBackground(new Color(0, 0, 0, 0));

        JLabel helloWorld = new JLabel("Hello world!");
        JLabel crocLove = new JLabel("Den, Jenya, Alice <3");

        JButton love = new JButton();

        love.setIcon(new ImageIcon("src\\ru\\croc\\task19\\heart.gif"));

        love.addActionListener(this);
        try {
            UIManager.setLookAndFeel(UIManager.
                    getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        JPanel p = new JPanel() {
            public void paintComponent(Graphics g)
            {

                g.setColor(new Color(100, 100, 240));
                g.fillRoundRect(0, 0, 200, 120, 20, 20);

                g.setColor(new Color(10, 10, 255));
                g.drawRoundRect(0, 0, 200, 120, 20, 20);
            }
        };

        Font f = new Font("BOLD", Font.BOLD, 14);

        helloWorld.setFont(f);

        p.add(helloWorld);
        p.add(crocLove);
        p.add(love);
        w.add(p);

        w.setSize(200, 200);
        w.setLocation(300, 300);
        w.setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        w.dispose();
    }

    public static void main(String[] args) throws IOException {
        new Task19();
    }
}