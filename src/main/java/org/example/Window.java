package org.example;

import javax.swing.*;

public class Window {


    JFrame Wmain = new JFrame();
    JButton BPchouseFile = new JButton("couse file");
    JLabel TXpath = new JLabel();


    Window(String path){

        BPchouseFile.setFocusable(false);
        BPchouseFile.setBounds(20, 390,100, 50);

        TXpath.setFocusable(false);
        TXpath.setBounds(130, 390, 1000, 50);

        Wmain.add(TXpath);
        Wmain.add(BPchouseFile);
        Wmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Wmain.setSize(500, 500);
        Wmain.setLayout(null);
        Wmain.setVisible(true);


        changeText(path, TXpath);






    }



    void changeText(String text, JLabel label){
        label.setText(text);
    }


}
