package be.heh.domain;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Couleur implements ActionListener 
{
    JLabel jlabel;
    JPanel jpanl;
    Color  cl;
    JFrame fr;
    public Couleur(JLabel l,JPanel pnl, Color tmp)
    {
        jlabel = l;
        jpanl = pnl;
        cl = tmp;
        
    }
    public Couleur(JLabel l,JPanel pnl, Color tmp,JFrame j)
    {
        jlabel = l;
        jpanl = pnl;
        cl = tmp;
        fr = j;

    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        JButton btnsource=(JButton)e.getSource(); //Renvoie et cast avec le type de l'objet
        //jlabel.setText("Bleu"); Si pas deux écouteur alors cette fonction est bonne
        jlabel.setText(btnsource.getText());
        jpanl.setBackground(cl);
        fr.setTitle(btnsource.getText());
        

        

    }

}