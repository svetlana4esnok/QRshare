package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {

    ImageIcon IMqr = new ImageIcon("java/org/example/www.jpg");
    JFrame Wmain = new JFrame();
    JButton BPchouseFile = new JButton("Choose File");
    JLabel TXpath = new JLabel();
    JLabel TXqr = new JLabel(IMqr);

    Window(String path) {

        // Set button style
        BPchouseFile.setFocusable(false);
        BPchouseFile.setBounds(20, 390, 100, 50);
        BPchouseFile.setRolloverEnabled(false);
        BPchouseFile.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2)); // Green border
        BPchouseFile.setBackground(new Color(0, 0, 0, 180)); // Dark background
        BPchouseFile.setForeground(Color.GRAY); // Green text
        BPchouseFile.setFont(new Font("Courier New", Font.BOLD, 14)); // Monospaced font

        // Set label style
        TXpath.setFocusable(false);
        TXpath.setBounds(20, 450, 460, 30);
        TXpath.setForeground(Color.GRAY);
        TXpath.setFont(new Font("Courier New", Font.PLAIN, 12)); // Monospaced font
        TXpath.setOpaque(true);
        TXpath.setBackground(new Color(0, 0, 0, 150)); // Semi-transparent background

        // QR label settings
        TXqr.setBounds(20, 20, 100, 100); // Adjust size for better fit

        // Frame settings
        Wmain.setUndecorated(false);
        Wmain.getContentPane().setBackground(new Color(20, 20, 20)); // Dark background for the window
        Wmain.getContentPane().add(TXqr);
        Wmain.add(TXpath);
        Wmain.add(BPchouseFile);
        Wmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Wmain.setSize(500, 530);
        Wmain.setLayout(null);
        Wmain.setVisible(true);
        Wmain.setLocationRelativeTo(null);
        Wmain.setResizable(false);

        changeText(path, TXpath);

        // Button action listener
        BPchouseFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String bp = new Chouse().Chouse();

                    // Check if bp is not null
                    if (bp != null) {
                        changeText(bp, TXpath);
                    }

                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    // Change text on label
    void changeText(String text, JLabel label) {
        label.setText(text);
    }
}
