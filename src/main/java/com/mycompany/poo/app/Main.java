package com.mycompany.poo.app;

import com.mycompany.poo.ui.OriginFrame;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new OriginFrame().setVisible(true);
        });
    }
}