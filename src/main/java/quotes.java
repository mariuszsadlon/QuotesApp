import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

public class quotes
{
    private ArrayList<String> quotesList = new ArrayList<String>();
    private String quote = null;
    private Random random = new Random();
    
    
    
    
    
    public  quotes() {
        try
    
        {
            URL url = getClass().getResource("quotesFile.txt");
            File quotesFile = new File(url.getPath());
            
            FileReader quotesFileReader = new FileReader(quotesFile);
            
            BufferedReader quotesBufferedReader = new BufferedReader(quotesFileReader);
        
            String quotesLine = null;
        
            while((quotesLine = quotesBufferedReader.readLine()) != null)
            {
                quotesList.add(quotesLine);
            
            }
            quotesBufferedReader.close();
        }
        catch(
            Exception zd)
    
        {
            zd.printStackTrace();
        
        }
    
        
        
        
    }
    public String getQuote() {
        
        int number = 0;
        
    
        number = random.nextInt(quotesList.size());
        
        quote = quotesList.get(number);
        
        return quote;
    }
}
