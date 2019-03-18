package be.heh.domain;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame
{
    public Window()
    {
        this.setTitle("Test Java Event");
        JLabel lb2 = new JLabel();
        this.addWindowListener(new EventWindow(lb2));
        this.setVisible(true);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pnl = new JPanel();
        pnl.add(lb2);
        pnl.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setContentPane(pnl);
        JButton btn1 = new JButton("Bleu");
        JButton btn2 = new JButton("Rouge");
        JLabel lbl = new JLabel("-----------------");
        pnl.add(btn1);
        pnl.add(lbl);
        pnl.add(btn2);
        btn1.addActionListener(new Couleur(lbl,pnl,Color.BLUE,this));// On rajoute une liste d'action sur le sujet qui est le button et on spécifie ce que l'on veut modifier
        btn2.addActionListener(new Couleur(lbl,pnl,Color.RED,this)); // On rajoute une liste d'action sur le sujet qui est le button et on spécifie ce que l'on veut modifier

    }

    
}