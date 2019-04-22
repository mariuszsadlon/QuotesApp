import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;


public class frame implements ActionListener
{
    private JFrame frame = new JFrame();
    
    private quotes quote = new quotes();
    
    private JTextArea area = new JTextArea(quote.getQuote());
    
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
        
        Font font = new Font("Helvetica", Font.ITALIC, 20);
        area.setFont(font);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, area);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent zdarzenie)
    {
        String x = quote.getQuote();
        area.setText(x);
    }
}

