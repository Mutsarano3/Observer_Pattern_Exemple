package be.heh.domain;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventWindow implements WindowListener 
{
    JLabel jlab;
    public EventWindow(JLabel l)
    {
        jlab = l;
    }

    @Override
    public void windowOpened(WindowEvent e) 
    {
        JFrame fr = (JFrame)e.getSource();
        jlab.setText(fr.getTitle());

    }

    @Override
    public void windowClosing(WindowEvent e) 
    {

    }

    @Override
    public void windowClosed(WindowEvent e) 
    {

    }

    @Override
    public void windowIconified(WindowEvent e) 
    {

    }

    @Override
    public void windowDeiconified(WindowEvent e) 
    {

    }

    @Override
    public void windowActivated(WindowEvent e) 
    {

    }

    @Override
    public void windowDeactivated(WindowEvent e) 
    {

    }

}