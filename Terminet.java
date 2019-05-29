import javax.swing.*;
import java.awt.*;

public class Terminet{

   public static int t;
   
   public Terminet(int a) {
   
         Database d = new Database();

         Terminet.t = a-1;
         
         JOptionPane.showMessageDialog(null,"Emri dhe Mbiemri i Pacienti: "+  d.EmriArray[t] + "\n Numri/Email: " + d.NumriArray[t] + "\n Data: "+ d.DitaArray[t]+ "\n Ora: " + d.OraArray[t]);
         
         new Hyrja();
    
    
   
   
   }
   }