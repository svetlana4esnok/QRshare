package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {


        String bp = new Chouse().Chouse();


        new Window(bp);

    }
}
