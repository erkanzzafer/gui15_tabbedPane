/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui15_tabbedpane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author zafer
 */
public class Gui15_tabbedPane {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Örneği");

        JLabel lb1 = new JLabel("ilk alan");
        JPanel p1 = new JPanel();
        p1.add(lb1);

        JLabel lb2 = new JLabel("ikinci alan");
        JPanel p2 = new JPanel();
        p2.add(lb2);

        JLabel lb3 = new JLabel("Üçüncü alan");
        JPanel p3 = new JPanel();
        p3.add(lb3);

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);
        tp.add("ilk", p1);
        tp.add("ikinci", p2);
        tp.add("üçüncü", p3);

        frame.add(tp);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
