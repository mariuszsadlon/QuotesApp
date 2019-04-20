import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class frame implements ActionListener
{
    JButton button = new JButton("Next quote");
    quotes quote = new quotes();
    JFrame frame = new JFrame();
    JLabel label = new JLabel(quote.getQuote());
    
    
    
    public void frame()
    {
        
        button.addActionListener(this);
        
        JFrame a = new JFrame();
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, label);
        frame.setSize(500, 500);
        frame.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent zdarzenie)
    {
        
        String x = quote.getQuote();
        label.setText(x);
    }
}

