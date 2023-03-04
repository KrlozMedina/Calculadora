package krlozmedina;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new Calculator();
            frame.setSize(350, 200);
            frame.setVisible(true);
        });
    }
}