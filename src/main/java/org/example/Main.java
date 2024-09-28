package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); //делаем русский

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //Change a style of window

        JFileChooser fileChooser = new JFileChooser(); //Create a window
        fileChooser.showOpenDialog(null); //Open the window
        File file = fileChooser.getSelectedFile();
        String path = file.getPath();
        System.out.println(path);



        new Window(path);
    }
}
