import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;



public class frame implements ActionListener
{
    JFrame frame = new JFrame();
    
    quotes quote = new quotes();
   
    //JLabel label = new JLabel(quote.getQuote(), JLabel.CENTER);
    
    JTextArea area = new JTextArea(quote.getQuote());
    
    
    
    
    public void frame()
    {
        JButton button = new JButton("Next quote");
        
        button.addActionListener(this);
    
        area.setBounds(10,30,100,100);
        area.setWrapStyleWord(true);
        area.setLineWrap(true);
        area.setOpaque(false);
        area.setEditable(false);
        area.setFocusable(false);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, area);
        frame.setSize(300, 300);
        frame.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent zdarzenie)
    {
        String x = quote.getQuote();
        area.setText(x);
    }
    
    
}

