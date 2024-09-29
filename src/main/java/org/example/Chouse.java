package org.example;


import javax.swing.*;
import java.io.File;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Chouse {

    public String Chouse() throws Exception { // добавьте public
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); // делаем русский

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // меняем стиль окна

        JFileChooser fileChooser = new JFileChooser(); // создаем окно
        fileChooser.showOpenDialog(null);  // открываем окно
        File file = fileChooser.getSelectedFile();

        String path = file.getPath();
        System.out.println(path);
        return path;
    }
}

