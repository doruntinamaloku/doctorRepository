import javax.swing.*;
import java.awt.*;
import java.util.*;

public class TerminIRi{

    
   private String emri;
   private String numri;
   private String data;
   private String ora;


   public TerminIRi(){
   
   
      Database d=new Database();
   
   
      String emri= JOptionPane.showInputDialog("Emri dhe mbiemri i pacientit");
      if(emri==null) {System.exit(0);}
      else
         d.setEmri(emri);
              
     
     
      String numri=JOptionPane.showInputDialog("Nr. Tel/Email Adresa e pacientit");
      if(numri==null) {System.exit(0);}
      else
         d.setNumri(numri);
      
     
      if (numri.length()<9)
      {JOptionPane.showMessageDialog(null,"Ju lutem shkrunani mire nr. tel ose email");
         numri = JOptionPane.showInputDialog("Nr. Tel/Email Adresa e pacientit");
         d.setNumri(numri);}
      
              
   
      String[] days = { "E Hene", "E Marte", "E Merkure", "E Enjte", "E Premte" };
      String dita = (String) JOptionPane.showInputDialog(null, "Zgjedh diten...",
                                        "Java", JOptionPane.QUESTION_MESSAGE, null, 
                                                          days,  days[0]);
 
    
    
      String[] hours = { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00" };
      String ora = (String) JOptionPane.showInputDialog(null, "Zgjedh oren...",
                                       "Ora", JOptionPane.QUESTION_MESSAGE, null,
                                                                hours, hours[0]);  
    
              
      
      boolean test = true;
      while (test)   {
      for (int i=0;i<d.getTerminet();i++)
      {
              
         if(dita.equals(d.DitaArray[i]) && ora.equals(d.OraArray[i]))
         {
            JOptionPane.showMessageDialog(null,"Ky termin eshte i rezervuar");
            dita = (String) JOptionPane.showInputDialog(null, "Zgjedh diten...",
                                        "Dita", JOptionPane.QUESTION_MESSAGE, null, 
                                                          days,  days[0]);
            ora = (String) JOptionPane.showInputDialog(null, "Zgjedh oren...",
                                       "Ora", JOptionPane.QUESTION_MESSAGE, null, 
                                                            hours, hours[0]);                                               
         }
         
         else{
            JOptionPane.showMessageDialog(null,"Termini u rezervua");
           test = false;
         }
      }
      }
 
      if(dita==null) {System.exit(0);}
      else                                                    
         d.setDita(dita);
      
   
      if(ora==null) {System.exit(0);}
      else
         d.setOra(ora);
              
              
   

             
      new Hyrja();
   
   }
    
   
}
