/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.presentation.components;

import javax.swing.JTextArea;

/**
 *
 * @author MSI
 */
public class TextComponent extends JTextArea {
    public TextComponent() {
        this.setEditable(false);
        this.setCursor(null);
        this.setOpaque(false);
        this.setFocusable(false);
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setAutoscrolls(false);
    }
}
