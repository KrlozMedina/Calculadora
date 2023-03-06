package krlozmedina;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new Menu();
            frame.setSize(400, 250);
            frame.setVisible(true);
        });
    }
}