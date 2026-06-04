package com.mycompany.poo.app;

import com.mycompany.poo.ui.MainFrame;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}