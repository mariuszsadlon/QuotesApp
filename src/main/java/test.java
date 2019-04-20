import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;



public class test
{
   
    quotes quote = new quotes();
    JFrame frame = new JFrame();
    
    
    
    public void frame()
    {
        JTextArea area = new JTextArea(quote.getQuote());
        
        area.setBounds(10,30,200,200);
        area.setWrapStyleWord(true);
        area.setLineWrap(true);
        area.setOpaque(false);
        area.setEditable(false);
        area.setFocusable(false);
        
        frame.add(area);
        
        
        
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(500, 500);
        frame.setVisible(true);
        
    }
    
    
    
}

